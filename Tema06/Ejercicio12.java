/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio12 {
    public static void main(String[] args) 
    throws InterruptedException {

    int linea = 0;
   
    for(int i = 0; i < 8000; i++) {
      System.out.print("\033[32m");
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32));
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(60);
        System.out.println();
      }
    }
  }
}
