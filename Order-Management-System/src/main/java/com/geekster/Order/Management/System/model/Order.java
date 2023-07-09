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
@Table(name = "OrderTable")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer orderQuantity;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    @OneToMany
    @JoinColumn(name = "fk_order_id")
    private List<Product> products;

}
