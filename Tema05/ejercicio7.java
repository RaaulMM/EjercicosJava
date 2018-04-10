/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    boolean acierto = false;
    int claveCorrecta = 2587;
    int intentos = 4;
    
    while (!acierto && intentos > 0) {
       System.out.print("Introduzca clave: ");
       int claveIntroducida = s.nextInt();
       if (claveIntroducida == claveCorrecta){
         System.out.println("La caja fuerte se ha abierto satisfactoriamente");
         acierto = true;
       }else {
         intentos--;
         System.out.println("Te quedan " + intentos + " intentos. ");
       }
        
      }
    if (intentos == 0){
      System.out.println("No tienes mas intentos ");
    }
  }
}
