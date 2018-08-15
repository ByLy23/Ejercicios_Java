/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Main {
    public static void main(String[] args){
       int lector=0;
       do{
       System.out.println("--[IPC1]Tarea3_201700733--");
       System.out.println("1.Usuarios\n2.Contar digitos repetidos\n3.Numeros de mayor a menor\n4.Calcular promedio\n5.Salir");
     try{
       Scanner sc= new Scanner(System.in);
       lector= sc.nextInt();
     }catch(InputMismatchException exce){
         System.out.println("no letras");
     }
       switch(lector){
           case 1:
               Usuario user= new Usuario();
               break;
           case 2:
             
               break;
               case 3:  
                  
               break;
           case 4:
           
               break;
               case 5:
                   System.out.println("gracias por visitarnos espero vuelvas pronto :v");
                   break;
               default:
                    System.out.println("No es Correcto");
                   break;
       }
       }while(lector!=5);
   }
}
