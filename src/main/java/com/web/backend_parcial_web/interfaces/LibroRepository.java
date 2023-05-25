package com.web.backend_parcial_web.interfaces;

import com.web.backend_parcial_web.modelo.libroaviles;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<libroaviles,Long> {
}
