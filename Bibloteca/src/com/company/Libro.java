package com.company;

public class Libro extends Ejemplar implements Alquiler{
    private String titulo;
    private Genero genero;

    public Libro(int anio, int codigo, String titulo, Genero genero) {
        super(anio, codigo);
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean alquilar(){
        this.setDisponible(false);
        return true;
    }

    public boolean devolver(){
        this.setDisponible(true);
        return true;
    }

    @Override
    public boolean alquilado() {
        return !this.isDisponible();
    }

    @Override
    public String toString() {
        return "Libro:" + "\n" +
                "titulo='" + titulo + '\'' +
                "genero=" + genero +
                 super.toString();
    }
}
