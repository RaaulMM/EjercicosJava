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
public class ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduzca numero: "); 
    int numeroIntro =  s.nextInt();
      System.out.printf("%-15s","Numero");
      System.out.printf("%-15s","Cuadrado");
      System.out.printf("%-15s\n","Cubo");
    for (double i = numeroIntro+1; i <= numeroIntro+5; i++) {
        System.out.printf("%3.0f",(i));
        System.out.printf("%17.0f", (i*i));
        System.out.printf ("%14.0f\n",(i*i*i));
        
    }
  }
}
