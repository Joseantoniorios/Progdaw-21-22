/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entradaejercicios.mobiliario;

/**
 *
 * @author joseantonioriosgonzalez
 */
public class Mesa extends Mueble{
    private int superficie;
    private int nPatas;
    
    public Mesa (String m int p, String c, int sup){
    super(String  m,p,c);
    this.superficie=sup;
    this.nPatas=4;

    
    public Mesa)String m, int p, String c, int sup){
    this(m,p,c,sup);
    this.nPatas=np;
    
}
    
    public String toString(){
        String resultado="MESA\n";
        resultado= resultado + super.toString();
        resultado = resultado + "Superficie: "+this.superficie+"\n";
        resultado= resultado + "Numero de patas: "+this.nPatas+"\n";
        return resultado;
    }
    
}
