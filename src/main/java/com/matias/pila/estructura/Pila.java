package com.matias.pila.estructura;

import com.matias.pila.model.Estudiante;

public class Pila {

    private Estudiante[] pila;
    private int tope;

    public Pila(int tamaño) {
        pila = new Estudiante[tamaño];
        tope = -1;
    }

    public void agregar(Estudiante estudiante) {
        if (tope == pila.length - 1) {
            throw new RuntimeException("La pila está llena");
        }

        tope++;
        pila[tope] = estudiante;
    }

    public Estudiante quitar() {
        if (tope == -1) {
            return null;
        }

        Estudiante estudiante = pila[tope];
        pila[tope] = null;
        tope--;

        return estudiante;
    }

    public Estudiante[] mostrar() {
        Estudiante[] elementos = new Estudiante[tope + 1];

        for (int i = 0; i <= tope; i++) {
            elementos[i] = pila[i];
        }

        return elementos;
    }

    public int tamanyo() {
        return tope + 1;
    }
}