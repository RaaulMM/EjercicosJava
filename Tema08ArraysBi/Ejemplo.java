/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8ArraysBi;

/**
 *
 * @author raulmoreno
 */
public class Ejemplo {
  public static void main(String[] args) throws InterruptedException {
    
      int [][] n = new int[3][2];

      n[0][0] = 20;
      n[1][0] = 67;
      n[1][1] = 33;
      n[2][1] = 7;

      for (int fila =0; fila <3; fila++){
        System.out.print("Fila: " + fila);

        for(int columna = 0; columna <2; columna++){
          System.out.printf("%10d", n[fila][columna]);
          Thread.sleep(1000); // retardo de un segundo
         }
          System.out.println(); 
      }
    }
  }

