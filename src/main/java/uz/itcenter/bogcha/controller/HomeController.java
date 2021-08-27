package uz.itcenter.bogcha.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String boshSahifa(Model model){
        model.addAttribute("ism", "Sardor");
        return "index";
    }
}
