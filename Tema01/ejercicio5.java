/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema1;

/**
 *
 * @author RaaulMM
 */
public class ejercicio5 {
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String negro = "\033[30m";


    System.out.println(negro + "Entrada    8:15   9:15    10:15   11:45    12:45   13:45");
    System.out.println(negro  + "Lunes:     " + morado + "SINF   SINF    SINF    " + rojo + "FOL      FOL     FOL");
    System.out.println(negro + "Martes:    " + verde + "PRO    PRO     PRO     " + blanco + "BBDD     BBDD    BBDD");
    System.out.println(negro + "Miércoles: " + morado + "SINF   SINF    SINF    " + azul + "ED       ED      " + naranja +"LM");
    System.out.println(negro+ "Jueves:    " + verde + "PRO    PRO     PRO     " + blanco + "BBDD     BBDD    BBDD");
    System.out.println(negro + "Viernes:   " + verde + "PRO    PRO     " + azul + "ED      " + naranja + "LM       LM      LM");
    
    
}
  
}
