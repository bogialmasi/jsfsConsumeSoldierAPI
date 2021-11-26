package hu.consumeSoldierAPI.controllers;

import hu.consumeSoldierAPI.service.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private SoldierService service;

    @GetMapping("/")
    public String home(){return "index";}

    @GetMapping("/soldiers")
    public String soldiers(Model model){
        model.addAttribute("soldliers", service.getSoldiers());
        return "soldiers";}

}
