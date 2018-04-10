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
public class Ex33rmm3 {
  public static void main(String[] args) {
    
    String pos1= "*";
    String pos2= "*";
    String pos3= "*";
    String pos4= "*";
    String pos5= "*";
    
    int num1=0;
    int num2=0;
    int num3=0;
    
    int ord1 = 0;
    int ord2 = 0;
    int ord3 = 0;
    
    num1 = (int) (Math.random() *5+1);
   
    
    do {
      num2 = (int) (Math.random() * 5+1);
      } while (num1 == num2 );
    do {
      num3 = (int) (Math.random() * 5+1);
      } while ((num2 == num3 ) || (num1 == num3));
    
    if ((num1 < num2)&&(num1<num3)){
      ord1 = num1;
    }
    if ((num2 < num1)&&(num2<num3)){
      ord1 = num2;
    }
    if ((num3 < num1)&&(num3<num2)){
      ord1 = num3;
    }
    /*--------------------*/
    if ((num1 > num3)&&(num1 < num2)){
      ord2 = num1;
    }
    if ((num2 > num3)&&(num2 < num1)){
      ord2 = num2;
    }
    if ((num3 > num2)&&(num3 < num1)){
      ord2 = num3;
    }
    /*-----------------------*/
    if ((num1 > num2)&&(num1 > num3)){
      ord3 = num1;
    }
    if ((num2 > num1)&&(num2 > num3)){
      ord3 = num2;
    }
    if ((num3 > num1)&&(num3 > num2)){
      ord3 = num3;
    }
    /*-------------------------------*/
    
    int num = (int) (Math.random() *1);
    switch (num) {
     case 0:
      String po1 = "V";
      break;
     case 1:
      String po2= "S";
      break;
      }
    
     
    
    System.out.println("*******");
    System.out.println("*     *");
    System.out.println("*"+pos1+pos2+pos3+pos4+pos5+"*");
    
    System.out.println(num1+"|"+ num2+"|"+ num3);
    System.out.println(ord1+"|"+ ord2+"|"+ ord3);
  }
}
