/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Act06 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int cont = 3;
    String nombre;

    HashMap<Integer, String> m = new HashMap<Integer, String>();
    m.put(924, "Pepe");
    m.put(921, "Luis");
    m.put(700, "César");
    m.put(219, "Víctor");
    m.put(537, "Alan");
    m.put(605, "Esteban");

    while (cont > 0) {
      System.out.print("Por favor, introduzca Usuario: ");
      String usuarioIntroducido = s.nextLine();

      System.out.print("Por favor, introduzca contraseña: ");
      int codigoIntroducido = Integer.parseInt(s.nextLine());

      if (m.containsKey(codigoIntroducido)) {
        nombre = m.get(codigoIntroducido);
        if (nombre.equals(usuarioIntroducido)) {
          System.out.println("Ha accedido al área restringida");
          cont = 0;
        } else {
          cont--;
          System.out.println("Nombre o contraseña incorrecta");
          System.out.println("Te quedan: " + cont + " intentos");
        }
      } else {
        cont--;
        System.out.println("Nombre o contraseña incorrecta");
        System.out.println("Te quedan: " + cont + " intentos");
        if (cont == 0) {
          System.out.println("Lo siento, no tiene acceso al área restringida");
        }

      }
    }

  }
}
