/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class TrabajarConFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OJO: Me fecha si pongo de mes 08 o 09. No se porqué.
        Calendar fechaNac=new GregorianCalendar(2000,01,01); //vamos a crear un nuevo tipo de datos llamado Calendar q va a trabajar con fechas. Esta fecha de nacimiento va a ser inicializada con otro tipo de datos el cual se llama GragorianCalendar,y este tiene que recivbir una fecha q esta copuesta por año,mes y dia. 
        Calendar fechaHoy=Calendar.getInstance();//Calendar.getInstance() lo que hace es que toma el dia, los minutos, segundos del momento de ejecutarse
        int anoNac=fechaNac.get(Calendar.YEAR);
        int anoHoy=fechaHoy.get(Calendar.YEAR);
        int edad=anoHoy-anoNac;
        System.out.println("Edad="+edad);
                
    }
    
}
