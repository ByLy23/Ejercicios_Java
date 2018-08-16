/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Numero {
    int contador;
    int n;
    private BigInteger numero;

    public void setNumero(BigInteger numeo) {
        this.numero = numeo;
    }
    public Numero(){
    do{
        System.out.println("--Contador de digitos--");
        System.out.println("1.Ingresar numero\n2.Ingresar numero a buscar\n3.Mostrar numero de digitos\n4.Menu principal");
        try{
        Scanner st= new Scanner(System.in);
        contador= st.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error, numeros no letras");
        }
        switch(contador){
            case 1:
                
               ingresaNumero(numero);
                break;
            case 2:
                numeroBuscar(numero);
                break;
            case 3: 
                numDigitos(numero);
                break;
            case 4:
                  Main menu= new Main();
                break;
            default:
                System.out.println("Error");
                break;
        }
        }while(contador!=4);
    }
    public void ingresaNumero(BigInteger nume){
        
        System.out.println("Ingrese numero");
          try{
        Scanner st= new Scanner(System.in);
        nume= st.nextBigInteger();
          }
        catch(InputMismatchException exception){
                   System.out.println("error");
                }
          setNumero(nume);
          System.out.println(nume);
    }
       
    public void numeroBuscar(BigInteger mat){
        
    }
    public void numDigitos(BigInteger nu){     
        String cantidad= String.valueOf(nu);
        System.out.println("Contiene "+cantidad.length()+ " Digitos");
    }
}
