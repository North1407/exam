package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Answer;
import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExamRepo extends JpaRepository<Exam,Integer> {
    @Query(value = "SELECT * FROM question ORDER BY RAND() LIMIT 5",nativeQuery = true)
    List<Question> getExamQuestion(int quantity);
}
