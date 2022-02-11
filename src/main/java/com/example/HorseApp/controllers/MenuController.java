package com.example.HorseApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MenuController
{

    @RequestMapping("/menu")
    public String viewMenu()
    {
        return "menu";
    }

    @RequestMapping("/login")
    public String viewLogin()
    {
        return "login";
    }

}
