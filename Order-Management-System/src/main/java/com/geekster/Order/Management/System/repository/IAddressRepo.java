package com.geekster.Order.Management.System.repository;

import com.geekster.Order.Management.System.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {
}
