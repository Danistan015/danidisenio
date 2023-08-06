/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelo.Atencion;
import Modelo.Cliente;
import Modelo.Dentista;
import Singleton.Singleton;
import java.util.Date;
import util.Cola;
import util.ListaGen;

/**
 *
 * @author sotog
 */
public class controladorAtencion {
     private ListaGen<Atencion> historial;
     private Cola<Cliente> clientes;

    public controladorAtencion() {
        historial= Singleton.getINSTANCE().getHistorial();
        clientes= Singleton.getINSTANCE().getClientes();
        
    }
     public void añadirHistorial(Atencion atencion){
        historial.add(atencion);
        Singleton.getINSTANCE().getHistorial();
        
    }

    public ListaGen<Atencion> getHistorial() {
        return historial;
    }

    public Cola<Cliente> getClientes() {
        return clientes;
    }
     
    
   public Cliente pasarAtencion(){
       Cliente aux= clientes.extraer();
       Singleton.getINSTANCE().escribirCliente();
       return aux;
   }
    
   public  Cliente mostrarSiguiente(){
       return clientes.mostrarPrimer();
   }
   
   public void fechaAtencion(Atencion fecha){
       fecha.setFechaAtencion(new Date());
       fecha.setCompleta(true);
       Singleton.getINSTANCE().escribirHistorial();
   }
   
   
   
  public void agregarHistorial(Atencion atencion){
      historial.add(atencion);
      Singleton.getINSTANCE().escribirHistorial();
  }
 
  

}
