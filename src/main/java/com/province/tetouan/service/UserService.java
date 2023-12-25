package com.province.tetouan.service;

import com.province.tetouan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepository userRepository;
}
