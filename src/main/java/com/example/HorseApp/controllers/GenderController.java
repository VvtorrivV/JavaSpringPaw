package com.example.HorseApp.controllers;

import com.example.HorseApp.models.Gender;
import com.example.HorseApp.services.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GenderController
{
    @Autowired
    private GenderService genderService;
    public GenderController()
    {}

    @RequestMapping("/gender_list")
    public String viewGenderList(Model model)
    {
        List<Gender> lgedner=genderService.findAll();
        model.addAttribute("lgender",lgedner);
        return "gender_list";
    }

}
