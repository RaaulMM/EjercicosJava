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
/**
Realiza un programa que pida una hora por teclado y que muestre luego
buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en
cuenta las horas, los minutos no se deben introducir por teclado.*/
public class ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la hora actual, solo hora los minutos no, del 1 al 24 ");
    int respuesta = Integer.parseInt(s.nextLine());
    
    String frase;
    
    if ((respuesta >= 6) && (respuesta <= 12)) {
      frase = "Buenos días";
      System.out.println(frase);
    }
    if ((respuesta >= 13) && (respuesta <=20)) {
      frase = "Buenas tardes";
      System.out.println(frase);
    }
    if ((respuesta >= 21) && (respuesta <= 24) || (respuesta >=1) && (respuesta <= 5))  {
      frase = "Buenas noches";
      System.out.println(frase);
    }
      
  }
}
