package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.admin.repository.SettingRepo;
import com.vti.examwebsise.examonline.entity.*;
import com.vti.examwebsise.examonline.sercutity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

import com.vti.examwebsise.examonline.user.repository.*;

@Service
@Transactional
public class ExamService {
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
    SettingRepo settingRepo;


    public List<Topic> getTopics() {
        return topicRepo.findAll();
    }
    public List<Topic> getEnabledTopics() {
        return topicRepo.findAllEnabled();
    }
    public Exam createExam(Integer topicId, String difficulty, String username) {
        User user = userRepo.findByUsername(username);
        int numberOfQuestion = settingRepo.findByName("Number of question");
        int timePerExam = settingRepo.findByName("Time per exam");
        List<Question> questions = questionRepo.getExamQuestion(numberOfQuestion, topicId, difficulty.equals("0") ? "" : difficulty);
        Exam exam = new Exam();
        exam.setStartTime(new Date());
        exam.setEndTime(new Date(exam.getStartTime().getTime() + (timePerExam + 1) * 1000L));
        exam.setMark(0);
        exam.setQuestions(questions);
        exam.setUser(user);
        return examRepo.save(exam);
    }

    public Exam get(Integer id) {
        return examRepo.getById(id);
    }

    public Exam save(Integer id, List<Answer> answers) {
        Exam exam = get(id);
        exam.setEndTime(new Date());
        exam.setAnswers(answers);
        int trueCounts = checkTrueAnswer(exam.getQuestions(), answers);
        exam.setMark((float) trueCounts / exam.getQuestions().size() * 10);

        return examRepo.save(exam);
    }

    private int checkTrueAnswer(List<Question> questions, List<Answer> answers) {
        int trueCounts = 0;
        for (Question question : questions) {
            boolean isCorrect = (new HashSet<>(answers).containsAll(question.getAllAnswers()) && question.getAllNonAnswers().stream()
                    .noneMatch(answers::contains));
            if (isCorrect) {
                trueCounts++;
            }
        }
        return trueCounts;
    }

    public List<Exam> getAllExams() {
        return examRepo.findAll();
    }
}
