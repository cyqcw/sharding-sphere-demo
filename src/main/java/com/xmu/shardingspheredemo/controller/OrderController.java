package com.xmu.shardingspheredemo.controller;

import com.xmu.shardingspheredemo.models.Order;
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
    @PostMapping("/create")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order saveOrder=orderService.saveOrder(order);
        return ResponseEntity.ok(saveOrder);
    }

    @GetMapping("/{userId}/{orderNo}")
    public ResponseEntity<Order> getOrder(@PathVariable Long userId, @PathVariable String orderNo) {
        return ResponseEntity.ok(orderService.getByUserIdAndOrderNo(userId, orderNo));
    }

    @DeleteMapping("/{userId}/{orderNo}")
    public ResponseEntity<HttpStatus> deleteOrder(@PathVariable Long userId, @PathVariable String orderNo) {
        orderService.removeByUserIdAndOrderNo(userId, orderNo);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
