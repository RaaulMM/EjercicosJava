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
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int mayor =1;
    int media =0;
    
    for (int i = 1; i <= 50; i++) {
      
    int numero = (int) (Math.random() * 200);
   
    while ((numero < 100) || (numero > 199)){
     numero = (int) (Math.random() * 200);
    }
    if (numero > mayor){
     mayor = numero;
     }
    media += numero;
    System.out.print(numero + " ");
    
    }
    System.out.println(" ");
    System.out.println("----------------------");
    System.out.println("La media es "+media/50);
    System.out.println("El mayor numero es "+ mayor);
    
  }
}
