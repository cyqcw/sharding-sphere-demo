package com.xmu.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmu.shardingspheredemo.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
