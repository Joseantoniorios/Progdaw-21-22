/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Random;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class CicloConDoWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*int i=1;
        do{
            System.out.println("i= "+i);
            i++;
        }while(i<=10);    
        
        System.out.println("");
        int j=10;
        do{
            System.out.println("j= "+j);
            j--;
        }while(j>=0);
        
        System.out.println("");
        
        Random rand=new Random();
        int aleatorio=rand.nextInt(6)+1;
        System.out.println("aleatorio= "+aleatorio);
        int k=1;
        do{
            System.out.println("k= "+k);
            k++;
        }while(k<=aleatorio);
       */ 
        Random rand2=new Random();
        int aleatorio2=rand2.nextInt(6);
        do{
            int a=2;
            switch(aleatorio2){
                case 1:
                    System.out.println("rojo");
                break;
                case 2:
                    System.out.println("verde");
                break;
                case 3:
                    System.out.println("azul");
                break;
                case 4:
                    System.out.println("amarillo");
                break;
                default:
                    System.out.println("blanco");
                break; 
                
            
            }aleatorio2=rand2.nextInt(6);    
        }while(aleatorio2!=3);
                    
            System.out.println("");
            
    }        
}        
//Este programa me costó mucho acabarlo bien. Prestar atención porque hay un monton de cosas aqui en donde prestar atencion.
//Las variables declaradas en zonas anidadas, no se puede acudir a ellas desde fuera!!!
//Pero al revés, sí.
    
        
          

