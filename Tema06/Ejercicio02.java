/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema6;

/**
 *
 * @author raulmoreno
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    int palo = (int) (Math.random() * 4) + 1;
    int numero = (int) (Math.random() * 10) + 1;

 /* 🂡🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂬🂭🂮
    🂱🂲🂳🂴🂵🂶🂷🂸🂹🂺🂻🂼🂽🂾
    🃁🃂🃃🃄🃅🃆🃇🃈🃉🃊🃋🃌🃍🃎
    🃑🃒🃓🃔🃕🃖🃗🃘🃙🃚🃛🃜🃝🃞*/
    
    switch (palo) {
      case 1:
        
        if ((numero >1 )&&(numero <=10)){
          switch (numero) {
            case 2:
              System.out.println("2 de" +" Picas 🂢" );
            break;
            case 3:
              System.out.println("3 de" +" Picas 🂣" );
            break;
            case 4:
              System.out.println("4 de" +" Picas 🂤" );
            break;
            case 5:
              System.out.println("5 de" +" Picas 🂥" );
            break;
            case 6:
              System.out.println("6 de" +" Picas 🂦" );
            break;
            case 7:
              System.out.println("7 de" +" Picas 🂧" );
            break;
            case 8:
              System.out.println("8 de" +" Picas 🂨" );
            break;
            case 9:
              System.out.println("9 de" +" Picas 🂩" );
            break;
            case 10:
              System.out.println("10 de" +" Picas 🂪" );
            break;
          }
        
        }
        if (numero ==1){
        System.out.println("As de" +" Picas 🂡" );  
        }
        if (numero ==11){
        System.out.println("J de" +" Picas 🂫");  
        }
        if (numero ==12){
        System.out.println("Q de" +" Picas 🂭");  
        }
        if (numero ==13){
        System.out.println("K de" +" Picas 🂮");  
        }
        
        break;
      case 2:
        
        if ((numero >1 )&&(numero <=10)){
          switch (numero) {
            case 2:
              System.out.println("2 de" +" Corazones 🂲" );
            break;
            case 3:
              System.out.println("3 de" +" Corazones 🂳" );
            break;
            case 4:
              System.out.println("4 de" +" Corazones 🂴" );
            break;
            case 5:
              System.out.println("5 de" +" Corazones 🂵" );
            break;
            case 6:
              System.out.println("6 de" +" Corazones 🂶" );
            break;
            case 7:
              System.out.println("7 de" +" Corazones 🂷" );
            break;
            case 8:
              System.out.println("8 de" +" Corazones 🂸" );
            break;
            case 9:
              System.out.println("9 de" +" Corazones 🂹" );
            break;
            case 10:
              System.out.println("10 de" +" Corazones 🂺" );
            break;
          }
        }
        if (numero ==1){
        System.out.println("As de" +" Corazones 🂱");  
        }
        if (numero ==11){
        System.out.println("J de" +" Corazones 🂻");  
        }
        if (numero ==12){
        System.out.println("Q de" +" Corazones 🂽");  
        }
        if (numero ==13){
        System.out.println("K de" +" Corazones 🂾");  
        }
        break;
      case 3:
        if ((numero >1 )&&(numero <=10)){
        switch (numero) {
            case 2:
              System.out.println("2 de" +" Diamantes 🃂" );
            break;
            case 3:
              System.out.println("3 de" +" Diamantes 🃃" );
            break;
            case 4:
              System.out.println("4 de" +" Diamantes 🃄" );
            break;
            case 5:
              System.out.println("5 de" +" Diamantes 🃅" );
            break;
            case 6:
              System.out.println("6 de" +" Diamantes 🃆" );
            break;
            case 7:
              System.out.println("7 de" +" Diamantes 🃇" );
            break;
            case 8:
              System.out.println("8 de" +" Diamantes 🃈" );
            break;
            case 9:
              System.out.println("9 de" +" Diamantes 🃉" );
            break;
            case 10:
              System.out.println("10 de" +" Diamantes 🃊" );
            break;
          }
        }
        if (numero ==1){
        System.out.println("As de" +" Diamantes 🃁");  
        }
        if (numero ==11){
        System.out.println("J de" +" Diamantes 🃋");  
        }
        if (numero ==12){
        System.out.println("Q de" +" Diamantes 🃍");  
        }
        if (numero ==13){
        System.out.println("K de" +" Diamantes 🃎");  
        }

        break;
      case 4:
        
        if ((numero >1 )&&(numero <=10)){
        switch (numero) {
            case 2:
              System.out.println("2 de" +" Tréboles 🃒" );
            break;
            case 3:
              System.out.println("3 de" +" Tréboles 🃓" );
            break;
            case 4:
              System.out.println("4 de" +" Tréboles 🃔" );
            break;
            case 5:
              System.out.println("5 de" +" Tréboles 🃕" );
            break;
            case 6:
              System.out.println("6 de" +" Tréboles 🃖" );
            break;
            case 7:
              System.out.println("7 de" +" Tréboles 🃗" );
            break;
            case 8:
              System.out.println("8 de" +" Tréboles 🃘" );
            break;
            case 9:
              System.out.println("9 de" +" Tréboles 🃙" );
            break;
            case 10:
              System.out.println("10 de" +" Tréboles 🃚" );
            break;
          }
        }
        if (numero ==1){
        System.out.println("As de" +" Tréboles 🃑");  
        }
        if (numero ==11){
        System.out.println("J de" +" Tréboles 🃛");  
        }
        if (numero ==12){
        System.out.println("Q de" +" Tréboles 🃝");  
        }
        if (numero ==13){
        System.out.println("K de" +" Tréboles 🃞");  
        }
        break;
    }

    }

  }
