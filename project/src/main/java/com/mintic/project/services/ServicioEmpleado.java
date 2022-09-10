package com.mintic.project.services;

import com.mintic.project.models.Empleado;
import com.mintic.project.repositories.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEmpleado {
    @Autowired
    private RepositorioEmpleado repositorioEmpleado;

    public String consultarTodas()
    {
        return repositorioEmpleado.findAll().toString();
    }

    public String consultarUna(int id)
    {
        return repositorioEmpleado.findById(id).toString();
    }

    public void eliminar(int id)
    {
        repositorioEmpleado.deleteById(id);
    }

    public void crear(Empleado empleado)
    {
        repositorioEmpleado.save(empleado);
    }

    public void actualizar(int id, Empleado empleado)
    {
        empleado.setId(id);
        repositorioEmpleado.save(empleado);
    }
}
