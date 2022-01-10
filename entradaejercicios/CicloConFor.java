/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class CicloConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*for(int i=1;i<=10;i++){
            System.out.println("i= "+i);
        }
        
        for(int i=10;i<=1;i--){
            System.out.println("i= "+i);
        }*/
        
        Scanner entra=new Scanner(System.in);
        System.out.println("Cuántos segundos quieres contar hacia atras?: ");
        int repeticiones=entra.nextInt();
        System.out.println("");
        for(int i=repeticiones;i>=0;i--){
            System.out.println(i);
        }    
            
        System.out.println("");
        
        for(int j=1;j<=10;j++){
            System.out.println("j= "+j );
        }
        
        System.out.println("");
        
        for(int k=10;k>=0;k--){
            System.out.println("k= "+k);
        }
            
    }
             
}
    
