package com.mintic.project.repositories;

import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioMovimientoDinero extends CrudRepository<MovimientoDinero, Integer> {
}
