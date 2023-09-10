package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {
    @Autowired
    private TopicRepo repo;
    public List<Topic> getAllTopics() {
        return repo.findAll();
    }
}
