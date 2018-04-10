
/*
Raul Moreno Montiel
12-12-2017
Turno1
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex33rmm;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class Ex33rmm4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el día de la semana: ");
    String diaIntro = s.next();
    
    if (("miercoles".equals(diaIntro))|| ("domingo".equals(diaIntro))){
    System.out.print("Hoy es día de descanso.");
    } else{
    String ejercicio1= "n";
    int numero = (int) (Math.random() * 3);
      
      switch (numero) {
     case 0:
      ejercicio1 = "bicicleta";
      break;
     case 1:
      ejercicio1= "elíptica";
      break;
     case 2:
      ejercicio1 = "cinta";
      break;
      }
        
    int numero2 = (int) (Math.random() * 3);
    String ejercicio2 ="n";
      switch (numero2) {
     case 0:
      ejercicio2 = "espalda";
      break;
     case 1:
      ejercicio2= "pecho";
      break;
     case 2:
      ejercicio2 = "piernas";
      break;
      }
    int numero3 = (int) (Math.random() * 3);
    String ejercicio3 ="n";
      switch (numero3) {
     case 0:
      ejercicio3 = "bíceps";
      break;
     case 1:
      ejercicio3= "tríceps";
      break;
     case 2:
      ejercicio3 = "hombros";
      break;
      }
    int numero4 = (int) (Math.random() * 2);
    String ejercicio4 ="n";
    if (numero4 ==0){
      ejercicio4 = "abdominales";
    }
    
    
    if (numero4==1){
      int numero5 =0;
      do {
      numero5 = (int) (Math.random() * 3);
      } while (numero5 == numero );
      
      switch (numero5) {
     case 0:
      ejercicio4 = "bicicleta";
      break;
     case 1:
      ejercicio4= "elíptica";
      break;
     case 2:
      ejercicio4 = "cinta";
      break;
      }
    }
    System.out.println("Su entrenamiento de hoy es el siguiente: " +ejercicio1+" " + ejercicio2 +" "+ ejercicio3 +" y "+ ejercicio4);
  }
  }
}
