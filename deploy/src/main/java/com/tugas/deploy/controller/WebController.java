package com.tugas.deploy.controller;

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
    public String login(@RequestParam String username,
                        @RequestParam String password) {

        if(username.equals("admin") && password.equals("20230140083")) {
            return "redirect:/home";
        }
        return "login";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String nama,
                         @RequestParam String nim,
                         @RequestParam String jk,
                         Model model) {

        model.addAttribute("nama", nama);
        model.addAttribute("nim", nim);
        model.addAttribute("jk", jk);

        return "result";
    }
}