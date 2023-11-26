package com.vti.examwebsise.examonline.user.repository;

import com.vti.examwebsise.examonline.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question,Integer> {
    @Query("SELECT q FROM Question q where q.topic.name like %:topicName% and q.level like %:difficulty% and q.enabled = true order by rand()")
    List<Question> getExamQuestion(String topicName, String difficulty);
    @Query("SELECT q FROM Question q where q.content like %?1%")
    List<Question> findAll(String keyword);

    @Modifying
    @Query("UPDATE Question q SET q.enabled = true where q.topic.name like %:topicName% and q.level like %:difficulty%")
    void setAllEnabledQuestion(String topicName, String difficulty);

    @Modifying
    @Query("UPDATE Question q SET q.enabled = false where q.id = :id")
    void setDisable(Integer id);
}
