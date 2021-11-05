package com.company;

import java.util.Vector;

public class Vectores {


    // Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.


    public static void main(String[] args) {

        Vector<String> vector = new Vector();

        vector.add("Ramón");
        vector.add("Julia");
        vector.add("David");
        vector.add("Mónica");
        vector.add("Verónica");

        vector.remove(1);
        vector.remove(2);

        System.out.println("Mostrar nombres:" + vector);

    }

    /*

     Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.

    El problema sería que cuando sobrepasa la capacidad tiene que volver a compilar y crearse de nuevo, asi que tiene mucho costo de compilación.
    Por ello tenemos que pensar muy bien la capacidad porque como sobrepase el programa ira más lento ya que tiene que compilar y copiar de nuevo

     */

}
