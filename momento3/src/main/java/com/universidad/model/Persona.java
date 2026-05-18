package com.universidad.model;
// Clase abstracta que representa una persona
public abstract class Persona {

    protected String nombre;
    protected String id;
    protected String correo;

    public Persona(String nombre,
                    String id,
                    String correo) {

        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Correo: " + correo);
    }
}
    
