package com.universidad.estructuras;

import java.util.LinkedList;

public class HistorialMaterias {

    private LinkedList<String> materias;

    public HistorialMaterias() {

        materias = new LinkedList<>();
    }

    public void agregarMateria(String materia) {

        materias.add(materia);
    }

    public void mostrarMaterias() {

        System.out.println("Historial de materias:");

        for (String materia : materias) {

            System.out.println(materia);
        }
    }
}