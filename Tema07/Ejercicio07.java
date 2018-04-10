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
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] n;
    String verde = "\033[32m";
    String negro = " \033[0m";

    n = new int[100];
    int linea = 0;
    for (int i = 0; i <= 99; i++) {
      int numero = (int) (Math.random() * 21);
      n[i] = numero;

    }
    for (int i = 0; i <= 99; i++) {
      System.out.print(n[i] + " | ");

    }
    System.out.println(" ");
    System.out.print("¿Que numero quieres sustituir?: ");
    int valor1 = s.nextInt();
    System.out.print("¿Por cual lo quieres susituir?: ");
    int valor2 = s.nextInt();

    for (int j = 0; j < 100; j++) {
      if (n[j] == valor1) {
        n[j] = valor2;
        System.out.print(verde + n[j] + negro +"| ");
      } else {
        System.out.print(n[j] + " | ");
      }
    }
  }
}
