package com.xmu.shardingspheredemo.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.models.User;
import com.xmu.shardingspheredemo.mapper.UserMapper;
import com.xmu.shardingspheredemo.models.dto.UserDto;
import com.xmu.shardingspheredemo.service.UserService;
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
        User user = BeanUtil.copyProperties(userDto, User.class).setStatus(1);
        user.setCreateTime(LocalDateTime.now()).setUpdateTime(LocalDateTime.now());
        this.baseMapper.insert(user);
    }
}
