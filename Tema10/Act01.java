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
public class Act01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    ArrayList<String> nomb = new ArrayList<String>();
    
    nomb.add("Raul");
    nomb.add("Carmen");
    nomb.add("German");
    nomb.add("Jesus");
    nomb.add("Viktoriia");
    nomb.add("Anabel");
    
    for (String listado : nomb) {
        System.out.println(listado);
    }
   
  }
  
}
