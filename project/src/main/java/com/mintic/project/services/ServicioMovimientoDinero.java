package com.mintic.project.services;

import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import com.mintic.project.repositories.RepositorioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMovimientoDinero {
    @Autowired
    private RepositorioMovimientoDinero repositorioMovimientoDinero;

    public String consultarTodosPorIdEmpresa(int id){
        return repositorioMovimientoDinero.findByEmpresa_Id(id).toString();
    }
    public String consultarUno(int id){
        return repositorioMovimientoDinero.findById(id).toString();
    }

    public void eliminar(int id){
        repositorioMovimientoDinero.deleteById(id);
    }

    public void crear(int id, MovimientoDinero movimiento){
        Empresa e1 = new Empresa();
        e1.setId(id);
        movimiento.setEmpresa(e1);
        repositorioMovimientoDinero.save(movimiento);
    }

    public void actualizar(int id, int id2, MovimientoDinero movimiento){
        movimiento.setId(id2);
        Empresa e1 = new Empresa();
        e1.setId(id);
        movimiento.setEmpresa(e1);
        repositorioMovimientoDinero.save(movimiento);
    }
}
