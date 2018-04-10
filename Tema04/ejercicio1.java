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
public class ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
   System.out.print("Introduce del 1 al 5 ambos incluido como si fuera del Lunes al Viernes ");
   int respuesta = Integer.parseInt(s.nextLine());
   
   String nombreDeAsig;
   
   switch (respuesta) {
     case 1:
      nombreDeAsig = "Lunes es PRO";
      break;
     case 2:
      nombreDeAsig = "Martes es PRO";
      break;
     case 3:
      nombreDeAsig = "Miercoles es SINF";
      break;
     case 4:
      nombreDeAsig = "Jueves es PRO";
      break;
     case 5:
      nombreDeAsig = "Viernes es PRO";
      break;
     default:
      nombreDeAsig = "No existe ese día";
        
    
    }
   System.out.println("La asignatura para el " + nombreDeAsig);
  }
}
