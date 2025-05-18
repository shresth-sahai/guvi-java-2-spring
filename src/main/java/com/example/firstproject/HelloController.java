package com.example.firstproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /*
    Several HTTP methods
    GET -> reteive data
    POST -> create data
    DELETE -> delete data
    PUT ->entire data changes
    PATCH->specific data upgrade

    MVC -> MODEL(database/ fields ) VIEW(UI) CONTROLLER(buisness logic)
     */

    @GetMapping("/hello1")
    public String sayHello(){
        return "Hello from Spring MVC";
    }
}
