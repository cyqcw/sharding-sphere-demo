package com.xmu.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.domain.OrderItem;
import com.xmu.shardingspheredemo.mapper.OrderItemMapper;
import com.xmu.shardingspheredemo.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {
}
