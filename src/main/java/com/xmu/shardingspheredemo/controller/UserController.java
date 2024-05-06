package com.xmu.shardingspheredemo.controller;

import cn.hutool.core.bean.BeanUtil;
import com.xmu.shardingspheredemo.domain.dto.UserDto;
import com.xmu.shardingspheredemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/register")
    public ResponseEntity<HttpStatus> register(@Validated @RequestBody UserDto userDto) {
        userService.register(userDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        UserDto userDto = BeanUtil.copyProperties(userService.getById(id), UserDto.class);
        return ResponseEntity.ok(userDto);
    }
}
