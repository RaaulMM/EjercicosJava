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
public class Ejercicio05 {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   
   int [] n;
    
    n = new int[12];
    
    int anterior = 0;
    int max =0;
    int min =0;
    for (int i = 0; i <= 9; i++) {
      System.out.print("Introduzca numero: "); 
      n[i] =  s.nextInt();
      
      if (n[i] > max){
        max = n[i];
      }
      if (n[i]< min){
        min= n[i];
      }
    }
    
    for (int i = 0; i <= 9; i++) { 
      if (n[i] == max){
        System.out.println(n[i]+" Maximo");
      } else if (n[i]== min){
        System.out.println(n[i]+" Minimo");
      } else {System.out.println(n[i]+" | ");}
    }
 }
}
