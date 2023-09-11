package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.entity.Question;
import com.vti.examwebsise.examonline.entity.Topic;
import com.vti.examwebsise.examonline.user.service.QuestionService;
import com.vti.examwebsise.examonline.user.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @Autowired
    private TopicService topicService;

    @GetMapping("/questions")
    public String getAllQuestions(Model model){
        List<Question> questions = questionService.getAllQuestions();
        model.addAttribute("questions",questions);
        return "admins/questions/questions";
    }
    @GetMapping("/questions/new")
    public String newQuestion(Model model){
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("question",new Question());
        model.addAttribute("topics",topics);
        model.addAttribute("title","New Question");
        return "admins/questions/question_form";
    }
    @PostMapping("/questions/save")
    public String saveQuestion(Question question, @RequestParam("answerIDs")String[] answerIds, @RequestParam("answerContents")String[] answerContents,
                               @RequestParam("answerCorrects")String[] ansCorrects){
        questionService.save(question,answerIds,answerContents,ansCorrects);
        return "redirect:/manage/questions";
    }
    @GetMapping("/questions/edit/{id}")
    public String editQuestion(@PathVariable("id")Integer id, Model model){
        Question question = questionService.getQuestionById(id);
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("question",question);
        model.addAttribute("topics",topics);
        model.addAttribute("title","Edit Question");
        return "admins/questions/question_form";
    }
    @GetMapping("/questions/delete/{id}")
    public String deleteQuestion(@PathVariable("id")Integer id){
        questionService.deleteQuestion(id);
        return "redirect:/manage/questions";
    }
}
