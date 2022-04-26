package com.codekul.java28SeptFullStack.storedprocedure.controller;

import com.codekul.java28SeptFullStack.onetomany.domain.Bike;
import com.codekul.java28SeptFullStack.storedprocedure.repository.BikeRepoSp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeControllerSp {

    @Autowired
    private BikeRepoSp bikeRepoSp;

    @GetMapping("getBikeData")
    public Bike getBikeData(@RequestParam("name")String name,
                            @RequestParam("color")String color){
        return bikeRepoSp.getBikeData();
    }
}
