package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class UserInfoController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String viewAllUser(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "admins/users";
    }
}
