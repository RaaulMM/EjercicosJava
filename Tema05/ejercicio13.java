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
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.
 */
public class ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 10 números enteros separados por espacios, Ej: 2 -3 9 -8 7 ");
      
    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (s.nextInt() > 0) {
        positivos++;
      } else {
        negativos++;
        }
    }
    
    System.out.println("Has introducido " + positivos + " positivos\n"+"Has introducido " + negativos + " negativos");

  }
  
}
