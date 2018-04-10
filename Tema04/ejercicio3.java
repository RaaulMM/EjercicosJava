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
public class ejercicio3 {
  
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
   System.out.print("Introduce del 1 al 7 ambos incluido como si fuera del Lunes al Domingo ");
   int respuesta = Integer.parseInt(s.nextLine());
   
   String nombreDia;
   
   switch (respuesta) {
     case 1:
      nombreDia = "Lunes";
      break;
     case 2:
      nombreDia = "Martes";
      break;
     case 3:
      nombreDia = "Miercoles";
      break;
     case 4:
      nombreDia = "Jueves";
      break;
     case 5:
      nombreDia = "Viernes";
      break;
     case 6:
      nombreDia = "Sabado";
      break;
     case 7:
      nombreDia = "Domingo";
      break;
     default:
      nombreDia = "No existe ese día";
        
    
    }
   System.out.println("El dia " + respuesta + " es "+nombreDia);
   }
}

