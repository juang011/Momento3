package com.universidad.momento3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.universidad.model.Estudiante;
import com.universidad.service.EstudianteService;

@SpringBootApplication
public class Momento3Application {

    public static void main(String[] args) {

        SpringApplication.run(Momento3Application.class, args);

        EstudianteService servicio = new EstudianteService();

        Estudiante estudiante1 =
                new Estudiante(
                        "Juan Balanta",
                        "2026001",
                        "juan@gmail.com",
                        3);

        servicio.registrarEstudiante(estudiante1);

        servicio.mostrarEstudiantes();
    }
}
