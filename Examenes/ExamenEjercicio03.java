/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ExamenEjercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int espacios =0;
    
    System.out.print("Introduzca el número de líneas: ");
    int lineas = s.nextInt();
    if (lineas >1){
    System.out.print("Introduzca el número de espacios ");
    espacios = s.nextInt();
    }
    int altura = 4;
    
    
    for (int h = 1; h <= 4; h++) {
       System.out.println();
      for (int i = 1; i <= lineas; i++) {
        System.out.print("*");
        boolean papa = true;
        if ((espacios > 0)&&(papa = true)){
      
          for (int j = 1; j <= espacios; j++) {
            System.out.print(" ");
            papa = false;
          }
        }
      } 
    }
  }
  
  
}
