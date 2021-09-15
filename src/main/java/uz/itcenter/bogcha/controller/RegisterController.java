package uz.itcenter.bogcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String boshSahifa(Model model, HttpServletResponse res, HttpServletRequest req){
             return "register";
    }


}
