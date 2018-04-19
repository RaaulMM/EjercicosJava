/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Act05 {

  public static void main(String[] args) {

    ArrayList<Disco> album = new ArrayList<Disco>();

    int i;
    String codInt; // Codigo Introducido
    String autInt; // Autor introducido
    String titInt; // Titulo Introducido
    String genInt; // Genero Introsucido
    String durInt; // Duracion Introducido
    int opcInt;    // Opcion 1
    int opcList;   // Opcion Listado
    int duraInt;   // Duracion Introducida
    int limitSup;  // Limite introducido maximo
    int limitInf;  // Limite Introducido minimo
    
    Scanner s = new Scanner(System.in);

    // -----------------------------DISCOS INICIALES------------------------------------ 
    album.add(new Disco("POK12D", "Dakota", "De la carcel se sale", "Hard Spain", 60));
    album.add(new Disco("KLMO34", "Cifuente", "Master Oculto", "Hard Spain", 42));
    album.add(new Disco("MNLP78", "Rajoy", "Cuanto peor mejor para todos", "Hard Spain", 54));
    album.add(new Disco("MIPI01", "Anita Botella", "Relaxing cup of café con leche", "Hard Spain", 20));

    // --------------------------------PRIMER MENÚ-------------------------
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Lista de discos");
      System.out.println("2. Disco nuevo");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción valida del 1 al 5: ");
      opcInt = Integer.parseInt(s.nextLine());

      switch (opcInt) {

        // -----------------------------SEGUNDO MENÚ-----------------------
        case 1:
          do {
            System.out.println("\nLISTADO\n=======");
            System.out.println("1. Todos");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. Por intervalo de minutos ");
            System.out.println("5. Volver al Menú principal");
            System.out.print("Introduzca una opción valida del 1 al 5: ");
            opcList = Integer.parseInt(s.nextLine());

            switch (opcList) {

              case 1: //-------LISTA COMPLETA--------------

                for (Disco d : album) {
                  System.out.println(d);
                }
                break;

              case 2: //-------LISTA POR AUTOR-------------

                System.out.print("Introduzca el autor: ");
                autInt = s.nextLine();

                for (Disco d : album) {
                  if (d.getAutor().equals(autInt)) {
                    System.out.println(d);
                  }
                }
                break;

              case 3: //---------LISTADO POR GÉNERO----------

                System.out.print("Introduzca el género: ");
                genInt = s.nextLine();

                for (Disco d : album) {
                  if (d.getGenero().equals(genInt)) {
                    System.out.println(d);
                  }
                }
                break;

              case 4: //----LISTADO EN UN INTERVALO TIEMPO-------------

                System.out.println("Establezca el intervalo para la duración");
                System.out.print("Introduzca el límite inferior de duración en minutos: ");
                limitInf = Integer.parseInt(s.nextLine());
                System.out.print("Introduzca el límite superior de duración en minutos: ");
                limitSup = Integer.parseInt(s.nextLine());

                for (Disco d : album) {
                  if ((d.getDuracion() <= limitSup) && (d.getDuracion() >= limitInf)) {
                    System.out.println(d);
                  }
                }
            } 

          } while (opcList != 5); //EL LA OPCION DE LA LISTA EN EL NUMERO 5, "SALIR" LA SECION SE TERMINA

          break;

        //-------------------------NUEVO DISCO-------------------------------
        case 2:
          System.out.println("\nNUEVO DISCO\n===========");

          System.out.println("Por favor, introduzca los datos del disco.");
          System.out.print("Código: ");
          codInt = s.nextLine();

          while (album.contains(new Disco(codInt, "", "", "", 0))) {
            System.out.println("Ese código ya existe en la base de datos.");
            System.out.print("Introduzca otro código: ");
            codInt = s.nextLine();
          }

          System.out.print("Autor: ");
          autInt = s.nextLine();
          System.out.print("Título: ");
          titInt = s.nextLine();
          System.out.print("Género: ");
          genInt = s.nextLine();
          System.out.print("Duración: ");
          duraInt = Integer.parseInt(s.nextLine());

          album.add(new Disco(codInt, autInt, titInt, genInt, duraInt));

          break;

        // MODIFICAR ////////////////////////////////////////////////////////////////      
        case 3:
          System.out.println("\nMODIFICAR\n===========");

          System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
          codInt = s.nextLine();

          while (!album.contains(new Disco(codInt, "", "", "", 0))) {
            System.out.print("Ese código no existe.\nIntroduzca otro código: ");
            codInt = s.nextLine();
          }
          i = album.indexOf(new Disco(codInt, "", "", "", 0));

          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + album.get(i).getCodigo());
          System.out.print("Nuevo código: ");
          codInt = s.nextLine();
          if (!codInt.equals("")) {
            album.get(i).setCodigo(codInt);
          }

          System.out.println("Autor: " + album.get(i).getAutor());
          System.out.print("Nuevo autor: ");
          autInt = s.nextLine();
          if (!autInt.equals("")) {
            album.get(i).setAutor(autInt);
          }

          System.out.println("Título: " + album.get(i).getTitulo());
          System.out.print("Nuevo título: ");
          titInt = s.nextLine();
          if (!titInt.equals("")) {
            album.get(i).setTitulo(titInt);
          }

          System.out.println("Género: " + album.get(i).getGenero());
          System.out.print("Nuevo género: ");
          genInt = s.nextLine();
          if (!genInt.equals("")) {
            album.get(i).setGenero(genInt);
          }

          System.out.println("Duración: " + album.get(i).getDuracion());
          System.out.print("Duración: ");
          durInt = s.nextLine();
          if (!durInt.equals("")) {
            album.get(i).setDuracion(Integer.parseInt(durInt));
          }

          break;

        // BORRAR ///////////////////////////////////////////////////////////////////      
        case 4:
          System.out.println("\nBORRAR\n======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codInt = s.nextLine();

          if (!album.contains(new Disco(codInt, "", "", "", 0))) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            album.remove(album.indexOf(new Disco(codInt, "", "", "", 0)));
            System.out.println("Album borrado.");
          }
      } // switch    
    } while (opcInt != 5);
  }
}
