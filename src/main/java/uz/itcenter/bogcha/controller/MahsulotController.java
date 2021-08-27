package uz.itcenter.bogcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.itcenter.bogcha.entity.Mahsulot;
import uz.itcenter.bogcha.service.MahsulotService;
import uz.itcenter.bogcha.service.MahsulotTurService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MahsulotController {
    @Autowired
    MahsulotService mahsulotService;

    @Autowired
    MahsulotTurService mahsulotTurService;

    @GetMapping("/mahsulot")
    public String mahsulot(Model model){
        model.addAttribute("mahsulotlar", mahsulotService.getAll());
        model.addAttribute("mahsulotTurlar", mahsulotTurService.getAll());
        return "mahsulot";
    }

    @PostMapping("/mahsulot")
    public void qoshish(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Mahsulot mahsulot, HttpServletResponse hsr) throws IOException {
        mahsulotService.create(mahsulot);
        hsr.sendRedirect("/mahsulot");
    }

    @GetMapping("/mahsulot/delete/{id}")
    public void ochirish(@PathVariable Long id, HttpServletResponse hsr) throws IOException {
        mahsulotService.deleteById(id);
        hsr.sendRedirect("/mahsulot");
    }

    @GetMapping("/mahsulot/edit/{id}")
    public String ozgartirish(@PathVariable Long id, Model model) throws IOException {
        Mahsulot m = mahsulotService.getById(id);
        model.addAttribute("mahsulot", m);
        return mahsulot(model);

    }
    @PostMapping("/mahsulot/edit")
    public void ozgartirishFinish( @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Mahsulot mahsulot, HttpServletResponse hsr) throws IOException {
        mahsulotService.update(mahsulot);
         hsr.sendRedirect("/mahsulot");

    }
}
