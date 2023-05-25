package com.web.backend_parcial_web.controladores;

import com.web.backend_parcial_web.interfaces.LibroRepository;
import com.web.backend_parcial_web.modelo.libroaviles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class LibroController {

    @Autowired
    LibroRepository libroRepository;

    @CrossOrigin
    @PostMapping(value = "/Add/Libro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertarLibro(@RequestParam String titulo,
                                                @RequestParam String referencia,
                                                @RequestParam String autor,
                                                @RequestParam Double precio,
                                                @RequestParam String ubicacion) throws Exception{

        libroaviles libro = new libroaviles(titulo,referencia,autor,precio,ubicacion);
        libroRepository.save(libro);
        HttpHeaders responseHeaders = new HttpHeaders();
        return  new ResponseEntity<String>( "{\"respuesta\":\"exito\"}", responseHeaders, HttpStatus.OK );
    }

    @CrossOrigin
    @GetMapping(value = "/GetLibro", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getlibros() throws Exception{
        Iterable<libroaviles> lib = libroRepository.findAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        System.out.print(lib.toString());
        return  new ResponseEntity<String>(lib.toString(), responseHeaders, HttpStatus.OK );

    }

}
