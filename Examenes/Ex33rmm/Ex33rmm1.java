
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



/**
 *
 * @author raulmoreno
 */
public class Ex33rmm1 {
  public static void main(String[] args) {
    
    
    int[] n;
    n = new int[20];
    
    int[] aux;
    aux = new int[20];
    
    int[] aux2;
    aux2 = new int[20];
    
    int[] aux3;
    aux3 = new int[20];
    
    for (int p = 0; p <= 19; p++) {
      int dado = (int) (Math.random() * 101);
      n[p] = dado;
      
    }
    System.out.println("Array Generado");
    for (int p = 0; p <= 19; p++) {
     System.out.print(n[p]+ " ");
     
    }System.out.println(" ");
    int cont =0;
    int pasos=0;
    int comprobar =2;
    for (int p = 0; p <= 19; p++) {
      for (int o = 1; o <= 100; o++) { 
        if (comprobar*o == n[p]){
        aux[cont]=n[p];
        cont++;
      }
      }
    }
    int comprobar2 =3;
    int cont2 =0;
    for (int p = 0; p <= 19; p++) {
      for (int o = 1; o <= 100; o++) {
        if (comprobar2*o == n[p]){
        aux2[cont2]=n[p];
        cont2++;
      }
      }
    }
    int comprobar3 =5;
    int cont3 =0;
    for (int p = 0; p <= 19; p++) {
      for (int o = 1; o <= 100; o++) {
        if (comprobar3*o == n[p]){
        aux3[cont3]=n[p];
        cont3++;
      }
      }
    }
    System.out.println(" ");
    System.out.print("Múltiplos de 2: ");
    for (int p = 0; p <= 19; p++) {
      if (aux[p]==0){break;
      }else System.out.print(aux[p]+" ");      
    }System.out.println(" ");
    
    System.out.print("Múltiplos de 3: ");
    for (int p = 0; p <= 19; p++) {
     if (aux2[p]==0){break;
     }else System.out.print(aux2[p]+ " ");
    }System.out.println(" ");
    
    
    System.out.print("Múltiplos de 5: ");
    for (int p = 0; p <= 19; p++) {
      if (aux3[p]==0){break;
      }else System.out.print(aux3[p]+ " ");
    }System.out.println(" ");
  }
}
