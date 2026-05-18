package com.universidad.estructuras;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GestionSolicitudes {

    private Queue<String> colaSolicitudes;
    private Stack<String> historialAcciones;

    public GestionSolicitudes() {

        colaSolicitudes = new LinkedList<>();
        historialAcciones = new Stack<>();
    }

    public void agregarSolicitud(String solicitud) {

        colaSolicitudes.add(solicitud);

        historialAcciones.push("Solicitud agregada: " + solicitud);
    }

    public void procesarSolicitud() {

        if (!colaSolicitudes.isEmpty()) {

            String solicitud = colaSolicitudes.poll();

            System.out.println("Procesando: " + solicitud);

            historialAcciones.push("Solicitud procesada: " + solicitud);

        } else {

            System.out.println("No hay solicitudes");
        }
    }

    public void mostrarHistorial() {

        System.out.println("Historial:");

        for (String accion : historialAcciones) {

            System.out.println(accion);
        }
    }
}