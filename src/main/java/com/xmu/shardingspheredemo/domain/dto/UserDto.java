package com.xmu.shardingspheredemo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author：HeGu
 * @date：2024/5/5
 */
@Data
@AllArgsConstructor
public class UserDto {
    private String name;
    private String sex;
    private Integer age;
}
