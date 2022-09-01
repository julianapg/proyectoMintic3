package com.mintic.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorHome {

    @GetMapping("/")
    public String home(){
        return "Bienvenido a la aplicación";
    }

    @GetMapping("/acerca")
    public String acerca(){
        return "Aplicación creada por Luisa y Juliana";
    }

}
