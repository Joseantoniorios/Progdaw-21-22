/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entradaejercicios;

public class ProgramaHelado {
  public static void main (String [] args) {
    Helado miPrimerHelado;
    Helado otroHelado;
    
    miPrimerHelado = new Helado();
    miPrimerHelado = new Helado ("vainilla", 10);
    otroHelado = miPrimerHelado;
    miPrimerHelado = new Helado ("fresa", 8,"azucar","singluten","vegano");
    
    otroHelado.chupar();
    otroHelado.chupar();
    otroHelado.chupar(4);
    otroHelado.chupar();
   
    System.out.print ("Al otro helado le queda: "+otroHelado.cuantoQueda());
    
    System.out.println();
    
    System.out.print(miPrimerHelado.toString());
    System.out.print(otroHelado);
    
    //miPrimerHelado.ponerSabor("vainilla");
    System.out.println();
    if (miPrimerHelado.compara(otroHelado)<0) {
      System.out.print("El primer helado es el más pequeño");
    } else if (miPrimerHelado.compara(otroHelado)==0) {
      System.out.print("Los dos helados son igual de grandes");
    } else {
      System.out.print("El primer helado es el más grande");
    }
    
      System.out.println();
      System.out.println("Hasta el momento se han creado "+ Helado.heladosCreados() + " helados" );
    
  }
}





/**
 *
 * @author joseantonioriosgonzalez
 */


/*public class ProgramaHelado {
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        
    Helado miPrimerHelado;//= new Helado (). Es lo mismo.
    Helado otroHelado;
    
    miPrimerHelado= new Helado();
    miPrimerHelado = new Helado ("vainilla", 10);// aqui que poner detras de new el constructor. Si no hay constructor, usamos Helado. Helado va a ser el constructor. 
    otroHelado= miPrimerHelado;
    miPrimerHelado = new Helado ("fresa", 0, "azucar","singluten","vegano");//al hacer esto, el helado de vainilla se pierde
    //miPrimerHelado.ponerSabor("vainilla");// acceder directamente a un atributo es suspenso. No lo haramos asi. le vamos a preguntar al objeto...
    
        otroHelado.chupar();
        otroHelado.chupar(4);
        otroHelado.chupar();
        otroHelado.chupar();

        
        System.out.println("Al otro helado le queda: "+otroHelado.cuantoQueda());
        
        System.out.println();
    }*/
    
    //miPrimerHelado.ponerSabor("vainilla");
    /*sou
    
}*/

//Mirar este enlace: https://es.stackoverflow.com/questions/79615/devolver-return-objeto-en-un-m%C3%A9todo

//salvo q se indique lo contrario, todos los atributos seran siempre privados
//salvo lo q se indique lo contrario, por lo genereal los metodos seran publicos
//si aparecieran las excepciones a eso, se especificarian
