package com.xmu.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmu.shardingspheredemo.domain.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {
}
