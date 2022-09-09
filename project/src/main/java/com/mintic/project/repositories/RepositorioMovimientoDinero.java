package com.mintic.project.repositories;

import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositorioMovimientoDinero extends CrudRepository<MovimientoDinero, Integer> {

    List<MovimientoDinero> findByEmpresa_Id(int id);

}
