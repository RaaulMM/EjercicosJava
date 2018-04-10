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
 * 
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.
 */
public class ejercicio10 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      boolean x = false;
      int intentos = 0;
      int suma = 0;
      
      while (!x) {
        System.out.print("Introduzca numero: "); 
        int numeroIntro =  s.nextInt();
        intentos++;
        if(numeroIntro > 0){
          suma += numeroIntro;
        }else {
          intentos --;
          x = true;
          System.out.println("Nota media es " + (suma/intentos)); 
        }
        
        
      }
    }
}
