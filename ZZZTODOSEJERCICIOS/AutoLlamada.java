/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entradaejercicios;//como la clase auto está dentro de nuestro mismo paquete, no hay que mandarlo importar.
 

/**
 *
 * @author joseantonioriosgonzalez
 */
public class AutoLlamada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto vocho=new Auto();
        vocho.modelo="1980";
        vocho.marca="vocho";
        vocho.color="azul";
        
        vocho.MeterLLave("123456");
        vocho.mando("enciende");
        
        
        /*
        vocho.enciende();
        vocho.acelera();
        vocho.frena();
        System.out.println("Marca "+vocho.marca);
        */
        
    }
    
}

