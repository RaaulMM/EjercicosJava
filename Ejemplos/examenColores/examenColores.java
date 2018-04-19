/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenColores;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class examenColores {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca un color: ");
    String color = s.nextLine();

    HashMap<String, String> m = new HashMap<String, String>();
    m.put("azul", "Blue");
    m.put("negro", "Black");
    m.put("rojo", "red");
    m.put("blanco", "white");
    m.put("verde", "Green");
    m.put("morado", "purple");
    m.put("amarillo", "Yellow");
    m.put("naranja", "Orange");
    m.put("rosa", "Violet");
    
    HashMap<String, String> n = new HashMap<String, String>();
    n.put("azul", "#0000FF");
    n.put("negro", "#000000");
    n.put("rojo", "#FF0000");
    n.put("blanco", "#FFFFFF");
    n.put("verde", "#008000");
    n.put("morado", "#800080");
    n.put("amarillo", "#FFFF00");
    n.put("naranja", "#FFA500");
    n.put("rosa", "#EE82EE");

    if (m.containsKey(color) && n.containsKey(color)) {
      String nomIng = m.get(color);
      String CodRGB = n.get(color);

      System.out.println("El color " + color + " en inglés es " + 
        nomIng + " y su código RGB es " + CodRGB);

    } else {
      System.out.println("Lo siento, ese color no existe");
    }
  }
}
