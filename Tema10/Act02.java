/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class Act02 {
  public static void main(String[] args) {
      ArrayList<Integer> num = new ArrayList<>();
      
      int suma =0;
      int cantNumero = (int) (Math.random()*11) +10;
      int media = 0;
      int max = 0;
      int min = 9999999;
      
      for (int i = 0;  i <cantNumero; i++){
        int n = (int)(Math.random ()*101);
        num.add(n);
        suma += n;
        
       // min = (n <min) ? n : min;
        if (n < min){
          min = n;
        }
        if (n > max){
        max = n;
        }
      }
      System.out.println(num);
      System.out.println(suma);
      System.out.println(suma / cantNumero);
      System.out.println(min);
      System.out.println(max);
    
  }
      
  }
      


