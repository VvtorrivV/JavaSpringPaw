package com.example.HorseApp.controllers;

import com.example.HorseApp.models.Groom;
import com.example.HorseApp.services.GroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GroomController
{
    @Autowired
    private GroomService groomService;
    public GroomController()
    {}

    @RequestMapping("/new_groom")
    public String goBackGroom()
    {
        return "groom_list";
    }

    @RequestMapping("/groom_list")
    public String viewGroomList(Model model)
    {
        List<Groom> lg=groomService.findAll();
        model.addAttribute("lg",lg);
        return "groom_list";
    }

    @GetMapping("/new_groom")
    public String newGroomView(Model model)
    {
        model.addAttribute("groom", new Groom());
        return "new_groom";
    }
    @PostMapping("/new_groom")
    public String newGroom(@ModelAttribute(value = "groom") Groom groom)
    {
        groomService.save(groom);
        return "redirect:/groom_list";
    }

    @GetMapping("/edit_groom/{idgr}")
    public String editGroomView(Model model, @PathVariable Long idgr)
    {
        model.addAttribute("groom",groomService.findById(idgr));
        return "edit_groom";
    }
    @PostMapping("/edit_groom")
    public String editGroom(@ModelAttribute(value = "groom") Groom groom)
    {
        groomService.update(groom);
        return "redirect:/groom_list";
    }

    @GetMapping("/delete_groom/{idgr}")
    public String deleteGroom(@PathVariable Long idgr)
    {
        groomService.deleteById(idgr);
        return "redirect:/groom_list";
    }

}
