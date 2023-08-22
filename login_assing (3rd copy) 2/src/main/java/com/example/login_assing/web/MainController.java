package com.example.login_assing.web;

import com.example.login_assing.model.User;
import com.example.login_assing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;


@Controller
public class MainController {

    @Autowired
    UserService userService;

   @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home(Principal principal, Model model) {
        String name = userService.findUserByEmail(principal.getName());
        model.addAttribute("name", name);
            return "index";
    }
}

//Model.addAttribute()  ...>