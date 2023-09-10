package com.vti.examwebsise.examonline.user.controller;

import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.service.ExamRepo;
import com.vti.examwebsise.examonline.user.service.UserRepo;
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
    ExamRepo examRepo;
    @Autowired
    UserRepo userRepo;

    @GetMapping("")
    public String getAllResult(Model model, HttpServletRequest request){
        String username = request.getUserPrincipal().getName();
        User user = userRepo.findByUsername(username);
        List<Exam> exams = user.getExams();
        Collections.sort(exams);
        model.addAttribute("exams", exams);
        return "exam/results";
    }

    @GetMapping("/get/{id}")
    public String getResult(@PathVariable("id")Integer id, Model model){
        Exam exam = examRepo.getById(id);
        model.addAttribute("result",exam);
        model.addAttribute("mark",exam.getMark());
        return "exam/result";
    }
}
