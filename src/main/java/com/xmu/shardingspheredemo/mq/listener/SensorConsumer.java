package com.xmu.shardingspheredemo.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author：HeGu
 * @date：2024/5/29
 */
@Component
public class SensorConsumer {
    @RabbitListener(queues = "sensor_queue")
    public void receiveSensorData(String message) {
        System.out.println("Received sensor data: " + message);
        // 在这里可以进行进一步处理，如解析JSON、存储到数据库等
    }
}
