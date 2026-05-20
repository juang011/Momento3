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
            System.out.println("4. Registrar aula");
            System.out.println("5. Mostrar aulas");
            System.out.println("6. Agregar solicitud");
            System.out.println("7. Procesar solicitud");
            System.out.println("8. Mostrar historial");
            System.out.println("9. Agregar materia");
            System.out.println("10. Mostrar materias");
            System.out.println("11. Reservar horario");
            System.out.println("12. Mostrar horarios");
            System.out.println("13. Registrar distancia");
            System.out.println("14. Mostrar distancias");
            System.out.println("15. Mostrar endpoint");
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
                            new Estudiante(
                                    nombre,
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

                case 4:

                    System.out.println("Aula registrada");

                    break;

                case 5:

                    System.out.println("Mostrando aulas");

                    break;

                case 6:

                    System.out.println("Solicitud agregada");

                    break;

                case 7:

                    System.out.println("Procesando solicitud");

                    break;

                case 8:

                    System.out.println("Mostrando historial");

                    break;

                case 9:

                    System.out.println("Materia agregada");

                    break;

                case 10:

                    System.out.println("Mostrando materias");

                    break;

                case 11:

                    System.out.println("Horario reservado");

                    break;

                case 12:

                    System.out.println("Mostrando horarios");

                    break;

                case 13:

                    System.out.println("Distancia registrada");

                    break;

                case 14:

                    System.out.println("Mostrando distancias");

                    break;

                case 15:

                    System.out.println(
                            "http://localhost:8081/saludo");

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