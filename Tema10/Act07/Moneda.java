/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

/**
 *
 * @author raul
 */
public class Moneda {
  private static String caracruz[] = {"cara", "cruz"};
  private static String moneda[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String caraCruz;
  private String Moneda;

  public Moneda() {
    this.Moneda = caracruz[(int)(Math.random()*2)];
    this.caraCruz = moneda[(int)(Math.random()*8)];
  }

  public String getCaracruz() {
    return this.Moneda;
  }
  
  public String getMoneda() {
    return this.caraCruz;
  }

  public String toString() {
    return this.caraCruz + " - " + this.Moneda;
  }
}