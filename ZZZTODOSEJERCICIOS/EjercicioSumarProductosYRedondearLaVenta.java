/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Scanner;

/**Realizar un programa que calcule la venta de 3 productos del OXXO y al final 
 *donar x centavos(Redondear).
 * @author joseantonioriosgonzalez
 */
public class EjercicioSumarProductosYRedondearLaVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entra=new Scanner(System.in);             //hacemos una nueva instancia de Scanner 
        System.out.println("Ingrese valor del producto 1:");
        float prod1=entra.nextFloat();
        System.out.println("Ingrese valor del producto 2:");
        float prod2=entra.nextFloat();
        System.out.println("Ingrese valor del producto 3");
        float prod3=entra.nextFloat();
        float suma=prod1+prod2+prod3;
        System.out.println("Suma total="+suma);
        
        double totalMasRedondeo=Math.ceil(suma);//Math.ceil lo que hace es redondearte cualquier numero decimal hacia arriba. Ejemplo: 5.3 lo convierte a 6.
        System.out.println("Total pagado: "+totalMasRedondeo);
        double redondeo=totalMasRedondeo-suma;
        System.out.println("Gracias por redondear "+redondeo);
        
    }
    
}
