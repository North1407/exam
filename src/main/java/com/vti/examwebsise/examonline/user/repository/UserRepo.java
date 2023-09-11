package com.vti.examwebsise.examonline.user.repository;

import com.vti.examwebsise.examonline.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
