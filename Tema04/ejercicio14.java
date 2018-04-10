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
public class ejercicio14 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
      System.out.println("Introduce un numero");
      int numero = Integer.parseInt(s.nextLine());
      if (numero % 2==0) {
        System.out.println("El número es par.");
      } else {
        System.out.println("El número es impar.");
    }
      if (numero % 5==0) {
        System.out.println("El número es divisible por 5");
    } else {
        System.out.println("El número no es divisible por 5");
    }
    }
}
