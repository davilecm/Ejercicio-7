package com.company;


public class Main {

    /*

    Dada la función:

    public static String reverse(String texto) {
    Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".

     */

    public static void main(String[] args) {

        String HolaMundo = "Hola Mundo";
        String resultado = reverse(HolaMundo);

        System.out.println(HolaMundo);
        System.out.println(resultado);

    }

    public static String reverse(String HolaMundo) {

        if (HolaMundo.length() == 1)
            return HolaMundo;

        else
            return reverse(HolaMundo.substring(1)) + HolaMundo.charAt(0);

    }

    }


