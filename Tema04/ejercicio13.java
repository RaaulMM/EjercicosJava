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
public class ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el primer numero ");
    int num1 = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el segundo numero ");
    int num2 = Integer.parseInt(s.nextLine());
    System.out.println("Introduce el tercer numero ");
    int num3 = Integer.parseInt(s.nextLine());
    
    int primero = 0;
    int segundo = 0;
    int tercero = 0;
    
    
    if ((num1 > num2) && (num1 >num3)) {
      tercero = num1;
    } else {
      if ((num2 > num1) && (num2 > num3)) {
        tercero = num2;
      }
    if ((num3 > num1) && (num3 > num2)) {
        tercero = num3;
      }
    }
    if ((num1 < num2) && (num1 < num3)) {
      primero = num1;
    } else {
      if ((num2 < num1) && (num2 < num3)) {
      primero = num2;
      }
      if ((num3 < num1) && (num3 < num2)) {
      primero = num3;
      }
    }
    if (((num1 > num2) && (num1 < num3)) || ((num1 < num2) && (num1 > num3))) {
      segundo = num1;
    } else {
      if (((num2 > num1) && (num2 < num3)) || ((num2 < num1) && (num2 > num3))) {
      segundo = num2;
      }
      if (((num3 > num1) && (num3 < num2)) || ((num3 < num1) && (num3 > num2))) {
      segundo = num3;
      }
    
    
    System.out.println("Los numeros ordenados: " + primero +" "+ segundo +" "+ tercero);
    }
  }
}
