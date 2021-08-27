package uz.itcenter.bogcha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.itcenter.bogcha.entity.MahsulotTur;
import uz.itcenter.bogcha.service.MahsulotTurService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/mahsulot-tur")
public class MahsulotTurController {
    @Autowired
    MahsulotTurService mahsulotTurService;

    @GetMapping()
    public String mahsulotTur(Model model){
        model.addAttribute("mahsulotTurlar", mahsulotTurService.getAll());
        return "mahsulot-tur";
    }

    @PostMapping()
    public void qoshish(MahsulotTur MahsulotTur, HttpServletResponse hsr) throws IOException {
        mahsulotTurService.create(MahsulotTur);
        hsr.sendRedirect("/mahsulot-tur");
    }

    @GetMapping("/delete/{id}")
    public void ochirish(@PathVariable Long id, HttpServletResponse hsr) throws IOException {
        mahsulotTurService.deleteById(id);
        hsr.sendRedirect("/mahsulot-tur");
    }

    @GetMapping("/edit/{id}")
    public String ozgartirish(@PathVariable Long id, Model model) throws IOException {
        MahsulotTur m = mahsulotTurService.getById(id);

        model.addAttribute("mahsulotTur", m);
        return mahsulotTur(model);

    }
    @PostMapping("/edit")
    public void ozgartirishFinish(MahsulotTur MahsulotTur, HttpServletResponse hsr) throws IOException {
        mahsulotTurService.update(MahsulotTur);
         hsr.sendRedirect("/mahsulot-tur");

    }
}
