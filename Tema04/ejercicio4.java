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
public class ejercicio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce las horas trabajadas: ");
    double horasTr = s.nextDouble();
    
    if (horasTr <= 40){
    System.out.println("El total del salario es: " + (horasTr * 12));
    } 
    else {
    double extr = horasTr-40;
    double total = (40 * 12) + (extr * 16); 
    
    System.out.println("El total del salario es: " + total + " euros.");
    }
  }
}
