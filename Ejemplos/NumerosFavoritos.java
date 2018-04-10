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
public class NumerosFavoritos {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int[] favoritos = new int[5];
    boolean favorito = false;
    
    System.out.println("Introduce tus 5 números favoritos: ");
    
    for (int i = 0; i < 5; i++) {
      
      numero = s.nextInt();
      favoritos[i] = numero;
    }
    
    for (int i = 1; i < 101; i++) {
      
      favorito = false;
      
      for (int r = 0; r < 5; r++) {
        
        if (favoritos[r] == i) {
          favorito = true;
        } 
      }
      
      if (favorito == true) {
        System.out.print(i + " ME GUSTA,");
      } else {
        System.out.print(i + " no me gusta,");
      }
      
      if (i % 5 == 0) {
        System.out.println();
      }
    }
  }
}
