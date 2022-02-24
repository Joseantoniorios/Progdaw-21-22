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
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*String [] gatos={"Dean","Sam","Snowball","Pri Marikey"};
        for(int i=0;i<4;i++){
            System.out.println(gatos[i]);
        }
        
        System.out.println("");
        
        String[] perros={"Monte","Chupacabras","Solovino","Chimuelo","La wera","El Chiquito"};
        for(int j=0;j<perros.length;j++){//para coger el tamaño de un array,es sin parentesis
            System.out.println(perros[j]);
            
        }
        
        System.out.println("");
        
        String [] hamsters={"Igor","Kori","Blanquita","Bolita","Picudas","Smeagol"};
        for(String hamster:hamsters){//Lo malo de este bucle for each, 
            System.out.println(hamster);
        }
        
        /*IMP: Desventajas for each:
        - Solo permite consultar, NO escribir.
        - No está garantizado el orden numerico a la hora de recorrer un array
        - Es mas lento q un bucle normal,pq 1º se recorre todas las propiedades del array para sacar sus propiedades
        - A diferencia del bucle for, si queremos usar un contador hay que declarar antes una varible y al final o cuando nos haga falta, ir incrementandola o decrementandola
        */
    
    
    
        String[]peces=new String[8];
        
        peces[0]="Dory";
        peces[1]="Nemo";
        peces[2]="Thunder";
        peces[3]="Flanders";
        peces[4]="Sebastian";
        
        /*IMP: No valdría con poner solo String [] peces. Daria error pq no estaria declarada la variable peces de esta manera.

        
        Esto es lo mismo que
        String [] peces={"Dory","Nemo","Thunder","Flanders","Sebastian"};
        
        
        */
        
        int i=0;
        for(String pez:peces){
            System.out.println((i+1)+" "+pez);
            i++;
        }
    }
}

                
        

                
                
    



