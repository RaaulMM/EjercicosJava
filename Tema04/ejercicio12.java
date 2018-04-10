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
public class ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Minicuestionario");
    int nota = 0;
    
    System.out.println("Pregunta 1 es a");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p1 = s.next();
    if (p1.equals("a")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 2 es c");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p2 = s.next();
    
    if (p2.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 3 es b");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p3 = s.next();
    if (p3.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 4 es b");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p4 = s.next();
    if (p4.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 5 es a");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p5 = s.next();
    if (p5.equals("a")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 6 es c");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p6 = s.next();
    if (p6.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 7 es b");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p7 = s.next();
    if (p7.equals("b")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 8 es a");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p8 = s.next();
    if (p8.equals("a")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 9 es c");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p9 = s.next();
    if (p9.equals("c")) {
      nota = nota + 1;
    }
    System.out.println("Pregunta 10 es b");
    System.out.println("A");
    System.out.println("B");
    System.out.println("C");
    String p10 = s.next();
    if (p10.equals("b")) {
      nota = nota + 1;
    }
  System.out.println("Has sacado un " + nota + " sobre 10."); 
  }
}
