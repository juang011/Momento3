package com.universidad.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {

    @GetMapping("/")
    public String inicio() {

        return "Bienvenido al sistema de estudiantes";
    }

    @GetMapping("/saludo")
    public String saludo() {

        return "Proyecto funcionando correctamente";
    }
}