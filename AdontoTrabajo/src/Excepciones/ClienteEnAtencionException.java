/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author sotog
 */
public class ClienteEnAtencionException extends RuntimeException{

    public ClienteEnAtencionException() {
        JOptionPane.showMessageDialog(null, "HAY UN CLIENTE EN ATENCION");
    }
    
    
}
