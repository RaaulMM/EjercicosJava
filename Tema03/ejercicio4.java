/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema3;

/**
 *
 * @author raulmoreno
 */
import java.util.Scanner;
public class ejercicio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce numero : ");
    int x = Integer.parseInt(s.nextLine());
    System.out.print("Introduce otro numero: ");
    int y = Integer.parseInt(s.nextLine());
    
    
    System.out.println(" X vale " + x);
    System.out.println(" Y vale " + y);
    System.out.println(" La suma de x e y es " + (x + y));
    System.out.println(" La resta de x e y es " + (x - y));
    System.out.println(" La división de x e y es " + (x / y));
    System.out.println(" La multiplicción de x e y es " + (x * y));
  }
  
}
