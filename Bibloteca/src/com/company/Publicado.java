package com.company;

import java.util.UUID;

public class Publicado extends Ejemplar{
    private String titulado;

    public Publicado(int anio, int codigo,  String titulado) {
        super(anio, codigo);
        this.titulado = titulado;
    }

    @Override
    public String toString() {
        return "titulado= " + titulado + "\n" + "anio:" + this.getAnio() + "\n" + "codigo:" + this.getCodigo() +
               "\n";
    }
}
