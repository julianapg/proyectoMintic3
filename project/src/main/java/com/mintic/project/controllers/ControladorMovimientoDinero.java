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
    /*
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
    */
}
