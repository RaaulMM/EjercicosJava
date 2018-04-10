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
public class Ejercicio03 {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   int [] n;
   int cuenta =9;
    
    n = new int[12];
    
    for (int i = 0; i <= 9; i++) {
      System.out.print("Introduzca numero: "); 
      n[cuenta] =  s.nextInt();
     cuenta--;
    }
    
    for (int i = 0; i <= 9; i++) {
      System.out.print(n[i]+" | ");
    }
     
 } 
}
