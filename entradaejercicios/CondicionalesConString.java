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
public class CondicionalesConString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entra=new Scanner(System.in);
        /*System.out.println("Escribe una opción:\n1:acceso:\n2:configuracion:\n3:ayuda:");
        String seleccion=entra.nextLine();
        seleccion=seleccion.toLowerCase();//con la propiedad de String llamada toLowerCase() te lo convierte todo a minuscula. Si ponemos toUpperCase(), te lo convierte todo a mayusculas.
        switch(seleccion){
            case "acceso":
                System.out.println("Seleccionaste el acceso");
            break;
            case "configuracion":
                System.out.println("Seleccionaste la configuración");
            break;
            case "ayuda":
                System.out.println("Seleccionaste la ayuda");
            break;    
            default:
                System.out.println("Opción no válida");
            break;
        }
        
        
        String cadena=JOptionPane.showInputDialog("Escribe el nombre de tu futuro perrito:\n1:ranita:\n2:sapito:\n3:primarykey:");
        switch(cadena.toLowerCase()){
            case "ranita":
                JOptionPane.showMessageDialog(null,"No me gusta");
            break;
            case "sapito":
                JOptionPane.showMessageDialog(null,"No me mola");
            break;
            case "primarykey":
                JOptionPane.showMessageDialog(null,"Chachi. ¡¡Me flipa ese nombre!!");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Opción no válida");
            break;
            
            
        }
                  
            JOptionPane.showMessageDialog(null,"Vuelve pronto");*/
        
        System.out.println("Salúdame por favor");
        String respuesta=entra.nextLine();
        respuesta=respuesta.toLowerCase();
        //if(respuesta=="hola"){//Esto estaría mal. Para poder comparar 2 cadenas de texto dentro de 2 strings hay que usar la propiedad .equals() y dentro de los parentesis el texto entre comillas. 
        if(respuesta.equals("hola")==true){    
            System.out.println("¿Cómo estás?");
        }
        else{
            System.out.println("No te entiendo");
        }
    }
    
}

