package com.universidad.model;

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
    
