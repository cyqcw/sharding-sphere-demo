package com.xmu.shardingspheredemo;

import com.xmu.shardingspheredemo.domain.OrderItem;
import com.xmu.shardingspheredemo.domain.dto.OrderVo;
import com.xmu.shardingspheredemo.mapper.DictMapper;
import com.xmu.shardingspheredemo.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import com.xmu.shardingspheredemo.domain.Dict;
import java.util.List;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@SpringBootTest
public class TestUtils {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DictMapper dictMapper;
    @Test
    void test() {
        List<OrderVo> orderItems = orderMapper.getOrderAmount();
        orderItems.stream().forEach(System.out::println);
    }

    @Test
    void testDict() {
        Dict dict = new Dict();
        dict.setDictType("用户添加");
        dictMapper.insert(dict);
    }

    @Test
    void testDict2() {
        System.out.println(dictMapper.selectById(1796062988489744386L));
    }
}
