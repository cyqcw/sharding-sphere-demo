package com.xmu.shardingspheredemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.shardingspheredemo.domain.Dict;
import com.xmu.shardingspheredemo.mapper.DictMapper;
import com.xmu.shardingspheredemo.service.DictService;
import org.springframework.stereotype.Service;

/**
 * @author：HeGu
 * @date：2024/5/30
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements DictService {
}
