package com.vti.examwebsise.examonline.user.service;

import com.vti.examwebsise.examonline.entity.Role;
import com.vti.examwebsise.examonline.entity.User;
import com.vti.examwebsise.examonline.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    public void registerUser(User user) {
        user.setRole(new Role(2));
        user.setEnabled(true);
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
    }

    public boolean isUsernameUnique(String username) {
        User user = userRepo.findByUsername(username);
        return user == null;
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getByUsername(String username) {
        return userRepo.findByUsername(username);
    }
}
