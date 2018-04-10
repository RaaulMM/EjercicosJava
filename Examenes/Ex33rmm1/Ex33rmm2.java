/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex33rmm1;

import java.util.Scanner;


/*
Raul Moreno Montiel
26-11-2017
Turno2
*/

/**
 *
 * @author raulmoreno
 */
public class Ex33rmm2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int capicua=0;
    double capicua2=0;
    double numero2=0;
    System.out.println("Introduca 10 numeros enteros");
    for (double i = 0; i < 10; i++) {
    int numero = Integer.parseInt(s.nextLine());
    
    if (numero < 10) {
     capicua= numero + capicua;
     numero2++;
    
    }
    if ((numero >= 10) && (numero < 100)) {
      if ((numero/10) == (numero % 10)) {
      
     capicua= numero + capicua;
     numero2++;
    
      } else {
         
      }
    }
    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
      
      capicua= numero + capicua;
      numero2++;
      
      } else {
         
      }
    }
    if ((numero >= 1000) && (numero < 10000)) {
      int primercifra = (numero / 100);
      int segundacifra = (numero % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
      
      capicua= numero + capicua;
      numero2++;
      
      } else {
         
      }
    }
    if ((numero >= 10000) && (numero < 100000)) {
      int primercifra = (numero / 1000);
      int segundacifra = (numero % 100);
      if (((primercifra % 10) == (segundacifra / 10)) && ((primercifra / 10) == (segundacifra % 10))) {
     
      capicua= numero + capicua;
      numero2++;
      
      } else {
         
      }
    }
  }
    if (capicua ==0){
      System.out.println("Ningun numero introducoido es capicua.");
    } else {
      capicua2 =capicua/numero2;
      System.out.print("La media de los capicúa es ");System.out.printf("%8.2f" , capicua2 );
    }
  }
}
