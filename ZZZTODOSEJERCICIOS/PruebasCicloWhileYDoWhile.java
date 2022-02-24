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
public class PruebasCicloWhileYDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand=new Random();
        System.out.println("En la prmitiva han salido los siguientes números: ");
        
        int i=0;
        while(i<6){
            int tirada=rand.nextInt(49)+1;
            System.out.println(tirada);
            i++;
        }
        
        int j=0;
        do{            
            int tirada=rand.nextInt(49)+1;
            System.out.println("El número complementario es el :"+tirada+"\n");
            j++;
        }while(j<1);
        
        Random rand2=new Random();
        System.out.println("El reintegro es el número :"+(rand2.nextInt(10)+1)+"\n");
        JOptionPane.showInputDialog("¿Te has forrado como una perra?");
        JOptionPane.showMessageDialog(null,"¿A qué te has comido un mojón comprando primitiva? jijij");
        }
        
}
