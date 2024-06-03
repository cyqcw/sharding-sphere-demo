package com.xmu.shardingspheredemo.models;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@Data
@TableName("sys_dict")
public class Dict {
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String dictType;
}
