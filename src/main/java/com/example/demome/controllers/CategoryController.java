package com.example.demome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoryController {

    @RequestMapping(value = "/category/index",method = RequestMethod.GET)
    public String index(){
        return "category/index";
    }
}
