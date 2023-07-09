package com.geekster.Order.Management.System.controller;

import com.geekster.Order.Management.System.model.Order;
import com.geekster.Order.Management.System.service.OrderService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }

    @GetMapping("order/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
}
