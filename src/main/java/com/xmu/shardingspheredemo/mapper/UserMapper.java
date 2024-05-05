package com.xmu.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmu.shardingspheredemo.domain.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author：HeGu
 * @date：2024/5/5
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
