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

 */
public class ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca base ");
    double base = s.nextInt();
    System.out.println("Introduzca exponente ");
    int expoF = s.nextInt();
    
    double potencia;
    int exponente;
        
    for (int i = 1; i <= expoF; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int Operacion = 0; Operacion < exponente; Operacion++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }

   
   }
}
