package com.geekster.Order.Management.System.repository;

import com.geekster.Order.Management.System.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
}
