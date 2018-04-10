/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examenes;

import java.util.Scanner;

/**
 *
 * @author raulmoreno
 */
public class ExamenPrueba {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca la altura de la bandera en cm: ");
    int alto = Integer.parseInt(s.nextLine());
    System.out.println("Ahora introduzca la anchura en cm: ");
    int ancho = Integer.parseInt(s.nextLine());
    System.out.println("¿Quiere escudo bordado?");
    String escudo = s.next();
    
    double precScudo = 0;
    double iva = 1.21;
    double precBand = 0.01;
    double total ;
    double envio = 3.5;
    if ("si".equals(escudo)){
      precScudo = 2.50;
    } else 
    {precScudo = 0;
      
    }
    
    double metCua = (alto * ancho);
    double totalband = metCua * precBand;
    double totalSinIva = totalband + precScudo + envio;
    total = totalSinIva * iva;
    
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.print("Bandera de "+ metCua+ " cm2:     ");
    System.out.printf("%8.2f %-1s\n", totalband, " €");
    if ("si".equals(escudo)){
      System.out.print("Con escudo:               ");
      System.out.printf("%8.2f %-1s\n", precScudo," €");
    } else 
    { System.out.print("Sin escudo:               ");
      System.out.printf("%8.2f %-1s\n", precScudo," €"); 
    }
    System.out.print("Gastos de envio:          ");
    System.out.printf("%8.2f %-1s\n", envio," €");
    System.out.print("Total:                    " );
    System.out.printf("%8.2f %-1s\n", total , " €");
    }
}
