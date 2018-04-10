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
public class ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(s.nextLine());
    
        
    
    if (numero < 10) {
    System.out.println((numero) + ": No es capicúa");
    }
    if ((numero >= 10) && (numero < 100)) {
      if ((numero/10) == (numero % 10)) {
      System.out.println((numero) + ": Es capicúa");
      } else {
         System.out.println((numero) + ": No es capicúa");
      }
    }
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
      System.out.println((numero) + ": Es capicúa");
      } else {
         System.out.println((numero) + ": No es capicúa");
      }
    }
    if ((numero >= 1000) && (numero < 10000)) {
      int primercifra = (numero / 100);
      int segundacifra = (numero % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((numero) + ": Es capicúa");
      } else {
         System.out.println((numero) + ": No es capicúa");
      }
    }
    if ((numero >= 10000) && (numero < 100000)) {
      int primercifra = (numero / 1000);
      int segundacifra = (numero % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      System.out.println((numero) + ": Es capicúa");
      } else {
         System.out.println((numero) + ": No es capicúa");
      }
    }
  }
}
