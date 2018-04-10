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
public class ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la variable A: ");
    double a = s.nextDouble();
    
    System.out.print("Introduce la variable B: ");
    double b = s.nextDouble();
    
    if (a==0){
      System.out.println("No se puede hacer la ecuación.");
    }else{
      System.out.println("El resultado de la ecuación es: " + -b / a);
    }
  }
}
