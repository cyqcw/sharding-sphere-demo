package com.xmu.shardingspheredemo.controller;

import com.xmu.shardingspheredemo.controller.producer.SensorProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：HeGu
 * @date：2024/5/29
 */
@RestController
@RequestMapping("/mq")
@RequiredArgsConstructor
public class MQController {
    private final SensorProducer sensorProducer;

    @PostMapping
    public void sendSensorData(String message) {
        sensorProducer.sendSensorData(message);
    }
}
