package com.app.utb.recipeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping({"","/","index"})
    public String getIndexPage(){
        System.out.println("SOme message to save:13hg4");
        return "index";
    }
}
