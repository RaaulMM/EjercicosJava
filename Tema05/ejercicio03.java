/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema5;

/**
 *
 * @author raulmoreno
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while .
 */
public class ejercicio03 {
  public static void main(String[] args) {
    
    int i = 0;
    
    do {
      if (i%5 == 0){
          System.out.println(i);
         }
      i++;
      } while (i <= 100);
    
  }
}
