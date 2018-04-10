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
public class Ejercicio01 {
 public static void main(String[] args) { 
 
int suma=0;
  
  for (int i = 1; i <= 3; i++){
    int dado = (int)(Math.random()*6)+1;
    switch (dado) {
     case 1:
      System.out.println("Dado "+ i +": " +"⚀");
      suma+=dado;
      break;
     case 2:
      System.out.println("Dado "+ i +": " +"⚁");
      suma+=dado;
      break;
     case 3:
      System.out.println("Dado "+ i +": " +"⚂");
      suma+=dado;
      break;
     case 4:
      System.out.println("Dado "+ i +": " +"⚃");
      suma+=dado;
      break;
     case 5:
      System.out.println("Dado "+ i +": " +"⚄");
      suma+=dado;
      break;
     case 6:
      System.out.println("Dado "+ i +": " +"⚅");
      suma+=dado;
      break;
    }
      
    
    
   
  }
   System.out.println("La suma de los dados es "+suma);
}
  
  
 
}
