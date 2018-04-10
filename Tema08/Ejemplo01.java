/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class Ejemplo01 {
  // Programa principal //////////////////////////////////////

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    /*
    System.out.print("Introduzca un número entero positivo: ");
    int n = s.nextInt();
      
  
    if (esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }
     */

    System.out.print("Introduzca la nota del primer trimestre: ");
    double nota1 = s.nextInt();
    System.out.print("Introduzca la nota del segundo trimestre: ");
    double nota2 = s.nextInt();
    System.out.print("Introduzca la nota del tercer trimestre: ");
    double nota3 = s.nextInt();

    System.out.print("La nota final de los trimestres " + media(nota1, nota2, nota3));
    
    System.out.println(" ");
    System.out.print("Introduzca la nota del trabajo final: ");
    double notaTrabajo = s.nextInt();
    
    System.out.print("La nota final del curso es: " + media(nota1, nota2, nota3, notaTrabajo));
  }

  // Funciones ///////////////////////////////////////////////
  /**
   * Comprueba si un número entero positivo es primo o no. Un número es primo
   * cuando únicamente es divisible entre él mismo y la unidad.
   *
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es primo y <code>false</code> si el
   * número no es primo.
   */
  /*public static void pintaPiramide(int altura, String caracter, boolean estaRellena, String color, String direccion){}
  public static boolean esCapicua(long n){}*/
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }
  
  /**
   * Calcula la media de 3 numeros
   *
   * @param nota1 un número de tipo double
   * @param nota2 un número de tipo double
   * @param nota3 un número de tipo double
   * @return la media de nota1, nota3, nota3
   */
  public static double media(double nota1, double nota2, double nota3) {
    double media = (nota1 + nota2 + nota3) / 3;
    return media;
  }
  
    /**
   * Calcula la media de 3 numeros
   *
   * @param nota1 un número de tipo double
   * @param nota2 un número de tipo double
   * @param nota3 un número de tipo double
   * @return la media de nota1, nota3, nota3
   */
  public static double media(
    double nota1, double nota2, double nota3, double notaTrabajo) {
    double media = (nota1 + nota2 + nota3+ notaTrabajo) / 4;
    return media;
  }
}
