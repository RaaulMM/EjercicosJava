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
public class TabletaChocolate {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Seleccione la altura: ");
    int altura = s.nextInt();
    
    System.out.println("Seleccione la anchura: ");
    int ancho = s.nextInt();
    
    int numero;
    
    for (int i = 0; i < altura; i++) {
      
      for (int r = 0; r < ancho; r++) {
        
        numero = (int)(Math.random() * 5 + 1);
        
        switch(numero) {
          case 1:
          case 2:
          case 3:
          case 4:
            System.out.print("#");
            break;
          case 5:
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
