package com.codekul.java28SeptFullStack.onetoone.repository;

import com.codekul.java28SeptFullStack.onetomany.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
}
