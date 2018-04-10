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
public class Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] n;
    n = new int[10];
    
    for (int p = 0; p <= 9; p++) {
      System.out.print("Introduzca numero: ");
      n[p] = s.nextInt();
      
    }
    for (int p = 0; p <= 9; p++) {
      if (n[p]%2==0){
        System.out.println(n[p]+" Par");
      }else {System.out.println(n[p]+" Impar"); }
        
    }
  }
}
