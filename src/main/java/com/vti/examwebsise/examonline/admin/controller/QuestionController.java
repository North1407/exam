package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.entity.Question;
import com.vti.examwebsise.examonline.entity.Topic;
import com.vti.examwebsise.examonline.user.service.QuestionService;
import com.vti.examwebsise.examonline.user.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/manage")
public class QuestionController {
    private String defaultRedirectURL = "redirect:/manage/questions";
    @Autowired
    private QuestionService questionService;
    @Autowired
    private TopicService topicService;

    @GetMapping("/questions")
    public String getAllQuestions(Model model, String keyword) {
        List<Topic> topics = topicService.getAllTopics();
        List<Question> questions = questionService.getAllQuestions(keyword);
        Collections.sort(questions);
        model.addAttribute("questions", questions);
        model.addAttribute("keyword", keyword);
        model.addAttribute("topics", topics);
        return "admins/questions/questions";
    }

    @GetMapping("/questions/new")
    public String newQuestion(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("question", new Question());
        model.addAttribute("topics", topics);
        model.addAttribute("title", "New Question");
        return "admins/questions/question_form";
    }

    @GetMapping("/questions/{id}/enabled/{status}")
    public String enableQuestion(@PathVariable("id") Integer id, @PathVariable("status") boolean status, RedirectAttributes re) {
        questionService.enableQuestion(id, status);
        re.addFlashAttribute("message", "The question ID " + id + " has been " + (status ? "enabled" : "disabled") + " successfully");
        return defaultRedirectURL;
    }

    @PostMapping("/questions/save")
    public String saveQuestion(Question question, @RequestParam("answerIDs") String[] answerIds, @RequestParam("answerContents") String[] answerContents,
                               @RequestParam("answerCorrects") String[] ansCorrects, RedirectAttributes re) {
        try {
            questionService.save(question, answerIds, answerContents, ansCorrects);
        } catch (RuntimeException e) {
            re.addFlashAttribute("dangerMessage", "Answer is used in Exam");
            return defaultRedirectURL;
        }
        re.addFlashAttribute("message", "The question has been saved successfully");
        return defaultRedirectURL;
    }

    @GetMapping("/questions/edit/{id}")
    public String editQuestion(@PathVariable("id") Integer id, Model model) {
        Question question = questionService.getQuestionById(id);
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("question", question);
        model.addAttribute("topics", topics);
        model.addAttribute("title", "Edit Question(ID: " + id + ")");
        return "admins/questions/question_form";
    }

    @GetMapping("/questions/delete/{id}")
    public String deleteQuestion(@PathVariable("id") Integer id, RedirectAttributes re) {
        try {
            questionService.deleteQuestion(id);
        } catch (RuntimeException e) {
            re.addFlashAttribute("dangerMessage", "Question with id " + id + " is used in Exam");
            return defaultRedirectURL;
        }
        re.addFlashAttribute("message", "The question ID " + id + " has been deleted successfully");
        return defaultRedirectURL;
    }
}
