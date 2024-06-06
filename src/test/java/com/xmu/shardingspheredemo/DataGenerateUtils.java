package com.xmu.shardingspheredemo;

import com.xmu.shardingspheredemo.mapper.OrderMapper;
import com.xmu.shardingspheredemo.service.UserService;
import com.xmu.shardingspheredemo.models.dto.UserDto;
import com.xmu.shardingspheredemo.models.Order;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Date;

/**
 * @author：HeGu
 * @date：2024/6/4
 */
@SpringBootTest
public class DataGenerateUtils {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserService userService;

    private static final String[] FIRST_NAMES = {"John", "Jane", "Alex", "Chris", "Taylor", "Jordan", "Pat", "Morgan"};
    private static final String[] LAST_NAMES = {"Smith", "Doe", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore"};
    private static final Random RANDOM = new Random();
    private static final Set<String> GENERATED_USERNAMES = new HashSet<>();

    private static final AtomicLong ORDER_NUMBER_COUNTER = new AtomicLong(1);

    /**
     * Generate a unique username
     * @return a unique username
     */
    private static String generateUniqueUsername() {
        String username;
        do {
            username = FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)] +
                    LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)] +
                    RANDOM.nextInt(1000); // Append random number to ensure uniqueness
        } while (GENERATED_USERNAMES.contains(username));
        GENERATED_USERNAMES.add(username);
        return username;
    }

    /**
     * Generate a unique user
     * @return
     */
    public static UserDto generateUniqueUser() {
        String name = generateUniqueUsername();
        String sex = RANDOM.nextBoolean() ? "Male" : "Female";
        Integer age = RANDOM.nextInt(60) + 18; // Age between 18 and 77
        return new UserDto(name, sex, age);
    }

    /**
     * 生成指定数量的User到数据库中
     * @return
     */
    @Test
    public void generateUsers() {
        long startTime = System.currentTimeMillis();

        int count = 10000;
        for (int i = 0; i < count; i++) {
            UserDto user = generateUniqueUser();
            userService.register(user);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("generateUsers method execution time: " + duration + " ms");
    }

    /**
     * 根据当前时间生成订单号
     * @return
     */
    public static String generateOrderNo() {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        long sequenceNumber = ORDER_NUMBER_COUNTER.getAndIncrement();
        return String.format("SJO%s%013d", timestamp, sequenceNumber);
    }

    /**
     * 根据userId和amount生成订单
     * @param userId
     * @param amount
     * @return
     */
    public Order createOrder(Long userId, Integer amount) {
        // Create a new order object with default status
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus(0); // Assuming 0 is the default status
        order.setAmount(amount);
        // Generate the order number
        String orderNo = generateOrderNo();
        order.setOrderNo(orderNo);
        return order;
    }

    @Test
    public void saveOrderToDatabase() {
        long startTime = System.currentTimeMillis();

        int count = 40000;
        for (int i = 0; i < count; i++) {
            Long userId = (long) RANDOM.nextInt(10000) + 1; // User ID between 1 and 10000
            Integer amount = RANDOM.nextInt(1000) + 1; // Amount between 1 and 1000
            Order order = createOrder(userId, amount);
            orderMapper.insert(order);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("saveOrderToDatabase method execution time: " + duration + " ms");
    }
}
