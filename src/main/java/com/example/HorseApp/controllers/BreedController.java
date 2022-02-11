package com.example.HorseApp.controllers;

import com.example.HorseApp.models.Breed;
import com.example.HorseApp.services.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import java.util.List;

@Controller
public class BreedController
{
    @Autowired
    private BreedService breedService;
    public BreedController()
    {}

    @RequestMapping("/new_breed")
    public String goBackGroom()
    {
        return "breed_list";
    }
    @RequestMapping("/breed_list")
    public String viewBreedList(Model model)
    {
        List<Breed> lb=breedService.findAll();
        model.addAttribute("lb",lb);
        return "breed_list";
    }

    @GetMapping("/new_breed")
    public String newBreedView(Model model)
    {
        model.addAttribute("breed",new Breed());
        return "new_breed";
    }
    @PostMapping("/new_breed")
    public String newBreed(@ModelAttribute(value = "breed") Breed breed)
    {
        breedService.save(breed);
        return "redirect:/breed_list";
    }

    @GetMapping("/delete_breed/{idb}")
    public String deleteBreed(@PathVariable Long idb)
    {
        breedService.deleteById(idb);
        return "redirect:/breed_list";
    }
}
