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
public class ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     System.out.println("Introduce un numero");
      long NumEnt = Long.parseLong(s.nextLine());
      System.out.println("La última cifra es: " + (NumEnt % 10));
  
  }
}
