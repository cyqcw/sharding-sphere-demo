package com.xmu.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.domain.Order;
import com.xmu.shardingspheredemo.mapper.OrderMapper;
import com.xmu.shardingspheredemo.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
}
