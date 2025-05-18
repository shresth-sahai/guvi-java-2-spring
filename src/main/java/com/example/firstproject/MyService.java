package com.example.firstproject;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void serve(){
        System.out.println("service called");
    }
}
