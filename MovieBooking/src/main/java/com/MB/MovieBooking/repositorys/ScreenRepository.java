package com.MB.MovieBooking.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MB.MovieBooking.entity.Screen;

@Repository
public interface ScreenRepository  extends JpaRepository<Screen, Integer> {

    List<Screen> findByType(String type);

    Screen findByScreenId(Integer screenId);
    
    Screen deleteScreenByscreenId(Integer screenId);
}