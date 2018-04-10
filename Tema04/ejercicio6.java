/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ejercicio6 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Introduce altura : ");
  double alt = s.nextDouble();
    
  if (alt < 0) {
   System.out.println("Altura introducida no es valida");
      
  } else {
    double x = (2 * alt)/9.81;
    System.out.printf("El tiempo de caida es: %.2f", Math.sqrt(x));
    System.out.println("m/s2");
    }
  }
    
}
