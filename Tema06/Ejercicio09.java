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
public class Ejercicio09 {
  public static void main(String[] args) {
    
    boolean holi = true;
    int contador=0;
    while ((holi == true)){
      int numero = (int) (Math.random() * 101);
    
      if (numero % 2 == 0){
        System.out.println(numero);
        contador ++;
      }
      if (numero ==24){
        holi = false;
        System.out.println("Han salido " +contador +" numeros pares");
      }
    }
  }
}
