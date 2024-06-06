package com.xmu.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.models.Order;
import com.xmu.shardingspheredemo.mapper.OrderMapper;
import com.xmu.shardingspheredemo.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public Order saveOrder(Order order) {
        baseMapper.insert(order);
        return order;
    }
    @Override
    public Order getByUserIdAndOrderNo(Long userId, String orderNo) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<Order>()
                .eq("user_id", userId).eq("order_no", orderNo)
                .last("limit 1");
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public void removeByUserIdAndOrderNo(Long userId, String orderNo) {
        QueryWrapper<Order> queryWrapper = new QueryWrapper<Order>()
                .eq("user_id", userId).eq("order_no", orderNo)
                .last("limit 1");
        baseMapper.delete(queryWrapper);
    }
}
