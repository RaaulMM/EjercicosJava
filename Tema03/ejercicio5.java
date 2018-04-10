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
public class ejercicio5 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    
    System.out.print("Introduce la anchura del rectangulo: ");
    int ancho = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduce la altura del rectangulo: ");
    int alto = Integer.parseInt(s.nextLine());
    
    System.out.print("El area de tu rectangulo es: " + ancho * alto);
  }
}
