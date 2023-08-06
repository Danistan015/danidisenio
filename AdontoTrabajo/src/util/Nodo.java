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
public class Nodo<T> implements Serializable{
    T dato;
    Nodo<T> sigNodo;
//solo es necesario esto
    public Nodo(T dato) {
        this.dato= dato;
        this.sigNodo=null;
    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSigNodo() {
        return sigNodo;
    }
    

}
