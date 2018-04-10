/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noPrimo = new int[10];

    boolean esPrimo = false;
    int primos = 0;
    int noPrimos = 0;

    for (int p = 0; p <= 9; p++) {
      System.out.print("Introduzca numero: ");
      n[p] = s.nextInt();

      for (int j = 2; j < n[p] - 1; j++) {
        if (n[p] % j == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        primo[primos++] = n[p];
      } else {
        noPrimo[noPrimos++] = n[p];
      }

    }
    /*-----------------------------------------------*/
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    /*------------------------------------------------------*/
    for (int i = 0; i < primos; i++) {
      n[i] = primo[i];
    }

    for (int i = primos; i < primos + noPrimos; i++) {
      n[i] = noPrimo[i - primos];
    }
    /*--------------------------------------------------*/

    System.out.println("\n\nArray con los primos al principio:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
