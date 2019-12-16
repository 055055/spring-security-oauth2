package com.example.youpangsecurityoauth2.repository;

import com.example.youpangsecurityoauth2.Entitiy.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);

}

