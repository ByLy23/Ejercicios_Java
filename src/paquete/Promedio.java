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
public class Promedio {
    private int matriz[][]= new int[6][6];
    private int fila=0;
    private int columna=0;
    private int lector=0;
    private int carnet;//este sera el id
 public Promedio(){
     do{
     System.out.println("--Promedio de 6 estudiantes");
     System.out.println("1.Ingresar notas\n2.Mostrar tabla\n3.Menu principal");
     try{
         Scanner sc= new Scanner(System.in);
         lector= sc.nextInt();
     }catch(InputMismatchException e){
         System.out.println("Numeros, no letras");
     }
     switch(lector){
         case 1:
            ingresaNota();
             break;
         case 2:
             mostrarNota();
             break;
         case 3:
             Main me= new Main();
             break;
         default: 
             System.out.println("error");
             break;
        }
     }while(lector!=3);
 }   
 public void ingresaNota(){
     for (int i = 0; i < 6; i++) {
         for (int j = 0; j < 6; j++) {
             matriz[i][j]=0;
         }
     }
     int f=0; 
     int c=1;
     int sumador=1;
     int nota=0;
     int prom= 0;
     int n1=0;
     do{
     System.out.println("Ingrese Carnet estudiante #"+sumador);
    try{
     Scanner sc= new Scanner(System.in);
     carnet= sc.nextInt();
    }
    catch(InputMismatchException e){
        System.out.println("No letras, solo numeros");
        
    }
    if(comprobarCarnet(carnet)){
            System.out.println("registado");
            matriz[f][c-1]=carnet;
            do{
                System.out.println("Ingrese nota #"+c);
                try{
                Scanner sc= new Scanner(System.in);
                nota= sc.nextInt();
                }catch(InputMismatchException e){
                       System.out.println("No letras,solo numeros");
                }
                matriz[f][c]=nota;
               n1=n1+nota;
               /* if (c==4) {
                    int n1=0;
                    int n2=0;
                    int n3=0;
                    int n4=0;
                    matriz[f][1]=n1;
                    matriz[f][2]=n2;
                    matriz[f][3]=n3;
                    matriz[f][4]=n4;
                    prom= (n1+n2+n3+n4)/100;
                    matriz[f][c]=prom;
                }*/
                 c++;
            }while(c!=5);
            prom=n1/4;
            matriz[f][5]=prom;
            n1=0;
            c=1;
            f++;
            sumador++;
        }
        else{
            System.out.println("carne repetida :V");
        }
 }while(f!=6);
}
 public boolean comprobarCarnet(int carne){
     for (int i = 0; i < 5; i++) {
              if (carne==matriz[i][0]) {
               return false;   
              }
              else
                  return true;
        }
           return true;
    }
 public void mostrarNota(){
     String[] nombre= new String[6];
     nombre[0]="Carnet";
     nombre[1]="nota 1";
     nombre[2]="nota 2";
     nombre[3]="nota 3";
     nombre[4]="nota 4";
     nombre[5]="promedio";
    /* for (int i = 0; i < 6; i++) {
         System.out.print(nombre[i]);
        
     }*/
     System.out.println("");
     for (int i = 0; i < 6; i++) {
         System.out.print("");
         for (int j = 0; j < 6; j++) {
             System.out.print("  ");
             System.out.print(matriz[i][j]);
         }
         System.out.println("");
     }
 }
 }
