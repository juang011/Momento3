package com.universidad.model;

public class Aula {

    private String nombre;
    private int capacidad;

    public Aula(String nombre, int capacidad) {

        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {

        return nombre;
    }

    public int getCapacidad() {

        return capacidad;
    }

    public void mostrarAula() {

        System.out.println("Aula: " + nombre);
        System.out.println("Capacidad: " + capacidad);
    }
}