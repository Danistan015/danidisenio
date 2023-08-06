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
public class ListaGen<T> implements Serializable{

    Nodo<T> primero;
    int tamanio;

    public ListaGen() {
        this.tamanio = 0;
        this.primero = null;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void add(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (primero == null) {
            this.primero = nuevo;
        } else {
            Nodo<T> aux = primero;
            while (aux.sigNodo != null) {
                aux = aux.sigNodo;
            }
            aux.sigNodo = nuevo;
        }
        tamanio++;
    }

    public T getIndex(int index) {
        validarIndedx(index);
        if (index == 0) {
            return this.primero.dato;
        } else {
            Nodo<T> aux = primero;
            int contador = 0;
            while (contador < index) {
                aux = aux.sigNodo;
                contador++;
            }
            return aux.dato;

        }
    }

    public void remove(int index) {
        validarIndedx(index);
        if (index == 0) {
            this.primero = primero.sigNodo;
        } else {
            Nodo<T> aux = primero;
            int contador = 0;
            while (contador < index - 1) {
                aux = aux.sigNodo;
                contador++;
            }
            aux.sigNodo = aux.sigNodo.sigNodo;
        }
        tamanio--;
    }

    public void addIndex(T dato, int index) {
        validarIndedx(index);
        Nodo<T> nuevo = new Nodo<>(dato);
        if (primero == null && index == 0) {
            this.primero = nuevo;
        } else if (primero != null && index == 0) {
            nuevo.sigNodo = primero;
            primero=nuevo;
        } else {
            Nodo<T> aux = primero;
            int contador = 0;
            while (contador < index - 1) {
                aux = aux.sigNodo;
                contador++;
            }
            nuevo.sigNodo = aux.sigNodo;
            aux.sigNodo = nuevo;
        }
        tamanio++;
    }

   
        
        
    
    public void validarIndedx(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= tamanio) {
            throw new IndexOutOfBoundsException("No existe ese index: " + index);
        }
    }
}
