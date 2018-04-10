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
public class Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
   
    int oportunidades = 5;
    int numero;
    int minimo = 0;
    int maximo = 100;
    boolean acierto = true;
    
    do{
      
      numero = (int)(Math.random()* (maximo - minimo) + minimo);
      oportunidades--;
      System.out.print("Es este tu número? y/n "+numero+": ");
      String sino =  s.next();
      if ("y".equals(sino)){
        acierto=!acierto;
        System.out.println("Bien tu numero pensado es: "+ numero);
        break;
      }
      if ("n".equals(sino)){
        System.out.print("Pon 1 si es mayor o 2 si es menor: ");
        int Mm =  s.nextInt();
        if ((Mm==2) && (oportunidades > 0)){
          maximo = numero - 1;
        }
        if ((Mm==1) && (oportunidades > 0)){
          minimo = numero + 1;
        }
        if (oportunidades <=0){
          acierto= false;
        }
          
        
      }
      
     
      
      
    }while (acierto =true  && (oportunidades > 0));
    if (oportunidades <=0){
      System.out.println("Me quede sin intentos, no he conseguido adivinar el numero");
    }
  }
}
