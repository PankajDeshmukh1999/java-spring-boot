package com.codekul.java28SeptFullStack.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
        Sim sim = context.getBean(Vodafone.class);
        sim.calling();
        sim.data();
    }
}
