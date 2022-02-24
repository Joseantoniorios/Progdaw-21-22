/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class VariablesPrimitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int entero;
        entero=(int)32000.56;//aqui estamos haciendo un casting
        System.out.println("entero="+entero);
        
        float flotante;
        flotante=32000.55f;/*32000.55f es lo mismo que (float)32000.55. En verdad 
        lo que estás haciendo es un casting*/
        System.out.println("flotante="+flotante);
        
        double doble;
        doble=32000.55;//doble sí acepta el decimal sin tener que hacer casting
        System.out.println("doble="+doble);
     
        char caracter;
        caracter='c';//char solo admite un caracter. Hay que poner comillas simples
        System.out.println("caracter="+caracter);
        
        boolean boleano;
        boleano=true;//boolean solo recibe 2 valores: true o false
        System.out.println("boleano="+boleano);
    }
    
}
