package com.example.springintellij;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;

@RestController

@SpringBootApplication
public class SpringIntellijApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringIntellijApplication.class, args);
    }
    @GetMapping("/")
    public String testServer() {
        System.out.println("Request");
        LocalTime currentTime = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return currentTime.format(formatter);
    }
}
