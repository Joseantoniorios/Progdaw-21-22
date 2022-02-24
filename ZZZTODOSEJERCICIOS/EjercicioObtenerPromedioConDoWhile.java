/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class EjercicioObtenerPromedioConDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador=0;
        float calificacion=0, suma=0, promedio;
        String texto;
        do{
            texto=JOptionPane.showInputDialog("Ingresa la calificación del semestre "+(contador+1));
            System.out.println(texto);
            if(texto!=null){//Si a JOptionPane le doy a cancelar, se va a detener
                calificacion=Float.parseFloat(texto);
                suma=suma+calificacion;
                contador++;
            }
        }while(texto!=null);
        if(contador>0){  
        promedio=suma/contador;
        JOptionPane.showMessageDialog(null,"Promedio= "+promedio);
        }
        else{
        JOptionPane.showMessageDialog(null,"Humano estúpido, debes poner al menos una calificación.");
        
        }
    }
}
