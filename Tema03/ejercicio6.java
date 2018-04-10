/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ejercicio6 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    double x;
    System.out.print("Introduce la base del triangulo: ");
    double base = Integer.parseInt(s.nextLine());

    System.out.print("Introduce la altura del triangulo: ");
    int alto = Integer.parseInt(s.nextLine());
    x = base * alto;
    System.out.print("El area de tu rectangulo es: " + x / 2);
  }
}
