package com.province.tetouan.controller;

import com.province.tetouan.domain.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.Authentication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView  indexPage(Authentication auth) {
        String viewName = "index";

        if (auth == null) {
            viewName = "login";
        }

        return new ModelAndView(viewName);
    }

    @GetMapping("/login")
    public ModelAndView  loginPage(Authentication auth) {
        String viewName = "login";

        if (auth == null) {
            viewName = "login";
        }

        return new ModelAndView(viewName);
    }
}
