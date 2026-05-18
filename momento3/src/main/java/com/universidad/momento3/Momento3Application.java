package com.universidad.momento3;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.universidad.excepciones.EstudianteNoEncontradoException;
import com.universidad.model.Estudiante;
import com.universidad.service.EstudianteService;

@SpringBootApplication
public class Momento3Application {

    public static void main(String[] args) {

        SpringApplication.run(Momento3Application.class, args);

        Scanner scanner = new Scanner(System.in);

        EstudianteService servicio = new EstudianteService();

        int opcion;

        do {

            System.out.println("======================================");
            System.out.println("PLANIFICACIÓN ACADÉMICA");
            System.out.println("======================================");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("0. Salir");

            System.out.print("Seleccione: ");

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ID: ");
                    String id = scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Correo: ");
                    String correo = scanner.nextLine();

                    System.out.print("Semestre: ");
                    int semestre = scanner.nextInt();

                    scanner.nextLine();

                    Estudiante estudiante =
                            new Estudiante(nombre,
                                    id,
                                    correo,
                                    semestre);

                    servicio.registrarEstudiante(estudiante);

                    break;

                case 2:

                    System.out.print("Ingrese ID: ");

                    String buscarId = scanner.nextLine();

                    try {

                        Estudiante encontrado =
                                servicio.buscarEstudiante(buscarId);

                        encontrado.mostrarInformacion();

                    } catch (EstudianteNoEncontradoException e) {

                        System.out.println(e.getMessage());
                    }

                    break;

                case 3:

                    servicio.mostrarEstudiantes();

                    break;

                case 0:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}