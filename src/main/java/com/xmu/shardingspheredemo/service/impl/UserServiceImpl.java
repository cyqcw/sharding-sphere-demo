package com.xmu.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.domain.User;
import com.xmu.shardingspheredemo.mapper.UserMapper;
import com.xmu.shardingspheredemo.request.UserDto;
import com.xmu.shardingspheredemo.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public void register(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        user.setCreateTime(LocalDateTime.now()).setUpdateTime(LocalDateTime.now());
        this.baseMapper.insert(user);
    }
}
