/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

/**Si yo me emborrado con 2 litros de cerveza, y un vado mide 6cm de diametro x 10cm de altura,
 *¿cuántos vasos necesito para emborracharme?
 * V=πr^2h   r=d/2
 *
 * @author joseantonioriosgonzalez
 */
public class EjercicioCalcularVolumenDeUnCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float diametro=6;
        float altura=10;
        double volumen;
        float pi=3.1416f;
        float radio=diametro/2;
        volumen=pi*Math.pow(radio, 2)*altura;
        System.out.println("El volumen de un vaso de cerveza es: "+volumen);
        float litros=2;
        float mililitrosParaEmborracharme=litros*1000;
        double limiteVasos= mililitrosParaEmborracharme/volumen;
        System.out.println("Yo me emborracho con :"+limiteVasos+" vasos de cerveza");
    
    }
    
}
