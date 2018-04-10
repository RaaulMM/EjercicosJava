/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema4;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ejercicio19 {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Introduce un numero");
      int numero = Integer.parseInt(s.nextLine());
      int cifra = 0;
     
     if (numero < 10){
       cifra = 1;
     }
     if (numero < 10){
       cifra = 1;
     }
    if ((numero >= 10) && (numero < 100)) {
       cifra = 2;
    }
    if ((numero >= 100) && (numero < 1000)) {
       cifra = 3;
     }
    if ((numero >= 1000) && (numero < 10000)){
       cifra = 4;
     }
    if ((numero >= 10000) && (numero < 100000)) {
      cifra = 5;
    }
    System.out.println("El numero tiene : "  + cifra + " cifras");
  }
}
