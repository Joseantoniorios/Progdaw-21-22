/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**Creamos una aplicación que dibuje una escalera de asteriscos.Nosotros le pasamos la altura de la escalera por teclado.
 *
 * @author joseantonioriosgonzalez
 */
public class EjercicioDibujarEscaleraConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String entra=JOptionPane.showInputDialog("Humano, dame la altura de la escalera");
        int altura=Integer.parseInt(entra);
        for(int numAsterisco=1;numAsterisco<=altura;numAsterisco++){
            for(int i=1;i<=numAsterisco;i++){
            System.out.print("🐈‍");
            }
            System.out.println("");
        }
        
        
        
        Scanner entra2=new Scanner(System.in);
        System.out.println("Escribeme la altura de tu escalera invertida: ");
        int altura2=entra2.nextInt();
        for(int numGatos=altura2;numGatos>0;numGatos--){
            for(int j=numGatos;j>0;j--){
                System.out.print("🐈‍");
            }
                System.out.println("");

        }
               
  
        
        Scanner entra3=new Scanner(System.in);
        System.out.println("Dame la altura de tu escalera invertida: ");
        int altura3=entra3.nextInt();
        for(int numConejos=altura3;numConejos>0;numConejos--){
            for(int k=numConejos;k>0;k--){
                System.out.print("🐇");
            }
            System.out.println("");
        }
          
        Scanner entra4=new Scanner(System.in);
        System.out.println("Dame la altura de la escalera: ");
        int altura4=entra4.nextInt();
        for(int numHamster=0;numHamster<altura4;numHamster++){
            for(int l=0;l<numHamster;l++){
                System.out.print("🐹");
            }
                System.out.println("");
        }
                
    }
    
    
}


