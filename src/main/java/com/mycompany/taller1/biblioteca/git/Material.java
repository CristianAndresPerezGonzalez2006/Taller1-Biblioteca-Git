package com.mycompany.taller1.biblioteca.git;

public class Material {

    protected String codigo;
    protected String titulo;
    protected String anioPublicacion;

    // Constructor vacío
    public Material() {
    }

    // Constructor con parámetros
    public Material(String codigo, String titulo, String anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion;
    }
}
