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
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n;
    n = new int[20];
    
    int[] aux;
    aux = new int[20];
    
    for (int p = 0; p <= 19; p++) {
      int dado = (int) (Math.random() * 101);
      n[p] = dado;
    }
    int cont =0;
    int cont2= 4;
    for (int p = 0; p <= 19; p++) {
      if (n[p]%2==0){
        aux[cont]=n[p];
        cont++;
      }
    }
    for (int p = 0; p <= 19; p++) {
      if (n[p]%2!=0){
        aux[cont]=n[p];
        cont++;
      }
    }
    
    System.out.println("Array aleatorio ");
    for (int p = 0; p <= 19; p++) {
      System.out.print(n[p] + " | ");
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Array ordenado, primeras posiciones pares, despues impares ");
    for (int p = 0; p <= 19; p++) {
      System.out.print(aux[p] + " | ");
    }
    System.out.println(" ");
    
  }
}
