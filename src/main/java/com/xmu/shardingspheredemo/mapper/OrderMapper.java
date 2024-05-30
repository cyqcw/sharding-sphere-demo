package com.xmu.shardingspheredemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmu.shardingspheredemo.domain.Order;
import com.xmu.shardingspheredemo.domain.dto.OrderVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select({"select o.order_no, sum(i.price * i.count) as amount",
            "from sys_order o join sys_order_item i on o.order_no = i.order_no",
            "group by o.order_no"})
    List<OrderVo> getOrderAmount();
}
