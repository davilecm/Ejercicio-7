package com.company;

public class Error {

    public static void main(String[] args) {

        /*

        Crea una función DividePorCero.
        Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
        Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

         */


        int numero = 5;
        int numero2 = 0;

        try  {
            DividePorCero(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }finally{
            System.out.println("Demo código");
        }
    }

    public static int DividePorCero(int numero, int numero2) {

        int resultado = 0;

        try{
            resultado = numero / numero2;
        }catch(ArithmeticException e){
            throw new ArithmeticException();
        }
      return resultado;

    }

}

