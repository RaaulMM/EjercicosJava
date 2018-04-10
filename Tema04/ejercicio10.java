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
public class ejercicio10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce día de nacimiento: ");
    int dia= Integer.parseInt(s.nextLine());
    System.out.print("Introduce Mes de nacimiento: ");
    String mes = s.next();
    
    if ((dia>=21) && (dia <= 31)) {
      if (mes.equals("enero")) {
      System.out.println("Eres Acuario");
      }
      if (mes.equals("Febrero")) {
      System.out.println("Eres Piscis");
      }
      if (mes.equals("marzo")) {
      System.out.println("Eres Aries");
      }
      if (mes.equals("abril")) {
      System.out.println("Eres Tauro");
      }
      if (mes.equals("mayo")) {
      System.out.println("Eres Géminis");
      }
      if (mes.equals("junio")) {
      System.out.println("Eres Cáncer");
      }
      if (mes.equals("julio")) {
      System.out.println("Eres Leo");
      }
      if (mes.equals("agosto")) {
      System.out.println("Eres Virgo");
      }
      if (mes.equals("septiembre")) {
      System.out.println("Eres Libra");
      }
      if (mes.equals("octubre")) {
      System.out.println("Eres Escorpio");
      }
      if (mes.equals("noviembre")) {
      System.out.println("Eres Sagitario");
      }
      if (mes.equals("diciembre")) {
      System.out.println("Eres Capricornio");
      } 
    } else {
      if (mes.equals("enero")) {
      System.out.println("Eres Capricornio");
      }
      if (mes.equals("febrero")) {
      System.out.println("Eres Acuario");
      }
      if (mes.equals("marzo")) {
      System.out.println("Eres Piscis");
      }
      if (mes.equals("abril")) {
      System.out.println("Eres Aries");
      }
      if (mes.equals("mayo")) {
      System.out.println("Eres Tauro");
      }
      if (mes.equals("junio")) {
      System.out.println("Eres Géminis");
      }
      if (mes.equals("julio")) {
      System.out.println("Eres Cáncer");
      }
      if (mes.equals("agosto")) {
      System.out.println("Eres Leo");
      }
      if (mes.equals("septiembre")) {
      System.out.println("Eres Virgo");
      }
      if (mes.equals("octubre")) {
      System.out.println("Eres Libra");
      }
      if (mes.equals("noviembre")) {
      System.out.println("Eres Escorpio");
      }
      if (mes.equals("diciembre")) {
      System.out.println("Eres Sagitario");
      } 
    }
  }
}
