/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;//hace falta importar esta clase para usar Scanner

/**
 *
 * @author joseantonioriosgonzalez
 */
public class IngresarDatosPorConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);/*instanciamos un objeto de la clase Scanner, llamado entrada. Scanner entrada va a ser una instancia de un nuevo objeto de tipo Scanner. Y lo vamos a inicializar con System.in, porque le estamos pasando nuestra consola para la parte de entrada de datos.En principio nos da error porque no tenemos la clase scanner y hay que mandarla llamar. ¿Cómo la importamos? */        
        int entero;
        System.out.println("Escribe un entero:");
        entero=entrada.nextInt();/*con entrada.nextInt() se le permite al usuario ingresar un entero.Y eso q va a ingresar lo guardamos en entero */
        System.out.println("Tu numero es: "+entero);
        
        //si queremos recibir un valor de coma flotante, hay que instanciarlo con coma flotante, o mandar a pedir un coma flotante.
        
        Scanner entrada2=new Scanner(System.in);/*instanciamos un objeto de la clase Scanner, llamado entrada. Scanner entrada va a ser una instancia de un nuevo objeto de tipo Scanner. Y lo vamos a inicializar con System.in, porque le estamos pasando nuestra consola para la parte de entrada de datos.En principio nos da error porque no tenemos la clase scanner y hay que mandarla llamar. ¿Cómo la importamos? */        
        float valor;
        System.out.println("Escribe un valor, el cual puede incluir decimales:");
        valor=entrada2.nextFloat();/*con entrada.nextInt() se le permite al usuario ingresar un flotante.Y eso q va a ingresar lo guardamos en valor */
        System.out.println("Tu numero es: "+valor);
        
        Scanner entrada3=new Scanner(System.in);
        String cadena1;
        System.out.println("Escribe la primera cadena, y solo te devolveré la primera palabra");
        cadena1=entrada.next();// next solo recibe la primera palabra de todas las que introduzca el usuario
        System.out.println("Su valor es "+cadena1);
        
        Scanner entrada4=new Scanner(System.in);
        String cadena2;
        System.out.println("Escribe la segunda cadena");
        cadena2=entrada4.nextLine();
        System.out.println("Su valor es:"+cadena2); 
        
        Scanner entrada5=new Scanner(System.in);
        char caracter;
        System.out.println("Escribe un caracter:");
        caracter=entrada5.next().charAt(3);// te devuelve la cadena en cuarto lugar, porque charAt empieza a contar desde el 0, no desde el 1
        System.out.println("El valor del caracter es:"+caracter);
      
        
    }
    
}
