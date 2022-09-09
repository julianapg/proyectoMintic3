package com.mintic.project.services;

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
}
