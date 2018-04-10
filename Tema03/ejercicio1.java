/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

/**
 *
 * @author raulmoreno
 */
 import java.util.Scanner;
public class ejercicio1 {
  public static void main(String[] args) {
    
   
   
    Scanner s = new Scanner(System.in);
    
   
   System.out.print("Introduce un numero entero: ");
   int num1 = Integer.parseInt(s.nextLine());
   System.out.print("Introduce otro numero entro: ");
   int num2 = Integer.parseInt(s.nextLine());
   System.out.println("Hola, la multiplicacion de "+ num1 +" y " +num2+" Es "+ num1 * num2);
  }
}
