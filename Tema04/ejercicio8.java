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
public class ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  
    System.out.print("Introduce las 3 notas sepaaras por espacios, puede contener decimales: ");
    double x1 = s.nextDouble();
    double x2 = s.nextDouble();
    double x3 = s.nextDouble();
    double media = (x1 + x2 + x3) / 3;
    System.out.print("La nota media es: " + media); 
    
    if (media < 5) {
      System.out.print(" insuficiente "); 
    }
    if ( media == 5) {
      System.out.print(" Suficiente ");
    }
    if ((media > 5) && (media <=7)){
      System.out.print(" Bien ");
    }
    if ((media >= 8) && (media <=9)){
      System.out.print(" Notable ");
    }
    if ((media == 10)){
      System.out.print(" Sobresaliente ");
    }
  }
}
