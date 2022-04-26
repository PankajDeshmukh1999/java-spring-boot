package com.codekul.java28SeptFullStack.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //Annotation
public class SimConfig {

    @Bean  // java object
    public Vodafone getVodafone(){
        return new Vodafone();
    }
    @Bean
    public Jio getJio(){
        return new Jio();
    }
}
