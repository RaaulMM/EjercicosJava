package Tema5;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raulmoreno
 */
public class ejercicio18 {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in); 
  
  int numero1 =0;
  int numero2=0;
  do{
  System.out.println("Introduzca numero entero ");
  numero1 = s.nextInt();
  System.out.println("Introduzca otro numero entero ");
  numero2 = s.nextInt();
  if (numero1 == numero2){
    System.out.println("Los números introducidos no son válidos, deben ser distintos.");
  } 
    }while (numero1 == numero2);
  
  if (numero1 > numero2) {
  int aux = numero1;
  numero1 = numero2;
  numero2 = aux;
    }
  for(int i = numero1; i <= numero2; i += 7) {
      System.out.println(i + " ");
    }
 }
}
