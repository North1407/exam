package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Question;
import com.vti.examwebsise.examonline.user.repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class QuestionService {
    @Autowired
    private QuestionRepo repo;

    public List<Question> getAllQuestions(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return repo.findAll();
        }
        return repo.findAll(keyword);
    }

    public void save(Question question, String[] answerIds, String[] answerContents, String[] ansCorrects) {
        int trueCount = 0;
        for(int i = 0; i < answerIds.length; i++) {
            if(ansCorrects[i].equals("1")) {
                trueCount++;
            }
            if (answerIds[i].equals("0")) {
                question.addAnswer(answerContents[i], "1".equals(ansCorrects[i]));
            } else {
                question.addAnswer(Integer.valueOf(answerIds[i]), answerContents[i],"1".equals(ansCorrects[i]));
            }
        }
        question.setTrueAnswer(trueCount);
        repo.save(question);
    }

    public void deleteQuestion(Integer id) {
        repo.deleteById(id);
    }

    public Question getQuestionById(Integer id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
    }

    public void enableQuestion(Integer id, boolean status) {
        Question question = repo.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
        question.setEnabled(status);
        repo.save(question);
    }
}
