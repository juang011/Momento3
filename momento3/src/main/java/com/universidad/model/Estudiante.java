package com.universidad.model;

public class Estudiante extends Persona {

    private int semestre;

private Double[][] notas = new Double[10][20];

    public Estudiante(String nombre,
                       String id,
                       String correo,
                       int semestre) {

        super(nombre, id, correo);
        this.semestre = semestre;
    }
    public String getId() {
    return id;
}

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Semestre: " + semestre);
    }
}