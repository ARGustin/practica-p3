package com.company;



public class Revista extends Publicado implements Alquiler{

    public Revista(int anio, int codigo, String titulado) {
        super(anio, codigo, titulado);
    }

    public boolean alquilar(){
        this.setDisponible(false);
        return true;
    }

    public boolean devolver(){
        this.setDisponible(true);
        return true;
    }


    public boolean alquilado() {
        return !this.isDisponible();
    }

    @Override
    public String toString() {
        return "Revista:"+ "\n" +super.toString();
    }
}
