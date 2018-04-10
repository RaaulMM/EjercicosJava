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
public class ejercicio22 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la hora en formato 24h y sepados por espacio. Ej: 22 10: ");
    int hora = s.nextInt();
    int minut = s.nextInt();
    System.out.println("¿En que dia estamos hoy? Introduce el numero correspondiente.");
    System.out.println("1--> Lunes");
    System.out.println("2--> Martes");
    System.out.println("3--> Miercoles");
    System.out.println("4--> Jueves");
    System.out.println("5--> Viernes");
    System.out.print("Introduce el numero correspondiente: ");
    int dia = s.nextInt();

    int diaCompleto = 1440;
    int minutos = (hora * 60) + minut;
    int minutosViernes = 900;
    int hoy = 0;

    switch (dia) {
      case 1:
        hoy = diaCompleto - minutos;
        hoy = hoy + (diaCompleto * 3);
        hoy = hoy + minutosViernes;
        System.out.println("Te faltan " + hoy + " minutos para llegar al fin de semana");
        break;
      case 2:
        hoy = diaCompleto - minutos;
        hoy = hoy + (diaCompleto * 2);
        hoy = hoy + minutosViernes;
        System.out.println("Te faltan " + hoy + " minutos para llegar al fin de semana");
        break;
      case 3:
        hoy = diaCompleto - minutos;
        hoy = hoy + (diaCompleto);
        hoy = hoy + minutosViernes;
        System.out.println("Te faltan " + hoy + " minutos para llegar al fin de semana");
        break;
      case 4:
        hoy = diaCompleto - minutos;

        hoy = hoy + minutosViernes;
        System.out.println("Te faltan " + hoy + " minutos para llegar al fin de semana");
        break;
      case 5:
        hoy = minutosViernes - minutos;
        System.out.println("Te faltan " + hoy + " minutos para llegar al fin de semana");

        break;
    }

  }

}
