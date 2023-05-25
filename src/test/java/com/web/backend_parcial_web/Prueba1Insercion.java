package com.web.backend_parcial_web;

import com.web.backend_parcial_web.interfaces.LibroRepository;
import com.web.backend_parcial_web.modelo.libroaviles;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class Prueba1Insercion {

    @Autowired
    private LibroRepository libroRepository;


    @Test
    public void pruebInsercionLibro(){

        try{
            Iterator<libroaviles> libros = libroRepository.findAll().iterator();
            int cantidad = 0;
            while(libros.hasNext() ) {
                libros.next();
                cantidad ++;
            }

            libroaviles L1 =new libroaviles("Titulo1","1005643","Gabriel",40.0,"Bogota");
            libroRepository.save(L1);
            libroaviles L2 =new libroaviles("Titulo2","1005644","Santiago",60.0,"Bogota");
            libroRepository.save(L2);

            libros = libroRepository.findAll().iterator();
            int nuevaCantidad = 0;
            while(libros.hasNext() ) {
                libros.next();
                nuevaCantidad ++;
            }
            assertTrue(cantidad + 2 == nuevaCantidad, "Aumento en la cantidad debida" );
        }
        catch(Exception e){
            e.printStackTrace();
            assertTrue( false, "Error en la aplicación" );
        }
    }

}
