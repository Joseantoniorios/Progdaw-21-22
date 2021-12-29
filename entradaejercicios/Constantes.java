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
public class Constantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final Byte mordida;//al ponerle "final" delante no se puede volver a asignar otro valor a esa variable que pasa a ser constante
        mordida=(byte)126.55;
        System.out.println("mordida=+mordida");
        
        float pi=3.1415f;
        float res=pi*2;
        System.out.println("pi*2="+res);
        
        Integer entero;
        entero=(int)32000.56;//aqui estamos haciendo un casting
        System.out.println("entero="+entero);
        
        Long largo;
        largo=(long)32000;//es lo mismo que 32000l. Hay que hacer un casting aquí para usar el envoltorio
        System.out.println("largo="+largo);   
        
        Float flotante;
        flotante=mordida.floatValue();//2º con .floatValue() lo estoy convirtiendo a flotante
        System.out.println("flotante="+flotante);
        
        Double doble;
        doble=32000.55;//doble sí acepta el decimal sin tener que hacer casting
        System.out.println("doble="+doble);
     
        char caracter;// un caracter es primitivo de por si. No se convierte
        caracter='c';//char solo admite un caracter. Hay que poner comillas simples
        System.out.println("caracter="+caracter);
        
        Boolean boleano;
        boleano=true;//boolean solo recibe 2 valores: true o false
        System.out.println("boleano="+boleano);
        
        String cadena;
        cadena="cadena";//los cadenas son con comillas dobles
        System.out.println("cadena="+cadena);
    }
    
}
