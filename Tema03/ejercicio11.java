/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

/**
 *
 * @author raulmoreno
 */
import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) { 
  
   Scanner s = new Scanner(System.in);
  
  System.out.print("Introduce la nota del primer examen: ");
   double nota = Integer.parseInt(s.nextLine());
   
  System.out.print("Introduce la nota que quieres de media: ");
   double notaM = Integer.parseInt(s.nextLine());
 
   
   nota = nota *0.4;
   notaM = notaM;
   double notaNecesaria = ((notaM - (0.4*nota))/0.6);
   double segundaNota = ((notaM - (0.4*nota))/0.6);
  // notaNecesaria = notaNecesaria /0.6;
  System.out.println(nota);
  System.out.println(notaM);
  
  System.out.println("La nota neceraria en el segundo examen es: "+ segundaNota);
  }
  
}
