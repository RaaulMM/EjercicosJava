
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
public class Ex33rmm2 {
  public static void main(String[] args) {
    
    int[] n;
    n = new int[10];
    
    int a, b, c, d,e,f,g,h,i,j;
    a =0;b=0;c=0;d=0;e=0;f=0;g=0;h=0;i=0;j=0;
    for (int p = 0; p <= 9; p++) {
      int dado = (int) (Math.random() * 11);
      n[p] = dado;
    }
    
    System.out.println("Array Generado");
    for (int p = 0; p <= 9; p++) {
     System.out.print(n[p]+ " ");
    }
    
    System.out.println(" ");
    for (int p = 0; p <= 9; p++) {
      if(n[p] == 1){
        a++;
      }
      if(n[p] == 2){
        b++;
      }
      if(n[p] == 3){
        c++;
      }
      if(n[p] == 4){
        d++;
      }
      if(n[p] == 5){
        e++;
      }
      if(n[p] == 6){
        f++;
      }
      if(n[p] == 7){
        g++;
      }
      if(n[p] == 8){
        h++;
      }
      if(n[p] == 9){
        i++;
      }
      if(n[p] == 10){
        j++;
      }
    }System.out.println(" ");
    if (a==0){ System.out.println("El 1 no aparece");
    }else  System.out.println("El 1 aparece " +a+" veces");
   
    if (b==0){ System.out.println("El 2 no aparece");
    }else  System.out.println("El 2 aparece " +b+" veces");
    
    if (c==0){ System.out.println("El 3 no aparece");
    }else  System.out.println("El 3 aparece " +c+" veces");
    
    if (d==0){ System.out.println("El 4 no aparece");
    }else  System.out.println("El 4 aparece " +d+" veces");
    
    if (e==0){ System.out.println("El 5 no aparece");
    }else  System.out.println("El 5 aparece " +e+" veces");
    
    if (f==0){ System.out.println("El 6 no aparece");
    }else  System.out.println("El 6 aparece " +f+" veces");
    
    if (g==0){ System.out.println("El 7 no aparece");
    }else  System.out.println("El 7 aparece " +g+" veces");
    
    if (h==0){ System.out.println("El 8 no aparece");
    }else  System.out.println("El 8 aparece " +h+" veces");
    
    if (i==0){ System.out.println("El 9 no aparece");
    }else  System.out.println("El 9 aparece " +i+" veces");
    
    if (j==0){ System.out.println("El 10 no aparece");
    }else  System.out.println("El 10 aparece " +j+" veces");
    
  }
}
