package com.xmu.shardingspheredemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * @author：HeGu
 * @date：2024/5/29
 */
@Configuration
public class RabbitMQConfig {
    public static String EXCHANGE_NAME = "sensor_exchange";
    public static String QUEUE_NAME = "sensor_queue";
    public static String ROUTING_KEY = "sensor_routing_key";

    @Bean
    public DirectExchange sensorExchange() {
        return new DirectExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue sensorQueue() {
        return new Queue(QUEUE_NAME, true);
    }

    @Bean
    public Binding sensorBinding() {
        return BindingBuilder
                .bind(sensorQueue())
                .to(sensorExchange())
                .with(ROUTING_KEY); // 使用不同的路由键进行绑定
    }
}
