/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    int suspenso =0;
    int suficientes=0;
    int bien=0;
    int notable =0;
    int sobresaliente =0;    
  
    for (int linea = 1; linea <= 20; linea++) {
      int notas = (int) (Math.random() * 11);
      switch(notas) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
              suspenso++;
              break;
            case 5:
              suficientes++;
              break;
            case 6:
            case 7:
              bien++;
              break;
            case 8:
            case 9:
              notable++;
              break;
            case 10:
              sobresaliente++;
              break;
      }
      System.out.print(notas+ " ");
 
    }
    System.out.println(" ");
    System.out.println("Suspensos = " +suspenso);
    System.out.println("Suficientes = " +suficientes);
    System.out.println("Bien = " +bien);
    System.out.println("Notables = " +notable);
    System.out.println("Sobresaliente = " +sobresaliente);
    
  }
}
