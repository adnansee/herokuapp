package com.example.herokutry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HerokutryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HerokutryApplication.class, args);
    }

}

@RestController
class HelloController{

    @GetMapping("/")
    String hello(){
        return "HELLO INTEC CLASS";
    }
}
