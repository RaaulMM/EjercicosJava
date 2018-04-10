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

public class ejercicio3 {
    public static void main(String[] args) {
    double eurPeseta = 166.38;
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce pesetas: ");
    int pesetas = Integer.parseInt(s.nextLine());


    System.out.println("Tengo " + pesetas + " pesetas");
    System.out.println("Para pasar de pesetas a euros se divide "  + pesetas +"/"  + eurPeseta);
    System.out.println(+ pesetas + " pesetas equivale a "+ pesetas / eurPeseta +" euros");

  }
}
