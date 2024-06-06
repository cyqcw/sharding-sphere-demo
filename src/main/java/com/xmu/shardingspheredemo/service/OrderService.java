package com.xmu.shardingspheredemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmu.shardingspheredemo.models.Order;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
public interface OrderService extends IService<Order> {
    Order saveOrder(Order order);

    Order getByUserIdAndOrderNo(Long userId, String orderNo);

    void removeByUserIdAndOrderNo(Long userId, String orderNo);
}
