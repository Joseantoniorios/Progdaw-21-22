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
public class CicloConWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Para que cuente de 1 a 9
        /*int i=0;
        while(i<=10){
            System.out.println("i= "+i);
            i=i+1;
        }
        System.out.println("\n");
        //Para que cuente de 9 a 1
        int j=10;
        while(j>=0){
            System.out.println("i= "+j);
            j-=1;
        }
        */
        /*
        Scanner entra=new Scanner(System.in);
        System.out.println("Elige cuenta progresiva o regresiva(Escribe progresiva o regresiva): ");
        String elige=entra.nextLine();
        if (elige.equals("progresiva")==true){//para comparar 2 cadenas de texto, usa la propiedad equals
            int k=0;
            while(k<=10){
                System.out.println("k= "+k);
                k+=1;
            }
        }
        else if(elige.equals("regresiva")==true){
            int l=10;
            while(l>=0){
                System.out.println("l= "+l);
                l-=1;                    
            }    
        }
        else{
            System.out.println("Introdujiste mal la palabra");
            
        }
        */
        String cadena=JOptionPane.showInputDialog("Escribe sube o baja: ");
        if (cadena.equals("sube")==true){
        int m=0;
        while(m<=10){
            JOptionPane.showMessageDialog(null,"m: "+m);
            m+=1;
            }
        }
        else if(cadena.equals("baja")==true){
        int n=10;
        while(n>=0){
            JOptionPane.showMessageDialog(null,"n: "+n);
            n-=1;    
            }        
        }
        
        
    }        
        
        
}
    


