package com.universidad.estructuras;

public class HorarioAulas {

    private boolean[][] horarios;

    public HorarioAulas() {

        horarios = new boolean[7][24];
    }

    public void reservarHorario(int dia, int hora) {

        horarios[dia][hora] = true;
    }

    public void mostrarHorario() {

        for (int i = 0; i < horarios.length; i++) {

            for (int j = 0; j < horarios[i].length; j++) {

                System.out.print(horarios[i][j] + " ");
            }

            System.out.println();
        }
    }
}