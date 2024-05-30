package com.xmu.shardingspheredemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@Data
@TableName("sys_order_item")
public class OrderItem {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String orderNo;
    private Long userId;
    private Integer price;
    private Integer count;
    private String description;
}
