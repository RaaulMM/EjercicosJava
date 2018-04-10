/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.math;

/**
 *
 * @author raulmoreno
 */
public class Opera {
      public static int digitos(long x) {
    int cifras = 1;
    while (x > 10) {
      x /= 10;
      cifras++;
    }
    return cifras;
  }
}

