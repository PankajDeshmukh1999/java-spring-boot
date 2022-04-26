package com.codekul.java28SeptFullStack.onetomany.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String bikeType;

    private String color;

    @OneToMany(mappedBy = "bike", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Parts> parts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public Parts getParts() {
//        return parts;
//    }
//
//    public void setParts(Parts parts) {
//        this.parts = parts;
//    }
}
