package com.vti.examwebsise.examonline.admin.repository;

import com.vti.examwebsise.examonline.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SettingRepo extends JpaRepository<Setting, Integer> {
    @Query("select s.value from Setting s where s.name = ?1")
    int findByName(String name);
}
