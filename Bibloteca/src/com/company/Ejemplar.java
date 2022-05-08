package com.company;



public abstract class Ejemplar {
    private int anio;
    private int codigo;
    private boolean disponible;
   // private int id=1;

    public Ejemplar(int anio, int codigo) {
        this.anio = anio;
        this.codigo = codigo; //this.id=id++;
        this.disponible = true;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "anio=" + anio +
                "codigo=" + codigo +
                "disponible=" + disponible +
                "\n";
    }
}
