package com.mycompany.entradaejercicios;

//import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joseantonioriosgonzalez
 */
public class CicloConDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*int i=11;
        do{//do es la primera instrucción//la diferencia con el while, es q con el do while primero ejecuta una vez y luego pregunta la condicion
            System.out.println("i="+i);
            i++;
        }while(i<=10);*/
        
        
        /*int j=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos niños quieres tener con Jose? Escribe un numero entre 1 y 4 y te diré los nombres que les pondrás."));
        String k;
        do{        
            if (j==1){k="Daniel";}
            if (j==2){k="Miranda";}
            if (j==3){k="Christian";}
            if (j==4){k="Fátima";}
            
            System.out.println(k);
           }
         /*   JOptionPane.showMessageDialog(null,"Los posibles nombres que pueden tener tus hijos son: ";+k);
            j--;
          }while (j<=1);
        
        
        JOptionPane.showMessageDialog*/
        
        /*Random rand=new Random();
        int aleatorio=rand.nextInt(5)+1;
        System.out.println("aleatorio= "+aleatorio);*/
        
        int entra=Integer.parseInt(JOptionPane.showInputDialog("Dime del 1 al 4 cuántos niños quieres tener, y te diré sus nombres"));
        String k="";
        do{ 
            if (entra==1){k="Daniel";}
            if (entra==2){k="Miranda";}
            if (entra==3){k="Christian";}
            if (entra==4){k="Fátima";}
            
            JOptionPane.showMessageDialog(null,"nombre del hijo= "+k);
            entra--;
            

        }while (entra>=1);

        
        
    }
    
}
//Repetir video 23 Do while