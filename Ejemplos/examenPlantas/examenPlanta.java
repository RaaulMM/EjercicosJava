/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPlantas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class examenPlanta {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Por favor, introduzca Planta: ");
    String planta = s.nextLine();

    HashMap<String, String> m = new HashMap<String, String>();
    m.put("ortiga", "Urtica dioica");
    m.put("romero", "Rosmarinus officinalis");
    m.put("aloe vera", "Aloe barbadensis miller");
    m.put("ayahuasca", "Banisteriopsis caapi");
    HashMap<String, String> n = new HashMap<String, String>();
    n.put("ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
    n.put("romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperacion de las enfermendades respiratoria y aparato digestivo.");
    n.put("aloe vera", "Regenera las celulas de la piel e incluso las de tejidoos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
    n.put("ayahuasca", "Se usa en el tratamiento de la depresion y la ansiedad asi como en los problemas de personalidad y esquizofrenia.");

    if (m.containsKey(planta) && n.containsKey(planta)) {
      String nomCie = m.get(planta);
      String propi = n.get(planta);

      System.out.println("Nombre cientifico: " + nomCie);
      System.out.println("Propiedades: " + propi);

    } else {
      System.out.println("La planta no existe");
    }

  }
}
