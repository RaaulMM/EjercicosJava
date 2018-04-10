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
public class Ejercicio03 {

  public static void main(String[] args) {
    int palo = (int) (Math.random() * 4) + 1;
    int numero = (int) (Math.random() * 10) + 1;

    do {
      numero = (int) (Math.random() * 10) + 1;
      /* System.out.println(numero);*/
    } while ((numero > 7) && (numero <= 9)|| (numero ==0) || (palo ==0));

    switch (palo) {
      case 1:
        if ((numero > 1) && (numero <= 7)) {
          System.out.println(numero + " de Oro");
        }
        if (numero == 1) {
          System.out.println("As de Oro");
        }
        if (numero == 10) {
          System.out.println("Sota de Oro");
        }
        if (numero == 11) {
          System.out.println("Caballo de Oro");
        }
        if (numero == 112) {
          System.out.println("Rey de Oro");
        }
        break;
      case 2:
        if ((numero > 1) && (numero <= 7)) {
          System.out.println(numero + " de Bastón");
        }
        if (numero == 1) {
          System.out.println("As de Bastón");
        }
        if (numero == 10) {
          System.out.println("Sota de Bastón");
        }
        if (numero == 11) {
          System.out.println("Caballo de Bastón");
        }
        if (numero == 112) {
          System.out.println("Rey de Bastón");
        }
        break;
      case 3:
        if ((numero > 1) && (numero <= 7)) {
          System.out.println(numero + " de Espadas");
        }
        if (numero == 1) {
          System.out.println("As de Espadas");
        }
        if (numero == 10) {
          System.out.println("Sota de Espadas");
        }
        if (numero == 11) {
          System.out.println("Caballo de Espadas");
        }
        if (numero == 112) {
          System.out.println("Rey de Espadas");
        }
        break;
      case 4:
        if ((numero > 1) && (numero <= 7)) {
          System.out.println(numero + " de Copas");
        }
        if (numero == 1) {
          System.out.println("As de Copas");
        }
        if (numero == 10) {
          System.out.println("Sota de Copas");
        }
        if (numero == 11) {
          System.out.println("Caballo de Copas");
        }
        if (numero == 112) {
          System.out.println("Rey de Copas");
        }
        break;

    }
  }
}
