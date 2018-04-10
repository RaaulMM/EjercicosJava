/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    
    
    boolean igual = false;
    int dado1 =1;
    int dado2 =0;
    
    System.out.println("Primer dado || Segundo dado");
    do{
    dado1 = (int)(Math.random()*6)+1;
    System.out.print("     "+dado1 + " -----||------ ");
    dado2 = (int)(Math.random()*6)+1;
    System.out.println( dado2);
    
    if (dado1 == dado2){
      igual = true;
    }
   } while  (!igual);
      
    
  }
}
