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
public class Ramdom1 {
  public static void main(String[] args) {
    System.out.println("Temperaruras malaga ");
    int temperatura = (int)(Math.random()*21)+10;
    boolean llovera = (int)(Math.random()*10)==10; 
    System.out.println("Temperaruras " + temperatura);
    
    if (llovera){
      System.out.println("Se espera lluvia ");
    }else {
      System.out.println("No espera lluvia ");
    }
      
  }
}
