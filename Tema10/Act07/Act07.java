/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Act07 {

  public static void main(String[] args) {

    ArrayList<Moneda> m = new ArrayList<Moneda>();

    Moneda tirada = new Moneda();
    m.add(tirada);

    String ultimaPosicion = tirada.getCaracruz();
    String ultimaCantidad = tirada.getMoneda();

    for (int i = 0; i < 5; i++) {
      do {
        tirada = new Moneda();
      } while (!((tirada.getCaracruz()).equals(ultimaPosicion)) && !((tirada.getMoneda()).equals(ultimaCantidad)));

      m.add(tirada);
      ultimaPosicion = tirada.getCaracruz();
      ultimaCantidad = tirada.getMoneda();
    }

    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
}
