package com.mintic.project.controllers;

import com.mintic.project.models.Empresa;
import com.mintic.project.repositories.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorEmpresas {

    @Autowired
    private RepositorioEmpresa repositorioEmpresa;

    @CrossOrigin
    @GetMapping("/empresas")
    public String consultarEmpresas(){
        return repositorioEmpresa.findAll().toString();
    }

    @CrossOrigin
    @GetMapping("/empresas/{id}")
    public String consultarUnaEmpresa(@PathVariable int id){
        return repositorioEmpresa.findById(id).toString();
    }

    @CrossOrigin
    @DeleteMapping("/empresas/{id}")
    public String eliminarUnaEmpresa(@PathVariable int id){
        repositorioEmpresa.deleteById(id);
        return "Empresa con id: "+id+" borrada";
    }

    @CrossOrigin
    @PostMapping("/empresas")
    public String crearEmpresas(@RequestBody Empresa empresa){
        repositorioEmpresa.save(empresa);
        return "Empresa creada";
    }

    @CrossOrigin
    @PatchMapping("/empresas/{id}")
    public String actualizarUnaEmpresa(@PathVariable int id, @RequestBody Empresa empresa){
        empresa.setId(id);
        repositorioEmpresa.save(empresa);
        return "Empresa actualizada";
    }
}
