package com.company;

import java.io.*;

public class Fichero {

    public static void main(String[] args) {

        /*

        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

         */

        String filein;
        String fileout = "Hola";
        String resultado = filein(fileout);

    }


    public static String filein (String archivosalida) {

        try {

            InputStream filein = new FileInputStream("C:\\Users\\DAVID\\hola.txt");

            byte[] datos = filein.readAllBytes();

            PrintStream fileout = new PrintStream("copia.txt");
            fileout.write(datos);

        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());

        }

    return archivosalida;}

}

