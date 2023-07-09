package com.geekster.Order.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    private Integer productPrice;

    private String productDescription;

    @Enumerated(value = EnumType.STRING)
    private Category productCategory;

    private String productBrand;



}
