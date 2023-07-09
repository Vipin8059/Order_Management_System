package com.geekster.Order.Management.System.service;

import com.geekster.Order.Management.System.model.User;
import com.geekster.Order.Management.System.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUsers(List<User> userList) {
        userRepo.saveAll(userList);
        return "users added successfully"+userList;
    }

    public User getUserById(Integer id) {
        Optional<User> userOptional = userRepo.findById(id);
        User user = userOptional.get();

        if(user==null){
            return null;
        }
        return user;
    }
}
