package com.mintic.project.controllers;

import com.mintic.project.repositories.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEmpresas {

    @Autowired
    private RepositorioEmpresa repositorioEmpresa;

    @GetMapping("/empresas")
    public String consultarEmpresas(){
        return repositorioEmpresa.findAll().toString();
    }
}
