package com.xmu.shardingspheredemo.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName("sys_user")
public class User {
//    @TableId(type = IdType.AUTO)
    // 基于mybatisplus的分布式id生成策略, 优先级高, 注释掉也有默认值, 所以这里要使用AUTO
    //    @TableId(type = IdType.ID_WORKER)
    @TableId(type = IdType.AUTO) // 配置了shardingsphere的分布式id生成策略, 所以这里要使用AUTO
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private Integer status;
}
