package com.geekster.Order.Management.System.service;

import com.geekster.Order.Management.System.model.Order;
import com.geekster.Order.Management.System.repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(Order order) {
        orderRepo.save(order);
        return "order placed successfully "+order;
    }

    public Order getOrderById(Integer id) {
        return orderRepo.findById(id).orElse(null);
    }
}
