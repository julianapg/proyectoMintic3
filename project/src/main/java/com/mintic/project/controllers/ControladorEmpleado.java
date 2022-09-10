package com.mintic.project.controllers;

import com.mintic.project.models.Empleado;
import com.mintic.project.services.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
public class ControladorEmpleado {

    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @CrossOrigin
    @GetMapping("/empleados")
    public String consultarEmpleados()
    {
        return servicioEmpleado.consultarTodas();
    }

    @CrossOrigin
    @GetMapping("/empleados/{id}")
    public String consultarUnEmpleado(@PathVariable int id)
    {
        return servicioEmpleado.consultarUna(id);
    }

    @CrossOrigin
    @DeleteMapping("/empleados/{id}")
    public String eliminarUnEmpleado(@PathVariable int id){
        servicioEmpleado.eliminar(id);
        return "Empleado con id: "+id+" borrado";
    }

    @CrossOrigin
    @PostMapping("/empleados")
    public String crearEmpleado(@RequestBody Empleado empleado){
        servicioEmpleado.crear(empleado);
        return "Empleado creado";
    }

    @CrossOrigin
    @PatchMapping("/empleados/{id}")
    public String actualizarUnEmpleado(@PathVariable int id, @RequestBody Empleado empleado){
        servicioEmpleado.actualizar(id,empleado);
        return "Empleado actualizada";
    }
}
