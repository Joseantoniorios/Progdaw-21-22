/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entradaejercicios;

import javax.swing.JOptionPane;//libreria q hay q importar para usar ShowInputDialog

/**
 *
 * @author joseantonioriosgonzalez
 */
public class IngresarDatosViaShowInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Los Integer.parseInt , Float.parseFLoat... son Wrappers
        String cadena=JOptionPane.showInputDialog("Mete una cadena");
        JOptionPane.showMessageDialog(null,"Esta es tu cadena "+cadena);
        
        int entero=Integer.parseInt(JOptionPane.showInputDialog("Mete un entero"));//para hacer un casting de JOptionPane no vale con poner (int). Hay que poner delante Integer.ParseInt y entre paretesis el resto. El (int) sirve para convertir valores numericos en enteros. Pero para convertir un String tenemos que usar la funcion ParseInt y la usamos dentro del Wrapper Integer. Eso me pedira una cadena de texto, así que le vamos a pasar el String ("Mete un entero") 
        JOptionPane.showMessageDialog(null,"Este es tu entero "+entero);//ponemos null porque no tenemos padre. Lo del padre es cuando de una ventana te sale un pop-up, y no podemos acceder a la ventana primera sin cerrar el pop-up. Como en nuestro caso, no tiene padre, ponemos null
        
        float flotante=Float.parseFloat(JOptionPane.showInputDialog("Mete un flotante"));
        JOptionPane.showMessageDialog(null, "Este es tu flotante "+flotante);
        
        double doble=Double.parseDouble(JOptionPane.showInputDialog("Mete un doble"));
        JOptionPane.showMessageDialog(null,"Este es tu doble "+doble);
        
        char caracter=JOptionPane.showInputDialog("Mete un caracter").charAt(2);//usamos la propiedad charAt para que nos devuelva solo un caracter que coincidirá con la posición que indiquemos entre parentesis;
        JOptionPane.showMessageDialog(null,"Este es un tu caracter:"+caracter);
        
    }
    
}
