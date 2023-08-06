/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sotog
 */
public class Atencion implements Serializable {

    private Date fechaAtencion;
    
    private String diagnostico;
    private Cliente cliente;
    private Dentista dentista;
    private boolean completa;

    public Atencion(Cliente clientes, Dentista dentista,String diagnostico) {
        this.fechaAtencion = new Date();
        this.completa = false;
        this.diagnostico= diagnostico;
        
        this.cliente = clientes;
        this.dentista = dentista;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

   

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

}
