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
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 */

public class ejercicio01 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    
    
      for (int i = 0; i <= 100; i++) {
        if (i%5 == 0){
          System.out.println(i);
         }
      }
    }
}
