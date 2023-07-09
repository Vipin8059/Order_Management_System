package com.geekster.Order.Management.System.repository;

import com.geekster.Order.Management.System.model.Product;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Integer> {
}
