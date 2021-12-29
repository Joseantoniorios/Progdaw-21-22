/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class CondicionalesSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* Scanner entra=new Scanner(System.in);
        System.out.println("Seleccione una opción\n1: Acceso\n2: Configuración\n3: Ayuda");
        int seleccion=entra.nextInt();
        switch(seleccion){
            case 1:
                System.out.println("Seleccionaste el acceso");
                break;
            case 2:
                System.out.println("Seleccionaste la configuración");
                break;
            case 3:
                System.out.println("Seleccionaste la ayuda");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }*/
        
        /*Scanner entra2=new Scanner(System.in);
        System.out.println("¿Cómo se llaman tus gatitos?\n");
        System.out.println("Seleccione una opción\n1:Sam y Dean\n2:Trancas y Barrancas\n3:Epi y Blas");
        int seleccion2=entra2.nextInt();
        switch(seleccion2){
            case 1:
                System.out.println("Exacto. Y además son muy sabrositos los dos.");
            break;
            case 2:
                System.out.println("No es correcto.");
            break;
            case 3:
                System.out.println("Pues va a ser que no.");
            break;
            default:
                System.out.println("Opción no válida");
            break; 
            
        }*/
        
        int entra3=Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n1:Sam y Dean\n2:Trancas y Barrancas\n3:Epi y Blas"));
        switch(entra3){
            case 1:
                JOptionPane.showMessageDialog(null,"Exacto. Y además son muy sabrositos los dos.");
            break;//un if también puede tener un break
            case 2:
                JOptionPane.showMessageDialog(null,"No es correcto.");
            break;
            case 3:
                JOptionPane.showMessageDialog(null,"Pues va a ser que no.");
            break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opción válida.");
            break;    
        }
        
       
    }

   
    
    
}
