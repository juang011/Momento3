package com.universidad.estructuras;

import java.util.TreeMap;

import com.universidad.model.Aula;

public class GestionAulas {

    private TreeMap<String, Aula> aulas;

    public GestionAulas() {

        aulas = new TreeMap<>();
    }

    public void agregarAula(Aula aula) {

        aulas.put(aula.getNombre(), aula);
    }

    public void mostrarAulas() {

        for (Aula aula : aulas.values()) {

            aula.mostrarAula();

            System.out.println("----------------");
        }
    }
}