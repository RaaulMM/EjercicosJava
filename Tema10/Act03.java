/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Act03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<>();
    
    System.out.println("Introduce 10 numeros por teclado separados por espacio");
    
    for (int i = 0; i < 10; i ++){
      int n = s.nextInt();
      num.add(n);
    }
    System.out.println("Lista original: " + num);
    Collections.sort(num);
    System.out.println("Lista ordenada: " + num);
  }
  
}
