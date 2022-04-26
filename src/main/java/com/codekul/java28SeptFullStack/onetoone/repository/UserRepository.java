package com.codekul.java28SeptFullStack.onetoone.repository;

import com.codekul.java28SeptFullStack.onetoone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User,Integer> {
}
