package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Question;
import com.vti.examwebsise.examonline.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions() {
        return repo.findAll();
    }

    public void save(Question question, String[] answerIds, String[] answerContents, String[] ansCorrects) {
        int trueCount = 0;
        for(int i = 0; i < answerIds.length; i++) {
            if(ansCorrects[i].equals("1")) {
                trueCount++;
            }
            if (answerIds[i].equals("0")) {
                question.addAnswer(answerContents[i], Boolean.parseBoolean(ansCorrects[i]));
            } else {
                question.addAnswer(Integer.valueOf(answerIds[i]), answerContents[i], Boolean.parseBoolean(ansCorrects[i]));
            }
        }
        question.setTrueAnswer(trueCount);
        System.out.println(question);
        repo.save(question);
    }
}
