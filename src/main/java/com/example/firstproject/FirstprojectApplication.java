package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}
}
// DI -> dependency injection -> loose coupling ->
// class -> components -> dependent ->
// mutilple independent services but they communication ->
// dependency injection
// component -> is used by another
// annotations ->
// spring boot -> to eliminate config things -> mamnging configs was difficult
// spring -> IOC container ->
// spring boot -> embedded server -> TOMCAT SERVER