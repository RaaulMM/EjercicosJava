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
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.
 */
public class ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
      System.out.println("Introduzca numero ");
      int numero = s.nextInt();
    
    boolean primoSi = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primoSi = false;
      
      }
    }
        
    if (primoSi) {
      System.out.println("El número " +numero+  " es primo.");
    } else {
      System.out.println("El número " +numero+  " no es primo.");
    }

  }
        
      
  
}
