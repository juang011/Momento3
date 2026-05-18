package com.universidad.service;
import com.universidad.excepciones.EstudianteNoEncontradoException;

import java.util.HashMap;

import com.universidad.model.Estudiante;

public class EstudianteService {

    private HashMap<String, Estudiante> estudiantes;

    public EstudianteService() {

        estudiantes = new HashMap<>();
    }

    public void registrarEstudiante(Estudiante estudiante) {

        estudiantes.put(estudiante.getId(), estudiante);

        System.out.println("Estudiante registrado");
    }

    public void mostrarEstudiantes() {

        for (Estudiante estudiante : estudiantes.values()) {

            estudiante.mostrarInformacion();

            System.out.println("----------------");
        }
    }

    public Estudiante buscarEstudiante(String id)
        throws EstudianteNoEncontradoException {

    if (!estudiantes.containsKey(id)) {

        throw new EstudianteNoEncontradoException(
                "Estudiante no encontrado");
    }

    return estudiantes.get(id);
}
}