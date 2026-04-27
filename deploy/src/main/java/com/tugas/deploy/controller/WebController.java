package com.tugas.deploy.controller;

import com.tugas.deploy.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Login menggunakan NIM kamu
        if(username.equals("admin") && password.equals("20230140083")) {
            return "redirect:/home";
        }
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model) {
        // Kuncinya di sini: Data langsung dimasukkan secara default
        model.addAttribute("nama", "Fera Istanti");
        model.addAttribute("nim", "20230140083");
        model.addAttribute("jk", "Perempuan");
        model.addAttribute("foto", "fera.jpeg"); // Pastikan file ini ada di resources/static.css/
        model.addAttribute("kataKata", "when ya fer");

        return "home";
    }
}