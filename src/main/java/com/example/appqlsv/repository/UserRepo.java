package com.example.appqlsv.repository;


import com.example.appqlsv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
