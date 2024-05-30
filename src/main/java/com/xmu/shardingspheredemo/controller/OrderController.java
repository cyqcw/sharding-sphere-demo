package com.xmu.shardingspheredemo.controller;

import com.xmu.shardingspheredemo.domain.Order;
import com.xmu.shardingspheredemo.service.OrderItemService;
import com.xmu.shardingspheredemo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author：HeGu
 * @date：2024/5/28
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final OrderItemService orderItemService;
    @PostMapping("/create")
    public ResponseEntity createOrder(@RequestBody Order order) {
        orderService.save(order);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return ResponseEntity.ok(orderService.getById(id));
    }
}
