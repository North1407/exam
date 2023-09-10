package com.vti.examwebsise.examonline.user.controller;

import com.vti.examwebsise.examonline.entity.*;
import com.vti.examwebsise.examonline.sercutity.MyUserDetails;
import com.vti.examwebsise.examonline.user.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/exam")
@Controller
public class ExamController {
    @Autowired
    QuestionRepo questionRepo;
    @Autowired
    AnswerRepo answerRepo;
    @Autowired
    ExamRepo examRepo;
    @Autowired
    TopicRepo topicRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    ExamService service;

    @GetMapping("/topics")
    public String getAllExamTopic(Model model) {
        List<Topic> topics = service.getTopics();
        model.addAttribute("topics", topics);
        return "exam/topics";
    }

    @GetMapping("topics/{id}")
    public String createNewExamByTopic(@PathVariable("id") Integer id) {
        Exam savedExam = service.createExam(id);
        return "redirect:/exam/new/" + savedExam.getId();
    }

    @GetMapping("/new/{id}")
    public String getExam(@PathVariable("id") Integer id, Model model) {
        Exam exam = service.get(id);
        List<String> answerIds = new ArrayList<>();
        model.addAttribute("exam", exam);
        model.addAttribute("answerIds", answerIds);
        model.addAttribute("endTime", exam.getEndTime().getTime());
        return "exam/exam-form";
    }

    @PostMapping("/submit")
    public String submitExam(Exam exam, Model model, @AuthenticationPrincipal MyUserDetails loggerUser) {
        List<Answer> answers = exam.getAnswers();
        Exam examInDb = service.save(exam.getId(),  answers, loggerUser);
        model.addAttribute("result", examInDb);
        model.addAttribute("mark", examInDb.getMark());
        return "exam/result";
    }
}

