package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Topic;
import com.vti.examwebsise.examonline.user.repository.TopicRepo;
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

    public void enableTopic(Integer id, boolean status) {
        Topic topic = repo.findById(id).orElseThrow(()->new RuntimeException("Topic not found"));
        topic.setEnabled(status);
        repo.save(topic);
    }

    public void save(Topic topic) {
        repo.save(topic);
    }

    public void deleteTopic(Integer id) {
        repo.deleteById(id);
    }

    public Topic getTopic(Integer id) {
        return repo.findById(id).orElseThrow(()->new RuntimeException("Topic not found"));
    }
}
