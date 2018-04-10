/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int [] n;
    
    n = new int[12];
    
   n[0] = 39;
   n[1]= -2;
   
   
   n[4]= 0;
  
   n[6]= 14;
   
   n[8]= 5;
   n[9]= 120;
   
   
   for (int i = 0; i <= 11; i++) {
     System.out.print(n[i] +" | ");
   }
  }
}
