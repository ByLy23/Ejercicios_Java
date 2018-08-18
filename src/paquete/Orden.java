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
public class Orden {
    public Orden(){
        int lector=0;
        do{
        System.out.println("--Numeros de mayor a menor--");
        System.out.println("1.Ingresar numeros\n2.Mostrar numeros\n3.Menu principal");
        try{
        Scanner sc= new Scanner(System.in);
        lector= sc.nextInt();
        }
        catch(InputMismatchException exc){
            System.out.println("Numeros, no letras");
        }
            switch (lector) {
                case 1:
                    ingresaNumero();
                    break;
                case 2:
                    mostrarNumero();
                    break;
                case 3:
                    Main menu= new Main();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }while(lector!=3);
    }
    int n1;
        int n2;
        int n3;
    public void ingresaNumero(){
        int sumador=1;
        int numero=0;
        int[] digito= new int[3];
        
        do{
        System.out.println("Ingrese numero #"+sumador);
        try{
        Scanner sc= new Scanner(System.in);
        numero= sc.nextInt();
        }catch(InputMismatchException exce){
            System.out.println("Numeros, no letras");
        }
        digito[sumador-1]= numero;
            System.out.println("registrado");
            System.out.println(sumador);
            sumador++;
            n1= digito[0];
            n2=digito[1];
            n3=digito[2];
        }while(sumador!=4);
    }
    public void mostrarNumero(){
        if (n1>=n2 && n2>=n3) {
            System.out.println(n1+" "+n2+" "+n3);
        }
      else  if (n1>=n3 && n3>=n2) {
            System.out.println(n1+" "+n3+" "+n2);
        }
     else   if (n2>=n3 && n3>=n1) {
            System.out.println(n2+" "+n3+" "+n1);
        }
      else  if (n2>=n1 && n1>=n3) {
            System.out.println(n2+" "+n1+" "+n3);
        }
     else   if (n3>=n2 && n2>=n1) {
            System.out.println(n3+" "+n2+" "+n1);
        }
     else   if (n3>=n1 && n1>=n2) {
            System.out.println(n3+" "+n1+" "+n2);
        }
    }
}
