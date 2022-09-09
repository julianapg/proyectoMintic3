package com.mintic.project.services;

import com.mintic.project.models.Empresa;
import com.mintic.project.repositories.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpresa {
    @Autowired
    private RepositorioEmpresa repositorioEmpresa;

    public String consultarTodas(){
        return repositorioEmpresa.findAll().toString();
    }

    public String consultarUna(int id){
        return repositorioEmpresa.findById(id).toString();
    }

    public void eliminar(int id){
        repositorioEmpresa.deleteById(id);
    }

    public void crear(Empresa empresa){
        repositorioEmpresa.save(empresa);
    }

    public void actualizar(int id, Empresa empresa){
        empresa.setId(id);
        repositorioEmpresa.save(empresa);
    }
}
