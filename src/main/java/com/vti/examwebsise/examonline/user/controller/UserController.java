package com.vti.examwebsise.examonline.user.controller;

import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register_form";
    }
    @PostMapping("/create_customer")
    public String createCustomer(User user,Model model)  {
        if(userService.isUsernameUnique(user.getUsername())) {
            userService.registerUser(user);
            return "redirect:/login";
        }else{
            model.addAttribute("message","Username existed!");
            return "register_form";
        }
    }
}
