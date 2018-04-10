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
 */
public class ejercicio19 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca altura ");
    int altura = s.nextInt();
    System.out.println("Introduzca caracter para pintar la piramide ");
    String caracter = s.next();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = altura-1;
    
      while (planta <= altura) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(caracter);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
   }
  
}
