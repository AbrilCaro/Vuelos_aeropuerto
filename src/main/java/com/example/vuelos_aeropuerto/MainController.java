package com.example.vuelos_aeropuerto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hola Mundo";
    }
}
