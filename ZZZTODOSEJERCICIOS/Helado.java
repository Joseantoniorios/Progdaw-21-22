/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entradaejercicios;

public class Helado {
  private String sabor;
  private int cantidad;
  private boolean azucar;
  private boolean gluten;
  private boolean vegano;
  public static String conservante="conservante";//con static defino el conservante para la clase y todos los objetos de esa clase tendran esa caracteristica
  public static int totalHelados=0;//si a mi me interesara contar el total de helados
  
  
  public Helado () {
    this("chocolate",10);
  }
  
  public Helado (String sabor, int cantidad) {
    this.sabor = sabor;
    this.cantidad = cantidad;
    
    this.azucar = true;
    this.gluten = true;
    this.vegano = false;   
    
    totalHelados++;
  }
  
  public Helado (String sabor, int cantidad, String a, String g, String v) {
    this(sabor,cantidad);    
    if (a.equals("azucar")) {
      this.azucar = true;
    } else {
      this.azucar = false;
    }
    if (g.equals("singluten")) {
      this.gluten = false;
    } else {
      this.gluten = true;    
    }
    if (v.equals("vegano")) {
      this.vegano = true;
    } else {
      this.vegano = false;    
    }
  }
  
  public boolean chupar () {
    if (this.cantidad > 0) {
      this.cantidad--;
      return true;
    }
    return false;
  }
  
  public boolean chupar (int c) {
    if (this.cantidad-c >= 0) {
      this.cantidad = this.cantidad-c;
      return true;
    }
    return false;
  }
  
  public int cuantoQueda() {
    return this.cantidad;
  }
  
  public String toString() {
    String resultado = "";
    resultado = "--------------\n";
    resultado = resultado + "Sabor: "+this.sabor+"\n";
    resultado = resultado + "Cantidad: "+this.cantidad;
    if (!this.azucar) {
      resultado = resultado + "\nSin Azucar. ";
    }
    if (!this.gluten) {
      resultado = resultado + "\nSin Gluten. ";
    }
    if (this.vegano) {
      resultado = resultado + "\nVegano. ";
    }
    resultado = resultado + "\n##############\n";
    
    return resultado;
  }
  
  public int compara (Helado h) {
    if (this.cantidad == h.cantidad) {
      return 0;
    }
    if (this.cantidad < h.cantidad) {
      return -1;
    }
    return 1;
        }
    public static int heladosCreados(){
        return Helado.totalHelados;
    }
    
    public static void fijarConservante (String c){
        conservante=c;
        
        
    }
  }
  
  /*
  public void ponerSabor (String saborNuevo) {
    this.sabor = saborNuevo;
  }
  
  public void ponerSabor (int x) {
    switch (x) {
      case 1:
        this.sabor = "manzana";
        break;
      case 2:
        this.sabor = "melocotón";
        break;
      default:
        this.sabor = "vainilla";
    }
  }
  */
  
//}










/**
 *
 * @author joseantonioriosgonzalez
 */

        
/*public class Helado {
    
    private String sabor;//al poner private, solo esta accesible desde dentro de la clase. Se hace para evitar q no se entre a los atributos directamente
    private int cantidad;
    private boolean azucar;
    private boolean gluten;
    private boolean vegano;
    
    public Helado (){
        this("chocolate",10);//al poner el this te quitas calentamientos de cabezo.
        /*this.cantidad=10;
        
        this.azucar = true;
        //los valores del constructor lo podemos poner aqui  o tras los privates de arriba
        this.gluten=true;
        this.vegano=false;
    }*/
    //Dentro de un constructor a otro invocamos con this
    //Podemos sobrecargar cualkier metodo
    /*public Helado (String sabor1, int cantidad){//creamos un constructor . Podemos volver a utilizar sabor, pq Java es capaz de distinguir el sabor atributo del sabor argumento
        this.sabor=sabor;//al poner el this te quitas calentamientos de cabezo.
        this.cantidad=cantidad;
        
        this.azucar = true;
        //los valores del constructor lo podemos poner aqui  o tras los privates de arriba
        this.gluten=true;
        this.vegano=false; //De esta manera ya estan activos todos lo valores del constructor. El constructor por defecto ya no está operativo. en el momento q yo defino un constructor, el constructor por defecto ya no está operativo.
    }
    
    
        public Helado (String sabor, int cantidad, String g, String a, String v){//creamos un constructor . Podemos volver a utilizar sabor, pq Java es capaz de distinguir el sabor atributo del sabor argumento
        this(sabor,cantidad);//al poner el this te quitas calentamientos de cabezo.
        if (a.equals("azucar")){
            this.azucar = true;
        }else{
            this.azucar=true;
        }
        if(g.equals("singluten")){
            this.gluten=false;
        }else{
            this.gluten=true;
        }
        if(v.equals("vegano")){
            this.vegano=true;
        }else{
            this.vegano = false;
        }
    }
        
    public boolean chupar (int c){
        if(this.cantidad>0){
            this.cantidad--;
            return true;
        }
            return false;
            
    public boolean chupar (int c){
        if(this.cantidad)
    }        
         
        
  }        
    public int cuantoQueda(){
        return this.cantidad;
       
    }  
        
    public String descripcion(){
        String resultado="";
        resultado= "------------\n";
        resultado= resultado + "Sabor: "+this.sabor+"\n";
        resultado= resultado + "cantidad: "+this.cantidad+"\n";
        if(!this.azucar){
        resultado= resultado + "Sin Azucar";
        }
        if(!this.gluten){
        }    
        
        
    
    public void ponerSabor(String saborNuevo){
        this.sabor = saborNuevo; 
    }
    
    public void ponerSabor (int x) {
        switch (x) {
            case 1:
                this.sabor="manzana";
                break;
            case 2:
                this.sabor = "melocotón";
                break;
            
        }
    }

public int compara (Helado h){
    if (this.cantidad == h.cantidad){
        return 0;
    }
    if (this.cantidad <h.cantidad){
        return -1;
        }
    return 1;
    }

}
}
    
}
*/