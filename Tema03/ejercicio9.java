/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

/**
 *
 * @author raulmoreno
 */
import java.util.Scanner;
public class ejercicio9 {
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      
      System.out.print("Introduce la altura del cono: ");
      double h = Integer.parseInt(s.nextLine());
      System.out.print("Introduce el radio del cono: ");
      double r = Integer.parseInt(s.nextLine());
      
      double cuenta = 1.0/3.0 * 3.14;
      double volumen = cuenta * r * r * h;
      
      System.out.printf("El volumen del cono es: %.2f", volumen);
  }
  
}
