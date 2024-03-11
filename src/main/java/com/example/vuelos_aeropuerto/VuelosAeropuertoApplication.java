package com.example.vuelos_aeropuerto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class VuelosAeropuertoApplication {

    public static void main(String[] args) {

        SpringApplication.run(VuelosAeropuertoApplication.class, args);

    //objeto vuelo

        Vuelo vuelo = new Vuelo(1515L, "Buenos Aires", "Miami", LocalDateTime.now(), LocalDateTime.now().plusHours(2), 150000.50, "Diaria");

        System.out.println("Informacion de su vuelo:");
        System.out.println("ID: " + vuelo.getId());
        System.out.println("Origen: " + vuelo.getOrigen());
        System.out.println("Destino: " + vuelo.getDestino());
        System.out.println("Fecha y hora de salida: " + vuelo.getFechaHoraSalida());
        System.out.println("Fecha y hora de llegada: " + vuelo.getFechaHoraLlgada());
        System.out.println("Precio en pesos: " + vuelo.getPrecioEnPesos());
        System.out.println("Frecuencia: " + vuelo.getFrecuncia());

    }


}

