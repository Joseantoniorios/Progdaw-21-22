/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        float num1,num2,suma,resta,mul,div,residuo;
        System.out.println("Ingresa 2 numeros:");
        num1=entrada.nextFloat();
        num2=entrada.nextFloat();
        suma=num1+num2;
        resta=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        residuo=num1%num2;
        System.out.println("Suma="+suma);
        System.out.println("Resta="+resta);
        System.out.println("Multiplicación="+mul);
        System.out.println("División="+div);
        System.out.println("Residuo="+residuo);
        
    }
    
}

