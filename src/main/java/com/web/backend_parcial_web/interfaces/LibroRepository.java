package com.web.backend_parcial_web.interfaces;

import com.web.backend_parcial_web.modelo.Libro_Aviles;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro_Aviles,Long> {
}
