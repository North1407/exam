package com.vti.examwebsise.examonline.user.repository;

import com.vti.examwebsise.examonline.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
    @Query(value = "SELECT * FROM questions where topic_id = ?2 AND level like %?3% ORDER BY RAND() LIMIT ?1",nativeQuery = true)
    List<Question> getExamQuestion(int quantity, int topicId, String difficulty);
}
