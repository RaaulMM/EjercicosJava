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
public class ArbolDeNavidad {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Seleccione la altura: ");
    int altura = s.nextInt();
    
    int piramide = altura - 1;
    int espacios = piramide - 1;
    int follaje = 1;
    int probabilidadAparecer = 0;
    int probabilidadAdorno = 0;
    
    for (int i = 0; i < espacios; i++) {
      System.out.print(" ");
    }
      System.out.print("*");
      System.out.println();
    
    do {
      
      
      
      for (int e = 0; e < espacios; e++) {
        System.out.print(" ");
      }
       
      for (int e = 0; e < follaje; e++) {
        
        probabilidadAparecer = (int)(Math.random() * 3);
        probabilidadAdorno = (int)(Math.random() * 3);
        
        switch (probabilidadAparecer) {
          case 0:
          case 1:
            System.out.print("^");
            break;
          case 2:
              
            switch (probabilidadAdorno) {
              case 0:
              case 1:
                System.out.print("O");
                break;
              case 2: 
                System.out.print("*");
              }
              break;
            }
      }
       
      System.out.println();
      follaje += 2;
      espacios--;
      
      } while (espacios >= 0);
    }
  }

 