package com.vti.examwebsise.examonline.admin.controller;

import com.vti.examwebsise.examonline.admin.service.SettingService;
import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.Setting;
import com.vti.examwebsise.examonline.user.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/manage")
public class AdminController {

    @Autowired
    private SettingService settingService;
    @Autowired
    private ExamService examService;

    @GetMapping("/exams")
    public String getAllExams(Model model) {
        List<Exam> exams = examService.getAllExams();
        model.addAttribute("exams", exams);
        return "admins/exams";
    }
    @GetMapping("/exams/delete/{id}")
    public String deleteExam(@PathVariable("id") Integer id, RedirectAttributes re) {
        examService.deleteExam(id);
        re.addFlashAttribute("message", "The exam ID " + id + " has been deleted successfully.");
        return "redirect:/manage/exams";
    }
    @GetMapping("results/get/{id}")
    public String getResult(@PathVariable("id") Integer id, Model model) {
        Exam exam = examService.get(id);
        model.addAttribute("result", exam);
        model.addAttribute("mark", exam.getMark());
        model.addAttribute("time",exam.getEndTime());
        return "users/exams/result";
    }
    @GetMapping("/settings")
    public String viewAllSettings(Model model) {
        List<Setting> settings = settingService.getAllSettings();
        model.addAttribute("settings", settings);
        return "admins/settings";
    }

    @PostMapping("/settings/save")
    public String saveAllSettings(@RequestParam("settingIds") String[] ids, @RequestParam("settingValues") String[] values, RedirectAttributes re) {
        settingService.saveAllSettings(ids, values);
        re.addFlashAttribute("message", "The settings have been saved successfully");
        return "redirect:/manage/settings";
    }
}
