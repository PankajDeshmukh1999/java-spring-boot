package com.MB.MovieBooking.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.MB.MovieBooking.entity.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {

    List<Cinema> findByName(String name);

    @Query( "select c from Cinema c order by price")
    List<Cinema> getAllCinemaOrderByPrice();

    List<Cinema> findByLocation(String location);

    Cinema findByCinemaId(Integer cinemaId);

    List<Cinema> findByNameAndLocation(String name, String location);
    
    Cinema deleteCinemaBycinemaId(Integer cinemaId);
}