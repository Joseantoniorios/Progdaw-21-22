/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class CondicionalesSentenciaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Scanner entra=new Scanner(System.in);// entra va a ser una nueva instancia de Scanner, al que le vamos a pasar un parametro: System(in). Con esto recibe los paramatros de la consola
        int numUser,numSis,numUser2,numSis2,numSis3;
        numSis=(int)(Math.random()*10);
        System.out.print("Ingresa este numero   "+numSis+" ");//si pusieramos \n tiene que ser entre comillas para que salte de linea.
        numUser=entra.nextInt();//ese numero que se va a ingresar lo vamos a recibir en entra.Next y va a ser del tipo entero.
        if(numUser==numSis){// un solo igual es asignación, dos iguales es comparación
            System.out.println("Muy bien");   
        }        
        //if(numUser!=numSis){
        //    System.out.println("Muy mal");
        //}
        else{// ponemos else para acoger aqui todas las demas opciones, sin tener que especificarlas
            System.out.println("Muy mal");
        }
        */
        /*Scanner entra2=new Scanner(System.in);    
        int numSis2=(int)(Math.random()*10);
            System.out.println("Ingresa este segundo numero   "+numSis2+" ");
            int numUser2=entra2.nextInt();
            if(numUser2>numSis2){
                System.out.println("Tu numero es mayor que el que te di"); 
            }
            else{
                System.out.println("Muy mal en este segundo número");
            }
            */
            
        int numSis3=(int)(Math.random()*10);
            int numUser3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa este tercer número: "+numSis3+" "));
            if (numUser3==numSis3){//Usamos la sentencia if. Usamos la palabra reservada if y despues entre parentesis una condicion
                JOptionPane.showMessageDialog(null,"Correcto.Es el mismo número.");
            }
            else if (numUser3>numSis3){//para seguir poniendo condiciones hay que poner else if. Con if no vale.
                JOptionPane.showMessageDialog(null,"Tu número es mayor que el que te di");
            }
            else{
                JOptionPane.showMessageDialog(null,"Metiste un número menor del que te di");
            }
            
                  
            /*int numSis4=(int)Math.random()*10;
            int numUser4=Integer.parseInt(JOptionPane.showInputDialog("Ingresa este cuarto número: "+numSis4+" "));
            if(numUser4 > numSis4 || numUser4 == numSis4){// esto es lo mismo que si pusieramos numUser4 >= numSis4
                JOptionPane.showMessageDialog(null,"Tu número es mayor o igual al que te di");
            }  
            else if(numUser4 <= numSis4){
                JOptionPane.showMessageDialog(null,"Tu número es menor que el que te di" );
            }  
            }    */
            /*
            int numSis5=(int)(Math.random()*10);
            int numUser5=Integer.parseInt(JOptionPane.showInputDialog("Ingresa este quinto número: "+numSis5+": "));
                if(numUser5==numSis5){
                    JOptionPane.showMessageDialog(null,"Tu número coincide");
                }    
                else if(numUser5>numSis5 && numUser5>=0){//preguntamos con un y
                    JOptionPane.showMessageDialog(null,"Tu número es mayor que el número que te pedí");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Tu número es menor que el que te di y además es negativo");
                
                }
            */    
    }

    
}
            
    
           
       

        
    

