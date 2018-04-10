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
public class ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    System.out.println("¿Introduce el caracter con la que quieres hacer la piramide?");
    String c = s.next();
    
    System.out.println("Introduzca a si desea que el vértice esté hacia arriba.");
    System.out.println("Introduzca b si desea que el vértice esté hacia abajo.");
    System.out.println("Introduzca i si desea que el vértice esté hacia la izquierda.");
    System.out.println("Introduzca d si desea que el vértice esté hacia la derecha.");
    String caracter = s.next();
    
     switch (caracter) {
    case "a":
      System.out.printf("      %s\n", c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      break;
    case "b":
      System.out.printf(" %s%s%s%s%s%s%s%s%s%s%s\n", c, c, c, c, c, c, c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s%s\n", c, c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s\n", c, c, c);
      System.out.printf("      %s\n", c);
      break;
    case "i":
      System.out.printf("        %s\n",c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("   %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("    %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("     %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("       %s%s\n", c, c);
      System.out.printf("        %s\n",c);
      break;
    case "d":
      System.out.printf("      %s\n",c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s%s\n", c, c, c, c, c, c);
      System.out.printf("      %s%s%s%s%s\n", c, c, c, c, c);
      System.out.printf("      %s%s%s%s\n", c, c, c, c);
      System.out.printf("      %s%s%s\n", c, c, c);
      System.out.printf("      %s%s\n", c, c);
      System.out.printf("      %s\n",c);
      break;
    default:
      System.out.println("La dirección elegida no es correcta");
      break;
    
    
  }
  }
}
