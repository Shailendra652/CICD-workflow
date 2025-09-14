package com.example.CICworkflow.repository;


import com.example.CICworkflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}