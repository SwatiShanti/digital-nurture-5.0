package com.swati.service;

import com.swati.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(Long id){
        return new User(id, "Swati");
    }
}