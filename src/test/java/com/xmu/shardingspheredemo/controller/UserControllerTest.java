package com.xmu.shardingspheredemo.controller;

import com.xmu.shardingspheredemo.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    void register() {
        System.out.println(userMapper.selectById(1));
    }
}
