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
public class ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce a: ");
    double a = s.nextDouble();
    
    System.out.print("Introduce b: ");
    double b = s.nextDouble();
    
    System.out.print("Introduce c: ");
    double c = s.nextDouble();
    
    if (a == 0){
      System.out.println("El resultado de la ecuación es: " + (-c/b));
    } else if (b == 0){
      double discriminante = -c/a;
      if (discriminante < 0) {
        System.out.println("No es posible resolver la ecuación.");
      } else {
      System.out.printf("El resultado de la ecuación es: %.2f", Math.sqrt(discriminante));
      }
    } else if (c == 0) {
      System.out.println("El resultado de x1 es: 0");
      System.out.println("El resultado de x2 es: " + (-b/a));
    } else {      
      double parcialraiz = (Math.pow(b,2))-(4 * a * c);
      double parcialdivisor = 2 * a;        
        if (parcialraiz < 0) {
        System.out.println("No es posible resolver la ecuación.");
        } else {
        double parcialraizcompleta = Math.sqrt(parcialraiz);    
        double x1 = (-b + (parcialraizcompleta))/parcialdivisor;
        double x2 = (-b - (parcialraizcompleta))/parcialdivisor;    
        if (x1 == x2) {
          System.out.println("X es : " + x1);
        } else {
          System.out.println("X1 es " + x1);
          System.out.println("X2 es " + x2);
          }
        }
      }
  }
}