package com.codekul.java28SeptFullStack.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private int id;
    private String companyName;

    @Autowired    //Field based
    private Employee employee;

    @Autowired    //Field based
    private Employee employee1;

    //Setter based
//    public void setEmployee(Employee employee){
//        this.employee = employee;
//    }

    //Constructor Based
//    public Company(Employee employee){
//        this.employee = employee;
//    }
    public void getData(){
        employee.show();
    }
}
