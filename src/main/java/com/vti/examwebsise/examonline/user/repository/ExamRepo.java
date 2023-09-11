package com.vti.examwebsise.examonline.user.repository;
import com.vti.examwebsise.examonline.entity.Exam;
import com.vti.examwebsise.examonline.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExamRepo extends JpaRepository<Exam,Integer> {

}
