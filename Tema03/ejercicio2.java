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
public class ejercicio2 {
  public static void main(String[] args) {
    double pesetas = 166.38;
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce euro: ");
    int euro = Integer.parseInt(s.nextLine());
    
    System.out.println("Tengo " + pesetas + " pesetas");
    System.out.println("Tengo " + euro + " Euros");

    System.out.println("Para pasar de euro a pesetas se multiplica "  + euro +" por "  + pesetas);
    System.out.println(+ euro+ " euros equivale a "+ euro * pesetas+" pesetas");
      }
}
