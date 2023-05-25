package com.web.backend_parcial_web;

import com.web.backend_parcial_web.interfaces.LibroRepository;
import com.web.backend_parcial_web.modelo.libroaviles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class PruebaGet {

    @Autowired
    private LibroRepository libroRepository;


    @Test
    public void pruebaGetCancha(){
        try{
            Iterator<libroaviles> libro = libroRepository.findAll().iterator();
            int cantidad = 0;
            while(libro.hasNext() ) {
                libro.next();
                cantidad ++;
            }

            assertTrue(cantidad >= 0, "Se obtuvieron los datos correctamente");

        }
        catch (Exception e){
            e.printStackTrace();
            fail("Error en la aplicación");
        }
    }
}
