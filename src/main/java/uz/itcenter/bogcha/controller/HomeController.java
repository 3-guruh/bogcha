package uz.itcenter.bogcha.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Instant;

@Controller
public class HomeController {

    @GetMapping("/")
    public String boshSahifa(@CookieValue(name = "ism", defaultValue = "") String ism, Model model, HttpServletResponse res, HttpServletRequest req){
        System.out.println("Parameter ism: " + ism);
        Cookie c = new Cookie("salom", "Kalom");
        c.setMaxAge(90);

        res.addCookie(c);
        for(Cookie cookie: req.getCookies()){
            System.out.println(cookie.getName() + " " + cookie.getValue());
        }
        model.addAttribute("ism", "Sardor");
        return "index";
    }
}
