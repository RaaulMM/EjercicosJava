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

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int pHoras;
    pHoras = 12;
    System.out.print("Introduce las horas trabajadas: ");
    double horas = Integer.parseInt(s.nextLine());
    
    System.out.println("Tu salario seria de " + horas * pHoras +  "€");
  }
}
