/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema5;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    por teclado.
 */
public class ejercicio9 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca numero: ");
    long numero = s.nextLong(); 
    long n = numero;
    
    int cifras = 1;
    while (n > 10) {
      n /= 10;
      cifras++;
    }
    
    System.out.println(numero + " tiene " + cifras + " dígito/s.");
    }
}
