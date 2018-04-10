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
public class ejercicio21 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
    
      System.out.print("Introduce nota del primer examen: ");
      double nota1 = s.nextDouble();
      
      System.out.print("Introduce nota del segundo examen: ");
      double nota2 = s.nextDouble();
      
      double trimestre;
      trimestre = ((nota1+nota2)/2);
      String recu = null;
      
      if (trimestre >= 5){
        System.out.print("Tu nota de Programación es " + trimestre);
      } else{
        System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        recu = s.next();
        if(recu.equals("no")){
          System.out.println("Tu nota de Programación es " + trimestre + " estas suspendido");
        }
        if(recu.equals("apto")){
          System.out.println("Tu nota de Programación es un 5 estas aprobado");
        }else{
          System.out.println("valor introducido no valido");
        }
      }
    }
      
}
