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
Escribe un programa que pida una base y un exponente (entero positivo) y
que calcule la potencia.
 */
public class ejercicio14 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca base ");
    int base = s.nextInt();
    System.out.println("Introduzca exponente ");
    int expo = s.nextInt();
    
    double potencia = 1;
    if (expo == 0) {
      potencia = 1;
    }
    
    if (expo > 0) {
      for (int i = 0; i < expo; i++) {
        potencia *= base;
      }
    }
    
    if (expo < 0) {
      for (int i = 0; i < -expo; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    System.out.println(base + "^" + expo + " = " + potencia);
       
     }
   
  
}
