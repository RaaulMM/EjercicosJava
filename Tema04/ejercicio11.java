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
public class ejercicio11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la hora en formato de 24H ");
    int hora = Integer.parseInt(s.nextLine());
    System.out.print("Introduce minutos ");
    int minuto = Integer.parseInt(s.nextLine());
   
    
      if ((hora > 24) || (minuto > 60) || (hora < 0) || minuto < 0) {
        System.out.println("Hora introducida no valida");
      } else if (hora >= 24) {
        System.out.println("La media noche ya a pasado");
      } else {
        hora = 24 - hora;
        if ((minuto == 0)) {
          minuto = 0;
        } else {
          minuto = 60 - minuto;
        }

        int segundos = (minuto * 60) + (hora * 3600);
        System.out.println("Quedan " + segundos + " segundos para medianoche.");
      }
    
  }
}
