/*Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
de un color diferente.
*/



public class T1Ej5 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";

    System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println("======\t=======\t======\t======\t=======");
    System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
    System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBD\
ATO");
System.out.println(naranja + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tB\
DATO");
System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tB\
DATO" + celeste + "\tED");
System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tB\
DATO" + celeste + "\tED");
  }
}
