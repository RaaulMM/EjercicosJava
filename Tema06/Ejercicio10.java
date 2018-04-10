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
public class Ejercicio10 {
  public static void main(String[] args) {
    
    for (int linea = 1; linea <= 10; linea++) {
      int caracter = (int) (Math.random() * 6);
      String simbolo ="";
      switch(caracter) {
            case 0:
              simbolo="*";
              break;
            case 1:
              simbolo="-";
              break;
            case 2:
              simbolo="=";
              break;
            case 3:
              simbolo=".";
              break;
            case 4:
              simbolo="|";
              break;
            case 5:
              simbolo="@";
              break;
          }
      int longitud = (int) (Math.random() * 40)+1;
      for (int i = 1; i <= longitud; i++) {
        System.out.print(simbolo);
      }
      System.out.println(" ");
    }
  }
}
