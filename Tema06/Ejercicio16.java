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
public class Ejercicio16 {
  public static void main(String[] args) {
    
    String figura =" ";
    String figura1 = " ";
    String figura2= " ";
    String figura3= " ";
    int caso =0;
    
    

    for (int i = 0; i < 3; i++) {
      int aleatorio = (int)(Math.random() * 5);
      switch(aleatorio) {
        case 0:
          figura = "♈";
          break;
        case 1:
          figura = "♉";
          break;
        case 2:
          figura = "♊";
          break;
        case 3:
          figura = "♋";
          break;
        case 4:
          figura = "♌";
          break;
        case 5:
          figura = "♍";
          break;

      }
      if (i ==0) {
        figura1 = figura;
      }
       if (i ==1) {
        figura2 = figura;
      }
        if (i ==2) {
        figura3 = figura;
      }
      System.out.print(figura +" | ");
    }
    System.out.println(" ");
    if ((figura1 == figura2) || (figura1==figura3)||
        (figura2==figura3)){
      System.out.println("Bien, ha recuperado su moneda");
    }else { System.out.println("Lo siento, has perdido");
      
    }
    if ((figura1==figura2)&& (figura3==figura1)){
      System.out.println("Enhorabuena, has ganado 10 monedas");
    }
    
  }
}
