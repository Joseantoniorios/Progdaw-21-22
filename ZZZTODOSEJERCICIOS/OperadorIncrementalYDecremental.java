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
public class OperadorIncrementalYDecremental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=5;
        int num2=0;
        num2=num1++;//OJO. Primero iguala num2 a num1, y después incremente num1. Por ello num2 daría 5 y no 6.
        num2=++num1;//OJO. Aquí si que te suma uno antes y luego lo asigna.
        num2=--num1;
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
    
}
