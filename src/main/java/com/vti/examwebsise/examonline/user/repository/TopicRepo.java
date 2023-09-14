package com.vti.examwebsise.examonline.user.repository;


import com.vti.examwebsise.examonline.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicRepo extends JpaRepository<Topic,Integer> {
    @Query("SELECT t FROM Topic t where t.enabled = true")
    List<Topic> findAllEnabled();
}
