package com.example.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MyService myService(){
        return new MyService();
    }
    // manually creating the object
    @Bean
    public Car car(){
        return new Car();
    }
}
