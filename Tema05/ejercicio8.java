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
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 */
public class ejercicio8 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca numero: ");
    int numero = s.nextInt();

    for (int i = 0; i <= 10; i++) {

      System.out.println(numero + " * " + i + " = " + (numero * i));

    }

  }

}
