package com.example.Movie201.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie201.entity.Screen;

public interface ScreenRepo extends JpaRepository<Screen, Integer> {

}
