package com.geekster.Order.Management.System.repository;

import com.geekster.Order.Management.System.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
}
