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
public class OperacionesMatematicasConMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero=121 ;
        double raiz=0;//lo inicializamos a 0, pero se puede dejar sin nada. Tiene que ser double,pq tiene q recibir un double, no un entero. Así es la función Math.sqrt
        raiz= Math.sqrt(numero);
        System.out.println("La raíz cuadrada de 625 es:"+raiz);
        
        double numRaiz=9;
        int resRaiz=0;
        resRaiz=(int) Math.sqrt(numRaiz);//aquí hacemos un casting para hacerlo entero.
        System.out.println("resRaiz="+resRaiz);
        
        double base=5;
        double exp=2;
        double resultado=0;
        resultado=Math.pow(base, exp);
        System.out.println("El resultado de la potencia es:"+resultado);
        
        //Ahora vamos a ver los numeros absolutos
        float numAbs=-5.5f;// le hacemos un casting poniendo una f al final para que me admita como float.
        float resAbs=Math.abs(numAbs);
        System.out.println("resAbs="+resAbs);
        
        //Ahora vamos a convertir a números absolutos
        int numAbs2=-5;
        float resAbs2=Math.abs(numAbs);// aqui mando un int y recibo en un float. Siempre que mando uno q es de un tipo menor que el de que recibe, no da error. Al reves, sí que da error.
        System.out.println("resAbs2="+resAbs2);
        
        //Ahora vamos a redondear
        float numRed=5.4f;
        int resRed=Math.round(numRed);//como la propiedad round te devuelve un entero, lo suyo es q esta la declaremos como entero. Aunq si lo ponemos float no pasa nada, solo que gastamos mas memoria
        System.out.println("El número redondeado se queda en:"+resRed);
        
        double resAle= Math.random();
        System.out.println("resAle="+resAle);
        
        double resAle2= Math.random();
        System.out.println("resAle2= "+Math.round(resAle2*10));//para recibir un numero sin decimales entre 0 y 100,pq te redondea entronces puede ser q 9.5 sea 10 y 0.3 sea 0
        
        double resAle3= Math.random();
        System.out.println("resAle3= "+(int)(resAle3*10));//así daría un numero entre 0 y 9. Para ellos tenemos que hacer un casting
        
        double numeroLoteriaNinho=Math.random();
        System.out.println("El numero de la lotería del niño es: "+(int)(numeroLoteriaNinho*100000));
        
    }
    
}
 