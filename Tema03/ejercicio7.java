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

public class ejercicio7 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    double iva = 1.21;
   
    System.out.print("Introduce la base imponible: ");
    double baseImp = Integer.parseInt(s.nextLine());
    
    System.out.println("El total con iva seria " +  baseImp * iva + "€");
  }
}
