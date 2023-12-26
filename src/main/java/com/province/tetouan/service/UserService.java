package com.province.tetouan.service;

import com.province.tetouan.domain.User;
import com.province.tetouan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser(String username){

        return userRepository.findByUsername(username);
    }
}
