package com.example.vuelos_aeropuerto;

import java.time.LocalDateTime;

public class Vuelo {
    private Long id;
    private String origen;
    private String destino;
    private String fechaHoraSalida;
    private String fechaHoraLlgada;
    private Double precioEnPesos;
    private String frecuncia;

    //constructor vacio
    public Vuelo() {
    }

    //constructor con atributos

    public Vuelo(Long id, String origen, String destino, String fechaHoraSalida, String fechaHoraLlgada, Double precioEnPesos, String frecuncia) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraSalida = fechaHoraSalida;
        this.fechaHoraLlgada = fechaHoraLlgada;
        this.precioEnPesos = precioEnPesos;
        this.frecuncia = frecuncia;
    }


    //get n set


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(String fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getFechaHoraLlgada() {
        return fechaHoraLlgada;
    }

    public void setFechaHoraLlgada(String fechaHoraLlgada) {
        this.fechaHoraLlgada = fechaHoraLlgada;
    }

    public Double getPrecioEnPesos() {
        return precioEnPesos;
    }

    public void setPrecioEnPesos(Double precioEnPesos) {
        this.precioEnPesos = precioEnPesos;
    }

    public String getFrecuncia() {
        return frecuncia;
    }

    public void setFrecuncia(String frecuncia) {
        this.frecuncia = frecuncia;
    }
}

