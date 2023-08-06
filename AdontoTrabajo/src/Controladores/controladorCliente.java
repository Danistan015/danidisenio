/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;


import Modelo.Cliente;
import Singleton.Singleton;
import util.Cola;

/**
 *
 * @author sotog
 */
public class controladorCliente {

    private Cola<Cliente> clientes;
    
   

    public controladorCliente() {
        clientes = Singleton.getINSTANCE().getClientes();
    }

    
    

    public void añadirCliente(Cliente cliente) {
        clientes.insertar(cliente);
        Singleton.getINSTANCE().escribirCliente();

    }
   
    
   

}
