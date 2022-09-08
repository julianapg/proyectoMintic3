package com.mintic.project.controllers;

import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import com.mintic.project.repositories.RepositorioEmpresa;
import com.mintic.project.repositories.RepositorioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControladorMovimientoDinero {

    @Autowired
    private RepositorioMovimientoDinero repositorioMovimientoDinero;

    @CrossOrigin
    @GetMapping("/movimientos")
    public String consultarMovimientos() {
        return repositorioMovimientoDinero.findAll().toString();
    }

    @CrossOrigin
    @GetMapping("/movimientos/{id}")
    public String consultarUnMovimiento(@PathVariable int id){
        return repositorioMovimientoDinero.findById(id).toString();
    }

    @CrossOrigin
    @DeleteMapping("/movimientos/{id}")
    public String eliminarMovimiento(@PathVariable int id){
        repositorioMovimientoDinero.deleteById(id);
        return "Movimiento con id: "+id+" borrado";
    }

    @CrossOrigin
    @PostMapping("/movimientos")
    public String crearEmpresas(@RequestBody MovimientoDinero movimiento){
        repositorioMovimientoDinero.save(movimiento);
        return "Movimiento creado";
    }

    @CrossOrigin
    @PatchMapping("/movimientos/{id}")
    public String actualizarMovimiento(@PathVariable int id, @RequestBody MovimientoDinero movimiento){
        movimiento.setId(id);
        repositorioMovimientoDinero.save(movimiento);
        return "Movimiento actualizado";
    }

}
