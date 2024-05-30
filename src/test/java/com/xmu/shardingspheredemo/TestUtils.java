package com.xmu.shardingspheredemo;

import com.xmu.shardingspheredemo.domain.OrderItem;
import com.xmu.shardingspheredemo.domain.dto.OrderVo;
import com.xmu.shardingspheredemo.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@SpringBootTest
public class TestUtils {
    @Autowired
    private OrderMapper orderMapper;
    @Test
    void test() {
        List<OrderVo> orderItems = orderMapper.getOrderAmount();
        orderItems.stream().forEach(System.out::println);
    }
}
