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
public class EjercicioCondicionalesAnidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Scanner entra=new Scanner(System.in);
        System.out.println("Entregáme un número entre 1 y 999");
        int num=entra.nextInt();
        if(num>0 && num<10){
            System.out.println("Tu número consta de un solo digito");
        }
        else{
            if(num>=10 && num<100){
                System.out.println("Tu número consta de dos dígitos");   
            }
            else{
                if(num >=100 && num<1000){
                    System.out.println("Tu número consta de 3 dígitos");
                }
            }
        }*/
        
        
        int seleccion2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 999"));
        if (seleccion2 >0 && seleccion2<10){
            JOptionPane.showMessageDialog(null,"Tu número consta de un dígito");
        }
        else if(seleccion2 >=10 && seleccion2<100){
            JOptionPane.showMessageDialog(null,"Tu número consta de dos dígitos");
        }    
        else if(seleccion2 >=100 && seleccion2<1000){
            JOptionPane.showMessageDialog(null,"Tu número consta de tres dígitos");
        }
        else{
            JOptionPane.showMessageDialog(null,"Introduciste un número incorrecto.");
        }
    }    
}    

