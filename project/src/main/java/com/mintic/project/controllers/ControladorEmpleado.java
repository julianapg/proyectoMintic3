package com.mintic.project.controllers;

import com.mintic.project.repositories.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorEmpleado {

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    @CrossOrigin
    @GetMapping("/empleados")
    public String consultarEmpleados(){
        return repositorioEmpleado.findAll().toString();
    }

    @CrossOrigin
    @GetMapping("/empleados/{id}")
    public String consultarUnEmpleado(@PathVariable int id){
        return repositorioEmpleado.findById(id).toString();
    }

    @CrossOrigin
    @DeleteMapping("/empleados/{id}")
    public String eliminarUnEmpleado(@PathVariable int id){
        repositorioEmpleado.deleteById(id);
        return "Empleado con id: "+id+" borrado";
    }
}
