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
public class Arrays2Pil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] ovejas=new String[8];
        ovejas[0]="Dolly";
        ovejas[1]="Paca";
        ovejas[2]="Manuela";
        ovejas[3]="Rosario";
        ovejas[4]="Carmen";
        ovejas[5]="Angustias";
        ovejas[6]="Filomena";
        ovejas[7]="Agustina";
        
        for(String oveja:ovejas){//oveja es una variable local temporal que dejará de existir una vez ejecutado completamente el bucle for each
            System.out.println(oveja);}
        
        System.out.println("");    
            
            
        String [] cabras=new String[3];
        cabras[0]="Sabra";
        cabras[1]="Huesa";
        
        for(String cabra:cabras){
            System.out.println(cabra);}
            
        System.out.println("");  
        
        
        
        int [] mi_matriz=new int[5];
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=15;
        mi_matriz[3]=92;
        mi_matriz[4]=71;
        
        /*System.out.println(mi_matriz[0]);    
        System.out.println(mi_matriz[1]);    
        System.out.println(mi_matriz[2]);    
        System.out.println(mi_matriz[3]);    
        System.out.println(mi_matriz[4]); */
        
       for(int i=0;i<5;i++){
           
           System.out.println("Valor del índice " + i + " = " + mi_matriz[i]);
       }

        System.out.println("");
       
       int [] mi_matriz2={5,38,56,3,56,76,45,659,9,426};//Aqui vamos a usar la propiedad length del objeto array, de lo q es una matriz
       
       for(int j=0;j<mi_matriz2.length;j++){
           
           System.out.println("Valor del índice " + j + " = " + mi_matriz2[j]);
       }
       
       
       
       String [] paisesViajar=new String[5];
       paisesViajar[0]="China";
       paisesViajar[1]="Costa Rica";
       paisesViajar[2]="Jordania";
       paisesViajar[3]="Nueva Zelanda";
       paisesViajar[4]="Australia";
       
       for(int k=0;k<=4;k++){
           System.out.println("Los países que vas a visitar este año son " +(k+1)+ " " + paisesViajar[k]);
           
       }
        System.out.println("");
       
       for(String paisViajar:paisesViajar){//Con el bucle for each hay que declarar una variable del mismo tipo que la matriz. Con esto me aseguro que recorrerá todos los índices.
           System.out.println(paisViajar);
       }
       
            
        
            
        }
        
        }
    



