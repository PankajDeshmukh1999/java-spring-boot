package com.MB.MovieBooking.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MB.MovieBooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(Integer userId);

    User deleteByUserId(Integer userId);
}
