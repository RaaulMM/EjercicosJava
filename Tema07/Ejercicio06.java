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
public class Ejercicio06 {
   public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   int [] n;
    
    n = new int[15];
    
    
    for (int i = 0; i <= 14; i++) {
      System.out.print("Introduzca numero: "); 
      if (i==14){
         n[0] =  s.nextInt();
      }else
       n[i+1] =  s.nextInt();
      
    
    }
    for (int i = 0; i <= 14; i++) {
      System.out.print(n[i]+" | ");
    }
   }
}
