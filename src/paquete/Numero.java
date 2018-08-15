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
    private BigInteger[] numero= new BigInteger[n];
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
                
               ingresaNumero();
                break;
            case 2:
                numeroBuscar();
                break;
            case 3: 
                numDigitos();
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
    public void ingresaNumero(){
        
    }
    public void numeroBuscar(){
        
    }
    public void numDigitos(){
        
    }
}
