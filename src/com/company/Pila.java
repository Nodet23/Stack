package com.company;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by Nodet on 12/03/2017.
 */
public class Pila {

    private ArrayList<String> elementos = new ArrayList<String>(5);

    public Pila() {        // constructor de mi CLASE


    }

    public int pila_vacia() { //no hace falta pasarle la pila xq estamos en la clase pila

        if (elementos.size() == 0) {
            return -1;
        } else {
            return 0;

        }
    }

    public int pila_llena() {

        if (elementos.size() == 5)
            return -1;
        else
            return 0;
    }

    public void pila_anyadir(String palabra) throws PilaLlena {
        if (this.pila_llena() == 0)
            elementos.add(palabra);
        else throw new PilaLlena();
    }

    public String pop_peak() throws PilaVacia {
        if (this.pila_vacia() == 0) {
            int tamanyo = elementos.size();

            String nuevapalabra = elementos.get(tamanyo - 1);

            return nuevapalabra;
        } else {

            throw new PilaVacia();
        }
    }

    public String pila_pop() throws PilaVacia {
        if (this.pila_vacia() == 0) {
            int tamanyo = elementos.size();

            String nuevapalabra = elementos.get(tamanyo - 1); // el tamaño es 1 xq hay una cosa, xro se coloca en la posicion 0 , u feel bro?
            elementos.remove(tamanyo - 1);
            return nuevapalabra;
        } else {

            throw new PilaVacia();
        }

    }


    public boolean pila_estadentro(String palabra_buscar) {


            if (elementos.contains(palabra_buscar)){ // podria hacer return de elemntos.contains xq esta ya devuelve un bolean

            return true;
        }
        return false;
    }

    public int pila_dimelaposicion(String palabra_buscar) {
        int devolver=-1;

        for (int i=0; i< elementos.size(); i++){
            if (elementos.get(i).equals(palabra_buscar)){
                devolver=i;                             // hacemos esto xra evitar que solo compare 1 y qe asi busqe todos
                return devolver;                        // solo devolvera en caso de qe entre sino, usara el otro return qe pa algo esta
            }


        }
        return devolver;

    }
}
