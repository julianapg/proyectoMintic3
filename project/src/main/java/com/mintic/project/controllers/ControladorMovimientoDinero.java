package com.mintic.project.controllers;

import com.mintic.project.services.ServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMovimientoDinero {

    @Autowired
    private ServicioMovimientoDinero servicioMovimientoDinero;

    @CrossOrigin
    @GetMapping("/empresas/{id}/movimientos")
    public String consultarMovimientos(@PathVariable int id) {
        return servicioMovimientoDinero.consultarTodosPorIdEmpresa(id);
    }

}
