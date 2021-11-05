package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lista {

    public static void main(String[] args) {

        // Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.



        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("David");
        nombres.add("Macarena");
        nombres.add("Andrés");
        nombres.add("Olivia");

        LinkedList<String> nombresEnlazados = new LinkedList<String>(nombres);

        nombresEnlazados.add("Julio");

        for(int i = 0; i < nombresEnlazados.size(); i++){

            System.out.println(nombresEnlazados.get(i));

        }

        for(int i = 0; i < nombres.size(); i++){

            System.out.println(nombres.get(i));

        }


    }
}
