package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Pila mipila = new Pila();



        try {
            String palabra11 = mipila.pila_pop();
            System.out.println("el valor es: " + palabra11);
            mipila.pila_anyadir("intento1");
            mipila.pila_anyadir("intento2");
            mipila.pila_anyadir("intento3");
            mipila.pila_anyadir("intento4");
            mipila.pila_anyadir("intento5");

            mipila.pila_anyadir("intento6");
            String palabra12 = mipila.pila_pop();
            System.out.println("el valor es: " + palabra12);

            if (mipila.pila_estadentro("intento3") == true) {
                System.out.println("esta dentro");
            } else
                System.out.printf("no esta dentro");

            int valor;
            valor = mipila.pila_dimelaposicion("intento4");
            System.out.println("la posicion es " + valor);
        } catch (PilaLlena e) {
            System.out.println(e.getMessage());
        } catch (PilaVacia e) {
            System.out.println(e.getMessage());
        }
    }

    /*

        mipila.pila_anyadir( "intento1");

        if (mipila.pila_vacia()==-1) {
            System.out.println("estavacia");
        }
        else if (mipila.pila_vacia()==0) {
        System.out.println("hay algo");
        }

        //comprobacion eleiminar

        String valor1=mipila.pila_pop();
        System.out.println("la palabra es:" + valor1);

        if (mipila.pila_vacia()==-1) {
            System.out.println("estavacia");
        }
        else if (mipila.pila_vacia()==0) {
            System.out.println("hay algo");
        }*/
}






