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
public class ejercicio10 {
   public static void main(String[] args) { 
     
   Scanner s = new Scanner(System.in);
   
   
   System.out.print("Introduce los MB: ");
   int mb = Integer.parseInt(s.nextLine());
   
   System.out.println (mb +"Mb son "+ mb * 1024 +"Kb");
   }
}
