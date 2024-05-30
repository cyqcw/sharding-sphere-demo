package com.xmu.shardingspheredemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@TableName("sys_order")
@Data
public class Order {
    @TableId(type = IdType.AUTO)
//    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private Long userId;
    private String orderNo;
    private Integer status;
    private Integer amount;
}
