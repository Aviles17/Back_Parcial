package com.web.backend_parcial_web.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class libroaviles {

    private String titulo;
    private String referencia;
    private String autor;
    private Double precio;
    private String ubicacion;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public libroaviles(String titulo, String referencia, String autor, Double precio, String ubicacion) {
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicacion = ubicacion;
    }

    public libroaviles() {
        this.titulo = null;
        this.referencia = null;
        this.autor = null;
        this.precio = 0.0;
        this.ubicacion = null;

    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", referencia='" + referencia + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", ubicacion='" + ubicacion + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
