package com.geekster.Order.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    private String addressName;

    private String addressLandmark;

    private String addressPhoneNumber;

    private String addressZipCode;

    private String addressState;
    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;
}
