/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;


/**
 *
 * @author sotog
 */
public class Cola<T> implements Serializable{

    Nodo<T> inicioCola, finalCola;
    String cola = "";

    public Cola() {
        this.inicioCola = null;
        this.finalCola = null;
    }
    // Saber si esta la cola vacia

    public boolean ColaVacia() {
        return inicioCola==null;
        
    }

    // Insertar a la cola
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.dato = dato;
        nuevo.sigNodo = null;
        if (ColaVacia()) {
            inicioCola = nuevo;
            finalCola = nuevo;
        } else {
            finalCola.sigNodo = nuevo;
            finalCola = nuevo;
        }
    }

//Extraer de la cola
    public T extraer() {
        if (!ColaVacia()) {
            T dato = inicioCola.dato;
            if (inicioCola == finalCola) {
                inicioCola = null;
            } else {
                inicioCola = inicioCola.sigNodo;
            }
            return dato;
        } else {
            return null;
        }
    }
//Mostrar datos
    
    public T mostrarPrimer() {
        if (ColaVacia()) {
            return null;
        } else {
         
            return inicioCola.getDato();

        }

    }
}
