package Tema4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raulmoreno
 */
public class ejercicio18 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     System.out.println("Introduce un numero");
       int numero = Integer.parseInt(s.nextLine());
       int orimerNumero = 0;
    if (numero < 10) {
    orimerNumero = numero;
    }
    if ((numero >= 10) && (numero < 100)) {
    orimerNumero = numero/10;
    }
    if ((numero >= 100) && (numero < 1000)) {
    orimerNumero = numero/100;
    }
    if ((numero >= 1000) && (numero < 10000)){
    orimerNumero = numero/1000;
    }
    if ((numero >= 10000) && (numero < 100000)) {
    orimerNumero = numero/10000;
    }
    if ((numero >= 100000) && (numero < 1000000)) {
    orimerNumero = numero/100000;
    }
    if ((numero >= 1000000) && (numero < 10000000)) {
    orimerNumero = numero/1000000;
    }
    if ((numero >= 10000000) && (numero < 100000000)) {
    orimerNumero = numero/10000000;
    }
    if ((numero >= 10000000) && (numero < 100000000)) {
    orimerNumero = numero/10000000;
    }
    if ((numero >= 100000000) && (numero < 1000000000)) {
    orimerNumero = numero/100000000;
    }
   
    System.out.println("El primer numero es: " + orimerNumero);
  }
}
