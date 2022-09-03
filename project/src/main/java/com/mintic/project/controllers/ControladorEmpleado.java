package com.mintic.project.controllers;

import com.mintic.project.repositories.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEmpleado {

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    @GetMapping("/empleados")
    public String consultarEmpleados(){
        return repositorioEmpleado.findAll().toString();
    }

}
