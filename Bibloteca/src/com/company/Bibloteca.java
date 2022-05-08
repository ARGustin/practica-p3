package com.company;

import java.util.ArrayList;


public class Bibloteca {
    ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Bibloteca(){} //constr vacio

    public boolean agregar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
        return true;
    }
    public boolean quitar(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
        return true;
    }
    public  Ejemplar buscarXCodigo(int codigo){
        for(Ejemplar i: ejemplares){
            if(i.getCodigo()== codigo)
                return i;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bibloteca" + "\n" + ejemplares ;

    }
}
