package com.company;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Bibloteca> bibloteca= new ArrayList<>();
        ArrayList<Bibloteca> alquilado= new ArrayList<>(); //creo dos listas

        Bibloteca b1 = new Bibloteca();
        Bibloteca b2=new Bibloteca(); //creo los obj

        bibloteca.add(b1);
        alquilado.add(b2);//agrego los objetos a las listas

        b1.agregar(new Libro(1990,1,"hunger games", Genero.CIENCIA_FICCION));
        b1.agregar(new Libro(2007,2,"50 sombras", Genero.EROTICO));
        b1.agregar(new Libro(1980,3,"estudio en rojo", Genero.POLICIAL));

        b1.agregar(new Revista(1999,4,"Caras"));
        b1.agregar(new Revista(2003,5,"Gente"));
        b1.agregar(new Revista(2020,6,"Forbes"));

        b1.agregar(new Diario(1980,7,"La nacion"));
        b1.agregar(new Diario(1940,8,"Clarin"));
        b1.agregar(new Diario(2000,9,"New york times"));

        Ejemplar eje= bibloteca.get(0).buscarXCodigo(2); //quiero usar UUID pero son muy grandes y me da paja

        if(eje!=null) {
            if (eje instanceof Libro) {
                if (((Libro) eje).alquilar()) {
                    b2.agregar(eje);
                    b1.quitar(eje);
                    System.out.println("El libro se alquilo correctamente");
                } else {
                    ((Libro) eje).alquilado();
                    System.out.println("El libro esta alquilado");
                }
            }
        }
        System.out.println(bibloteca);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Mostrando alquilados : \n");
        System.out.println(alquilado);


        //System.out.println(bibloteca);
    }
}
/*Ejercicio Repaso

Roberto tiene 2 bibliotecas, ambas almacenan libros, diarios y revistas.
Los cuales tienen las siguientes caracteristicas: codigo, titulo (o titular en caso de los diarios y revistas)
y año de publicacion, que son pasadas por parametro al momento de crear los objetos.
Los libros pueden ser de distintos generos, novelas, cuentos, etc.
Los libros y las revistas poseen los siguientes metodos : alquilar(), devolver() y alquilado().
Los diarios solo se pueden leer en la biblioteca y Roberto quiere saber si el diario se esta leyendo o no.

Cosas obligatorias del ejercicio:

Superclase para aplicar herencia
Interfaz
Enum


Crear 3 libros (de distinto genero), 3 revistas y 3 diarios
Alquilar un libro y devolverlo
Mostrar errores si se quiere alquilar un libro alquilado
Mostrar errores si se quiere devolver una revista devuelta
Mostrar errores si se esta leyendo un diario

Mostrar un listado de libros, revistas y diarios disponibles y no disponibles. */