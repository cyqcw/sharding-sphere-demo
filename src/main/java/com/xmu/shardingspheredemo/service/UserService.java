package com.xmu.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmu.shardingspheredemo.models.User;
import com.xmu.shardingspheredemo.models.dto.UserDto;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
public interface UserService extends IService<User> {
    void register(UserDto userDto);
}
