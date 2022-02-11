package com.example.HorseApp.controllers;

import com.example.HorseApp.models.Horse;
import com.example.HorseApp.services.BreedService;
import com.example.HorseApp.services.GenderService;
import com.example.HorseApp.services.GroomService;
import com.example.HorseApp.services.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

@Controller
public class HorseController
{
    @Autowired
    private HorseService horseService;
    @Autowired
    private BreedService breedService;
    @Autowired
    private GenderService genderService;
    @Autowired
    private GroomService groomService;
    public HorseController()
    {}


    @RequestMapping("/add_horse")
    public String goBackHorse()
    {
        return "horse_list";
    }

    @RequestMapping("/horse_list")
    public String viewHorseList(Model model)
    {
        List<Horse> lh=horseService.findAll();
        model.addAttribute("lh",lh);
        return "horse_list";
    }

    @GetMapping("/add_horse")
    public String newHorseView(Model model)
    {
        model.addAttribute("horse", new Horse());
        model.addAttribute("breeds",breedService.findAll());
        model.addAttribute("genders", genderService.findAll());
        model.addAttribute("grooms",groomService.findAll());
        return "add_horse";
    }
    @PostMapping("/add_horse")
    public String newHorse(@Valid @ModelAttribute(value = "horse") Horse horse, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "add_horse";
        }
        else
        {
            horseService.save(horse);
            return "redirect:/horse_list";
        }
    }

    @GetMapping("/edit_horse/{idh}")
    public String editHorseView(Model model, @PathVariable Long idh)
    {
        model.addAttribute("horse", horseService.findById(idh));
        model.addAttribute("groom",groomService.findAll());

        return "edit_horse";
    }
    @PostMapping("/edit_horse")
    public String editHorse(@ModelAttribute(value = "horse") Horse horse)
    {
        horseService.update(horse);
        return "redirect:/horse_list";
    }

    @GetMapping("/delete_horse/{idh}")
    public String deleteHorse(@PathVariable Long idh)
    {
        horseService.deleteById(idh);
        return "redirect:/horse_list";
    }
}
