package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.admin.service.SettingService;
import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.Setting;
import com.vti.examwebsise.examonline.entity.Topic;
import com.vti.examwebsise.examonline.user.service.ExamService;
import com.vti.examwebsise.examonline.user.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class AdminController {

    @Autowired
    private TopicService topicService;
    @Autowired
    private SettingService settingService;
    @Autowired
    private ExamService examService;
    @GetMapping("/topics")
    public String getAllTopics(Model model) {
        List<Topic> topics = topicService.getAllTopics();
        model.addAttribute("topics", topics);
        return "admins/topics";
    }
    @GetMapping("/exams")
    public String getAllExams(Model model) {
        List<Exam> exams = examService.getAllExams();
        model.addAttribute("exams", exams);
        return "admins/exams";
    }
    @GetMapping("results/get/{id}")
    public String getResult(@PathVariable("id") Integer id, Model model) {
        Exam exam = examService.get(id);
        model.addAttribute("result", exam);
        model.addAttribute("mark", exam.getMark());
        return "users/exams/result";
    }
    @GetMapping("/settings")
    public String viewAllSettings(Model model) {
        List<Setting> settings = settingService.getAllSettings();
        model.addAttribute("settings", settings);
        return "admins/settings";
    }

    @PostMapping("/settings/save")
    public String saveAllSettings(@RequestParam("settingIds") String[] ids, @RequestParam("settingValues") String[] values) {
        settingService.saveAllSettings(ids, values);
        return "redirect:/manage/settings";
    }
}
