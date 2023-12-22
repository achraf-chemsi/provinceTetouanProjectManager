package com.province.tetouan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

public class HomeController {

    @RequestMapping("/")
    public ModelAndView  indexPage() {
        String viewName = "index";
        return new ModelAndView(viewName);
    }
}
