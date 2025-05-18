package com.example.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {
public void drive(){
    System.out.println("Car is driving");
}
}
