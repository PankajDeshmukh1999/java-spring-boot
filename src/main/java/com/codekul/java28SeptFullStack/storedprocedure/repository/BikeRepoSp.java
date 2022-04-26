package com.codekul.java28SeptFullStack.storedprocedure.repository;

import com.codekul.java28SeptFullStack.onetomany.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BikeRepoSp extends JpaRepository <Bike,Integer> {

    @Query(value = "{call gatBikeData()}",nativeQuery = true)
    Bike getBikeData();
    //List<Map<String,String>> getBikeData();
}
