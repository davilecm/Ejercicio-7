package com.company;

public class UniBidi {

    public static void main(String[] args) {

        /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.

        Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.

         */

        String nombres[] = {
                "Jorge",
                "Alicia",
                "Raul",
                "Gema"
        };

        for (int i = 0; i < nombres.length; i++) {

            System.out.println("Nombres a mostrar: " + nombres[i]);

        }


        int arrayBidi[][] = new int[3][4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 1;
        arrayBidi[0][2] = 2;
        arrayBidi[0][3] = 3;


        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        arrayBidi[2][0] = 50;
        arrayBidi[2][1] = 60;
        arrayBidi[2][2] = 70;
        arrayBidi[2][3] = 80;

        for (int i = 0; i < arrayBidi.length; i++) {

            System.out.println("Muestrame filas: " + i);

            for (int j = 0; j < arrayBidi[1].length; j++) {

                System.out.println("Estoy en la fila = " + i + ", columna = " + j);
                System.out.println(arrayBidi[i][j]);

            }

        }
    }
}
