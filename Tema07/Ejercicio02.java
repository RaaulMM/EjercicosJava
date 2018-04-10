/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema7;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    String [] carac;
    
    carac = new String[10];
    
    carac[0]= "a";
    carac[1]= "x";
    carac[4]= "@";
    carac[6]= " ";
    carac[7]= "+";
    carac[8]= "Q";
    
    for (int i = 0; i <= 9; i++) {
    System.out.print(carac[i] +" | ");
    }
  }
}
