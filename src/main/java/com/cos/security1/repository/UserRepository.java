package com.cos.security1.repository;

import com.cos.security1.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// CRUD 함수를 JpaRepository가 들고 있음.
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
