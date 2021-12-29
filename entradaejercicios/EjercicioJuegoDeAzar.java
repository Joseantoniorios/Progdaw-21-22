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
public class EjercicioJuegoDeAzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Random rand=new Random();//rand es un objeto de la clase Random. new Random lo que hace es crear ese nuevo objeto de la clase Random. Vamos a crear una variable de tipo Random, de la libreria Random que vamos a importar. Llamo a la libreria Random, declaro una variable de tipo random, la cual va a ser igual a una nueva instancia de tipo Random 
            int dado1=rand.nextInt(7);//Con nextInt lo que estamos haciendo es pedirle que nos entregue un entero con cierto rango, 6 en este caso. Al poner un 5, nexInt entiende que es un numero entre el 0 y 5
            int dado2=rand.nextInt(7);
            int dado3=rand.nextInt(7);
            System.out.println("Dado 1= "+dado1);
            System.out.println("Dado 2= "+dado2);
            System.out.println("Dado 3= "+dado3);
            if(dado1==6 && dado2==6 && dado3==6){
                System.out.println("Excelente!!Sacaste los 3 seis!!!");
            }
            else if((dado1 ==6 && dado2==6) || (dado1==6 && dado3==6) ||  (dado1==6 && dado3==6)){
                System.out.println("Muy bien! Sacaste dos dados con el número 6!!");
            }
            else if(dado1==6 || dado2==6 || dado3==6){
                System.out.println("Bien. Sacaste un dado con el numero 6.");
                }
            else{
                    System.out.println("No sacaste ni un 6!!!");
                }
            }
              
                     
                          
    }
   

//Tengo que usar el objeto rand para obtener variables aleatorias. Por ejemplo, creo un entero llamado dado1, y a este entero le voy a asignar un valor entero aleatorio. Para ello hago uso del objeto que he creado: rand. Pero el objeto por si mismo no nos va devolver ningun valor. Si no que tenemos q acceder a un metodo pertenenicnete a el, en este caso, el metodo nextInt, q nos va a devolver un valor entero entre 0 y uno menos del valor que yo le he dado.
//Con nextInt lo q le estoy diciendo q barra la pantalla y tome el contenido valor y lo transforme en entero para poder asignarlo a dado1 que es entero.
//Implementamos el método nextInt dentro del objeto rand que hemos creado anteriormente.