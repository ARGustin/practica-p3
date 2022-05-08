package com.company;



public class Diario extends Publicado {

    public Diario(int anio, int codigo, String titulado) {
        super(anio, codigo, titulado);
    }

    public boolean prestar(){
        this.setDisponible(false);
        return true;
    }

    public boolean devolver(){
        this.setDisponible(true);
        return true;
    }

    public boolean prestado(){
        return !this.isDisponible();
    }
}



