/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entradaejercicios;

/**
 *
 * @author joseantonioriosgonzalez
 */
    public class Auto {//varios metodos dentro de una misma clase son publicos. Pueden mandarse llamar pese a que sean privados. Si no estuvieran dentro de la misma clase, no se puede.
        String marca;
        String modelo;
        String color;
        private boolean acceso=false;
        //public void enciende(){//para que a este método/acción se pueda acceder hay q ponerlo como public. Si no le pusieramos nada, tambien sería publico.
        public void MeterLLave(String clave){
            if(clave.equals("123456")){
                acceso=true;
            }
            else{
                acceso=false;
                System.out.println("Llamar a la policía");
            }
        }
        public void mando(String accion){
            if(acceso==true){
                if(accion.equals("enciende")){
                    enciende();
                }
            }
        }
        private void enciende(){
            System.out.println("Enciende run run");
        } 
        public void acelera(){
            System.out.println("Velocímetro 80km");
        }  
        public void frena(){
            System.out.println("Velocímetro 0km");
        }
}
