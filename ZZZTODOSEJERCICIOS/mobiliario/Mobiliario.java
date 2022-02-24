/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entradaejercicios.mobiliario;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class Mobiliario {
    
    public static void main(String[] args){
        
        Mueble miMueble =new Mueble("madera",12,"marron");
        Mesa miMesa= new Mesa("plastico",5,"verde",12);
        Armario miArmario=new Armario("PVC",100,"blanco",3);
        
        System.out.println(miMueble);
        System.out.println(miMesa);
        System.out.println(miArmario);
        miArmario.pintar(c);
    }
}
