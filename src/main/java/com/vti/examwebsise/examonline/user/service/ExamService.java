package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.*;
import com.vti.examwebsise.examonline.sercutity.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

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


    public List<Topic> getTopics() {
        return topicRepo.findAll();
    }

    public Exam createExam(Integer topicId) {
        List<Question> questions = questionRepo.getExamQuestion(10,topicId);
        Exam exam = new Exam();
        exam.setStartTime(new Date());
        exam.setEndTime(new Date(exam.getStartTime().getTime()+61000));
        exam.setMark(0);
        exam.setQuestions(questions);
        return examRepo.save(exam);
    }

    public Exam get(Integer id) {
        return examRepo.getById(id);
    }

    public Exam save(Integer id, List<Answer> answers, MyUserDetails loggerUser) {
        Exam exam = get(id);
        exam.setEndTime(new Date());
        int mark = 0;
        for(Question question: exam.getQuestions()){
            boolean isCorrect = (new HashSet<>(answers).containsAll(question.getAllAnswers()) && question.getAllNonAnswers().stream()
                    .noneMatch(answers::contains));
            if (isCorrect) {
                mark++;
            }
        }
        exam.setAnswers(answers);
        exam.setMark(mark);
        User user = userRepo.findByUsername(loggerUser.getUsername());
        user.getExams().add(examRepo.save(exam));
        userRepo.save(user);

        return exam;
    }
}
