/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    int[] numero;
    numero = new int[21];
    int[] cuadrado;
    cuadrado = new int[21];
    int[] cubo;
    cubo = new int[21];

    for (int i = 0; i <= 20; i++) {
      int dado = (int) (Math.random() * 101);
      numero[i] = dado;
    }
    for (int i = 0; i <= 20; i++) {
      int dado = (int) (Math.random() * 101);
      cuadrado[i] = dado;
    }
    for (int i = 0; i <= 20; i++) {
      int dado = (int) (Math.random() * 101);
      cubo[i] = dado;
    }
    System.out.println("┌─────────┬──────────┬────────┐");
    System.out.println("│ Numero  │ Cuadrado │ cubo   │");
    System.out.println("├─────────┼──────────┼────────┤");
    for (int i = 0; i <= 20; i++) {
      System.out.printf("%1s %3d %5s %3d %6s %3d %4s\n", "│", numero[i], "│", cuadrado[i], "│", cubo[i], "│");
      if(i ==20){
      System.out.println("└─────────┴──────────┴────────┘"); 
      }else 
      System.out.println("├─────────┼──────────┼────────┤");
    }
  }
}
