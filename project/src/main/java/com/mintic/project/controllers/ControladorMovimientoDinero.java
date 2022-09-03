package com.mintic.project.controllers;

import com.mintic.project.repositories.RepositorioEmpresa;
import com.mintic.project.repositories.RepositorioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMovimientoDinero {

    @Autowired
    private RepositorioMovimientoDinero repositorioMovimientoDinero;

    @CrossOrigin
    @GetMapping("/movimientos")
    public String consultarMovimientos() {
        return repositorioMovimientoDinero.findAll().toString();
    }

}
