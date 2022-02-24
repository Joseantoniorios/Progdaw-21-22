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
public class CicloConWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i=1; 
        while(i<10){
            System.out.println("i="+i);
            i=i+1;
        }
        
        System.out.println("");
        int cuentaatras=10;
        while(cuentaatras>=0){
            System.out.println("cuentaatras:"+cuentaatras);
            cuentaatras=cuentaatras-1;
        }
        
        System.out.println("");
        Scanner entra=new Scanner(System.in);
        System.out.println("Humano, cual es el numero maximo al que llegar?");
        int repeticiones= entra.nextInt();
        int j=1;
        while(j<=repeticiones){
            System.out.println("j="+j);
            j++;
        }
        
        System.out.println("");
        Scanner entra2=new Scanner(System.in);
        System.out.println("Humano, cual es el numero maximo al que llegar?");
        int repeticiones2= entra2.nextInt();
        int k=1;
        while(k<=repeticiones2){
            System.out.println("k="+k);
            k=k*2;
        }
        
    }
    
}
