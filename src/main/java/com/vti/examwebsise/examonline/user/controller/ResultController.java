package com.vti.examwebsise.examonline.user.controller;

import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.repository.ExamRepo;
import com.vti.examwebsise.examonline.user.repository.UserRepo;
import com.vti.examwebsise.examonline.user.service.ExamService;
import com.vti.examwebsise.examonline.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/results")
public class ResultController {
    @Autowired
    ExamService examService;
    @Autowired
    UserService userService;

    @GetMapping("")
    public String getAllResult(Model model, HttpServletRequest request) {
        String username = request.getUserPrincipal().getName();
        User user = userService.getByUsername(username);
        List<Exam> exams = user.getExams();
        Collections.sort(exams);
        model.addAttribute("exams", exams);
        return "users/exams/results";
    }

    @GetMapping("/get/{id}")
    public String getResult(@PathVariable("id") Integer id, Model model) {
        Exam exam = examService.get(id);
        model.addAttribute("result", exam);
        model.addAttribute("mark", exam.getMark());
        return "users/exams/result";
    }
}
