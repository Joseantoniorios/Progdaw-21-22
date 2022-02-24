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
public class ArraysDeCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String texto=JOptionPane.showInputDialog("Humano, escribe un texto.");
        int longitud=texto.length();//tomamos la variable texto. para tomar el tamaño ponemos .length
        char[] caracteres=new char[longitud];//creamos un array de tipo char al que llamamos caracteres. Y le vamos a pasar la longitud para que tenga ese tamaño.
        int inverso=longitud;//inverso va a tener el tamaño de la longitud. La ultima letra del texto q escribió el humano se la vamos a asignar a la primera letra de nuestros caracteres. Y asi sucesivamente.  
        for(int i=0;i<longitud;i++){
            caracteres[i]= texto.charAt(inverso-1);//a la primera posición de nuestro array caracteres le vamos a asignar la ultima letra del texto.
            inverso--;
        }
        System.out.println(caracteres);//el sout tiene la caracteristica de que si tu le das una cadena de caracteres, el lo concatena y lo une.
        //JOptionPane.showMessageDialog(null, caracteres);//Aqui no vale lo de poner solo caracteres. Habria que poner un bucle.        
        */
        
        
        /*
        
        String texto2= JOptionPane.showInputDialog("Humano, escribe un texto: ");
        int longitud2=texto2.length();
        char [] caracteres2 = new char[longitud2];
        int inverso2=longitud2;
        for (int j=0; j<longitud2;j++){
            caracteres2[j]=texto2.charAt(inverso2-1);
            inverso2--;
        }
        System.out.println(caracteres2);
        
        
        
        
        
        
        
        
        String texto3=JOptionPane.showInputDialog("Escribeme un texto y te lo devolveré al revés :");
        int longitud3=texto3.length();
        char [] caracteres3= new char [longitud3];
        int inverso3=longitud3;
        for(int k=0;k<longitud3;k++){
            caracteres3[k]=texto3.charAt(inverso3-1);//el metodo charAt de String te coge el caracter de la posición que le indiques entre parentesis
            inverso3--;
            
        }
        System.out.println(caracteres3);
        
        */
        
        
        /*Aclaración next:
        
        next() solo lee hasta donde encuentra un espacio (hasta un espacio).Además, next() coloca el cursor en la misma línea después de leer la entrada. 
nextLine() lee todo incluyendo espacios (hasta un enter).

A continuación, los siguientes métodos pueden ser útiles para la lectura de datos simples:
Scanner lector = new Scanner(System.in);

String p1 = lector.next();               //lee una cadena de texto
String p2 = lector.nextLine();       //lee una cadena de texto hasta fin de linea

int n1 = lector.nextInt();                 //lee un numero entero
double n2 = lector.nextDouble();   //lee un numero de tipo double
float n3 = lector.nextFloat();          //lee un número de tipo flotante
        
        */
        
        
        /*Scanner entra=new Scanner(System.in);
        System.out.println("Introduce un texto y te lo devolveré al revés: ");
        String texto=entra.nextLine();
        int longitud4=texto.length();
        char[]caracteres4=new char[longitud4];
        int inverso4=longitud4;
        for(int k=0;k<longitud4;k++){
            caracteres4[k]=texto.charAt(inverso4-1);
            inverso4--;
        }
        System.out.println(caracteres4);
        
        
        System.out.println("");
        
        Scanner entra5=new Scanner(System.in);
        System.out.println("Introduce otro texto y te lo devolveré al revés: ");
        String texto5=entra5.nextLine();
        //int longitud5=texto5.length();   //esto no es necesario si cogemos directamente la longitud de texto5
        char [] caracteres5=new char[texto5.length()];
        int inverso5=texto5.length();
        for(int l=0;l<texto5.length();l++){
            caracteres5[l]=texto5.charAt(inverso5-1);
            inverso5--;
        }
        System.out.println(caracteres5);
        
        System.out.println("");*/
        
        
        String [] cocodrilos=new String[4];
        
        for(int m=0;m<cocodrilos.length;m++){
            cocodrilos[m]=JOptionPane.showInputDialog("Introduce el nombre del cocodrilo: "+ (m+1));
        
                    System.out.println(cocodrilos[m]);}

       //for (String cocodrilo:cocodrilos){   //todo lo comentado hace lo mismo que la linea de arriba
           
        //  System.out.println("Cocodrilo: "+ cocodrilo);//
           
     
       }
        
        
        
        
        
        
        
        
        }
        
        
        
    
    

