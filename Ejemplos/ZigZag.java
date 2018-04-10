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
public class ZigZag {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    int numero = (int)(Math.random() * 100001);
    int espacios = 20;
    int direccion = 0;
    
    System.out.println("El número generado es: " + numero);
    
    // Lo primero es voltear el número para imprimir según el orden
    
    int modulo;
    int volteado = 0;
    int cifra;
    
    do {
      modulo = numero % 10;
      volteado = volteado * 10 + modulo;
      numero /= 10;
    } while (numero > 0);
    
    do {
      
      cifra = volteado % 10;
      
      if (cifra == 0) {
        
        if (direccion == 1) {
          direccion = 0;
        } else {
          direccion = 1;
        }
      }
      
      if (direccion == 0) {
      
        for (int i = 0; i < cifra; i++) {
          
          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
              System.out.print("*");
              System.out.println();
              espacios--;
            } else {
        
              for (int r = 0; r < espacios; r++) {
                System.out.print(" ");
              }
                System.out.print("*");
                System.out.println();
                espacios++;
              }
            }
            direccion = 1;
            volteado /= 10;
        } else {
          
            for (int i = 0; i < cifra; i++) {
          
          if (i == cifra - 1) {
            for (int r = 0; r < espacios; r++) {
              System.out.print(" ");
            }
              System.out.print("*");
              System.out.println();
              espacios++;
            } else {
        
              for (int r = 0; r < espacios; r++) {
                System.out.print(" ");
              }
                System.out.print("*");
                System.out.println();
                espacios--;
              }
            }
              direccion = 0;
              volteado /= 10;
            }
        
        } while (volteado > 0);
      } 
}
