/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class Pasito {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[20];
    int indiceMenor = 0;
    int indiceMayor = 0;
    int numero;
    
    for (int i = 0; i < 20; i++) {
      
      numero = (int)(Math.random() * 1001);
      n[i] = numero;
      System.out.print(numero + " ");
    }
      System.out.println();
      System.out.println();
      
    System.out.println("Introduce un número del array: ");
    int primero = s.nextInt();
    
    System.out.println("Introduce otro que esté más hacia delante: ");
    int segundo = Integer.parseInt(System.console().readLine());
      
    for (int i = 0; i < 20; i++) {
      
      if (n[i] == primero) {
        indiceMenor = i;
      } else if (n[i] == segundo) {
        indiceMayor = i;
      }
    }
    
    System.out.println("Tienes que dar " + (indiceMayor - indiceMenor) + " pasito/s.");
  }
}
