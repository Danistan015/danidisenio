/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import Modelo.Atencion;
import Modelo.Cliente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import util.Cola;
import util.ListaGen;

/**
 *
 * @author sotog
 */
public class Singleton {

    public static Singleton INSTANCE = new Singleton();
    Cola<Cliente> clientes;
    ListaGen<Atencion> historial;

    public Singleton() {
        clientes = leerCliente();
        historial = leerHistorial();

    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(Singleton INSTANCE) {
        Singleton.INSTANCE = INSTANCE;
    }

    public Cola<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cola<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ListaGen<Atencion> getHistorial() {
        return historial;
    }

    public void setHistorial(ListaGen<Atencion> historial) {
        this.historial = historial;
    }

    public Cola<Cliente> leerCliente() {
        try {
            FileInputStream archivo = new FileInputStream("Cliente.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Cola<Cliente>) lector.readObject();
        } catch (IOException | ClassNotFoundException e) {
            Cola<Cliente> aux = new Cola<>();
            return aux;
        }
    }

    public void escribirCliente() {
        try {
            FileOutputStream archivo = new FileOutputStream("cliente.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(clientes);
        } catch (IOException e) {

        }
    }

    public ListaGen<Atencion> leerHistorial() {
        try {
            FileInputStream archivo = new FileInputStream("Atencion.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ListaGen<Atencion>) lector.readObject();
        } catch (IOException | ClassNotFoundException e) {
            ListaGen<Atencion> aux = new ListaGen<>();
            return aux;
        }
    }

    public void escribirHistorial() {
        try {
            FileOutputStream archivo = new FileOutputStream("Atencion.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(historial);
        } catch (IOException e) {

        }
    }

}
