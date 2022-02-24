/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author joseantonioriosgonzalez
 */
public class EjercicioAdivinarUnNumeroRandomEnJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand= new Random();
        int aleatorio=rand.nextInt(5)+1;
        int num= Integer.parseInt(JOptionPane.showInputDialog("Humano,¿qué número estoy pensando entre 1 y 5?"));
        while(num!=aleatorio){
            num= Integer.parseInt(JOptionPane.showInputDialog("Humano, te equivocaste. Otra oportunidad, venga...¿qué número estoy pensando entre 1 y 5?"));
            if(num==0){
                break;//el break hace que se salga de los ciclos siempre, tanto si es switch como bucle.
                      //La sentencia break hace que se salga del bucle inmediatamente por lo que no se ejecutara ni el código que se encuentre después del break en esa misma iteración ni ninguna de las posibles iteraciones restantes.
            }    
            
            aleatorio=rand.nextInt(3)+1;
            
        }
            if(num!=0){
                JOptionPane.showMessageDialog(null,"Bien jugado, humano");
            }
            else{
                JOptionPane.showMessageDialog(null,"Te dije entre 1 y 5. Muy mal, humano. Venga..., ¿qué número esoy pensando entre 1 y 5? ");
            }
    }

    
    
}
