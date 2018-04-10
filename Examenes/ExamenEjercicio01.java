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
public class ExamenEjercicio01 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Seleccione el tamaño 1.Pequeña 2.Mediana 3.Familiar: ");
    int tamaño = Integer.parseInt(s.nextLine());
    System.out.print("Cuantos ingredientes quires: ");
    int ingre = Integer.parseInt(s.nextLine());
    System.out.print("¿Quiere extra de queso? (s/n): ");
    String extra = (s.next());
    
    double descuento=0;
    double base = 0;
    double precioIngre= 2;
    double ingredientes =0;
    double queso=0;
    int extraQueso=3;
    double total =0;
    
    switch (tamaño) {
     case 1:
      base = 8;
      break;
     case 2:
      base = 11;
      break;
     case 3:
      base = 14;
      break; 
    }
   if (ingre > 3){
     ingredientes = ingre * precioIngre;
   }
   if ("n".equals(extra)){
     queso = 0;
   }
   if ("s".equals(extra)){
     queso = 3;
   }
   total = base+ingredientes+queso;
   if (total >25){
     descuento = (total *0.10);
     total = total - descuento;
   }
   
   System.out.println(" ");
   System.out.println("Gracias. Aquí tiene su ticket. ");
   System.out.println("Pizza Hat "); 
   System.out.print("Precio base:         "); System.out.printf("%8.2f" , base );System.out.println("€");
   System.out.print("Ingredientes (" +ingre +")     " ); System.out.printf("%8.2f" , ingredientes );System.out.println("€");
   if ("s".equals(extra)){
   System.out.print("Con extra de queso:  "); System.out.printf("%8.2f" , queso );System.out.println("€");
   }
   if (total >25){
    descuento=0 - descuento;
    System.out.print("Descuento           "); System.out.printf(" %8.2f",descuento );System.out.println("€");
   }
   System.out.print("Precio final:        "); System.out.printf("%8.2f" , total ); System.out.println("€");
   }
}
