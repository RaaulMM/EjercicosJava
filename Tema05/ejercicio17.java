/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ejercicio17 {
  
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero;
    int numeroSuma = 0;
    
    
      do{
        System.out.println("Introduzca numero entero positivo ");
        numero = s.nextInt();
      if (numero < 0){
        System.out.println("Introduzca numero entero positivo ");
        numero = s.nextInt();
      }
        }while (numero < 0);
        for (int i = numero; i <= 100; i++) {
          numeroSuma += i;
        } 
        System.out.println("La suma de los 100 números siguientes a " + numero + " es " + numeroSuma);
        
      }
   }
      
  
  

