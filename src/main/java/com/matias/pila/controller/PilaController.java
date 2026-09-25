package com.matias.pila.controller;

import com.matias.pila.estructura.Pila;
import com.matias.pila.model.Estudiante;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/pila")
public class PilaController {

    private final Pila pila = new Pila(20);

    @PostMapping("/agregar")
    public String agregar(
        @RequestParam String codigo,
        @RequestParam String nombres,
        @RequestParam String apellidos,
        @RequestParam String email,
        @RequestParam String fechaNacimiento,
        @RequestParam char genero) {

    if (fechaNacimiento == null || fechaNacimiento.isBlank()) {
        return "La fecha de nacimiento es obligatoria";
    }

    Estudiante estudiante = new Estudiante(
            codigo,
            nombres,
            apellidos,
            email,
            LocalDate.parse(fechaNacimiento),
            genero
    );

    pila.agregar(estudiante);

    return "Estudiante agregado correctamente";
}

    @PostMapping("/quitar")
    public String quitar() {

        Estudiante estudiante = pila.quitar();

        if (estudiante == null) {
            return "La pila está vacía";
        }

        return "Estudiante retirado: " + estudiante;
    }

    @GetMapping("/mostrar")
    public Estudiante[] mostrar() {
        return pila.mostrar();
    }

    @GetMapping("/tamanyo")
    public String tamanyo() {
        return "Tamaño de la pila: " + pila.tamanyo();
    }
}