package com.universidad.estructuras;

public class DistanciaEdificios {

    private int[][] distancias;

    public DistanciaEdificios() {

        distancias = new int[5][5];
    }

    public void agregarDistancia(int origen, int destino, int distancia) {

        distancias[origen][destino] = distancia;
    }

    public void mostrarDistancias() {

        for (int i = 0; i < distancias.length; i++) {

            for (int j = 0; j < distancias[i].length; j++) {

                System.out.print(distancias[i][j] + " ");
            }

            System.out.println();
        }
    }
}