package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.entity.Question;
import com.vti.examwebsise.examonline.entity.Topic;
import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.service.QuestionService;
import com.vti.examwebsise.examonline.user.service.TopicService;
import com.vti.examwebsise.examonline.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private TopicService topicService;

    @GetMapping("/users")
    public String viewAllUser(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users",users);
        return "admin/users";
    }
    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable("id")Integer id,Model model){

        return "user_form";
    }
    @GetMapping("/questions")
    public String getAllQuestions(Model model){
        List<Question> questions = questionService.getAllQuestions();
        model.addAttribute("questions",questions);
        return "question/questions";
    }
    @GetMapping("/topics")
    public String getAllTopics(Model model){
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics",topics);
        return "question/topics";
    }

    @GetMapping("/questions/new")
    public String newQuestion(Model model){
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("question",new Question());
        model.addAttribute("topics",topics);
        return "question/question_form";
    }
    @PostMapping("/questions/create")
    public String saveQuestion(Question question,@RequestParam("answerIDs")String[] answerIds,@RequestParam("answerContents")String[] answerContents,
                               @RequestParam("answerCorrects")String[] ansCorrects){
    questionService.save(question,answerIds,answerContents,ansCorrects);


        return "home";
    }
}
