package com.codekul.java28SeptFullStack.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton") //singleton , prototype
public class Employee {

    private int id;
    private String name;
    private String address;

    public void show (){
        System.out.println("In show");
        System.out.println("In show");
    }
    public Employee(){
        System.out.println("Object created");
    }
}
