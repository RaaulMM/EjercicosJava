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
public class ejercicio16 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Contesta a las preguntas con un V o F");
      int puntos = 0;
      
      System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    String P1 = s.next();
    if (P1.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Ha aumentado sus gastos de vestuario: ");
    String P2 = s.next();
    if (P2.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
    String P3 = s.next();
    if (P3.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    String P4 = s.next();
    if (P4.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
    String P5 = s.next();
    if (P5.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    String P6 = s.next();
    if (P6.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    String P7 = s.next();
    if (P7.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más \ntrabajo: ");
    String P8 = s.next();
    if (P8.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Has notado que últimamente se perfuma más: ");
    String P9 = s.next();
    if (P9.equals("V")) {
      puntos = puntos + 3;
    }
    System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    String P10 = s.next();
    if (P10.equals("V")) {
      puntos = puntos + 3;
    }
  if ((puntos >= 0) && (puntos <= 10)) {
  System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel."); 
  } else if ((puntos >= 11) && (puntos <= 22)) {
  System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente,\naunque seguramente será algo sin importancia.\nNo bajes la guardia."); 
  } else if ((puntos >= 22) && (puntos <= 30)) {
  System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romancecon \notra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza."); 
  }
      
  }
}
