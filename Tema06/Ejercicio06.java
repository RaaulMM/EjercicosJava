/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   int numero = (int) (Math.random() * 101);
   boolean acierto = false;
   int intentos= 5;
   
  System.out.println("El numero random es "+numero); 
   while ((acierto == false)){
     if (intentos < 1){
       System.out.println("Has perdido");
       acierto = true;
       break;
        }
     
     System.out.print("Introduzca numero: "); 
     int numeroIntro =  s.nextInt();
    
       
    
     if (numeroIntro > numero){
       System.out.println("Siga intentandolo, el numero es menor que " + numeroIntro);
       intentos--;
       System.out.println("Te quedan "+ intentos+"/5 Intentos");
       
     }
     if (numeroIntro < numero){
       System.out.println("Siga intentandolo, el numero es mayor que " + numeroIntro);
       intentos--;
       System.out.println("Te quedan "+ intentos+"/5 Intentos");
       
     }
     if (numeroIntro == numero){
       System.out.println("Has acertado");
       System.out.println("Numero introducido: "+ numeroIntro);
       System.out.println("Numero ramdom: "+numero);
       acierto = true;
       
     }
       
   }
   
  }
}
