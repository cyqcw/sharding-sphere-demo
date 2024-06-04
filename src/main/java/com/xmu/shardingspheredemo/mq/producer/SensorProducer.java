package com.xmu.shardingspheredemo.mq.producer;

import com.xmu.shardingspheredemo.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @author：HeGu
 * @date：2024/5/29
 */
@Component
public class SensorProducer {
    @Resource
    private RabbitTemplate rabbitTemplate;
    public void sendSensorData(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message);
    }
}
