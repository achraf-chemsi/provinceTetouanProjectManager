package com.province.tetouan.controller;

import com.province.tetouan.domain.User;
import com.province.tetouan.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/loginPagePost")
    public ModelAndView getUser(@RequestParam(required = false) String username) {
        String viewName;

        User user = userService.getUser(username);

        if(user == null){
            viewName = "login";
        }else{
            viewName = "index";
        }

        return new ModelAndView(viewName);
    }

    @PostMapping("/loginPagePost")
    public ModelAndView  saveUser(Authentication auth, @Valid User user , BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return new ModelAndView("login");
        }

        String viewName = "login";

        if (auth == null) {
            viewName = "login";
        }

        return new ModelAndView(viewName);
    }
}
