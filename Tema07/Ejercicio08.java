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
public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n;
    n = new int[12];
  

    String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[37m";
    String blanco = "\033[37m";
    String negro = " \033[0m";
    for (int p = 0; p <= 11; p++) {
      System.out.print("Introduzca la temperatura del mes de " + (mes[p]) + ":");
      n[p] = s.nextInt();
    }

    for (int i = 0; i < 12; i++) {
      System.out.printf(negro + "%10s " + verde + "│", mes[i]);
      for (int j = 0; j < n[i]; j++) {
        System.out.print(morado + "▤");
      }
      System.out.println(negro + " " + n[i] + "ºC" + blanco);
    }
  }
}
