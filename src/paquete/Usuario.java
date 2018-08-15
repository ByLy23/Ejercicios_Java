/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.util.Scanner;

/**
 *
 * @author byron
 */
public class Usuario {
    private int user[];
    private int n=1;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public Usuario(){
     //  user= new int[n];
        int a;
        do{
        System.out.println("--Usuarios--");
        System.out.println("1.Ingresar usuarios\n2.Mostrar usuarios ascendente\n3.Mostrar usuarios descendente\n4.Menu principal");
        Scanner st= new Scanner(System.in);
        a= st.nextInt();
        switch(a){
            case 1:
               ingresarUsuarios();
                break;
            case 2:
                mostrarAsc();
                break;
            case 3: 
                mostrarDesc();
                break;
            case 4:
                  Main menu= new Main();
                break;
            default:
                System.out.println("Error");
                break;
        }
        }while(a!=4);
      
    }
    public void ingresarUsuarios(){
        do{
            comprobarUsuario();
            System.out.println("hola "+ n);
            n++;
        }while(n!=6);
          setN(0);
    }
    public void comprobarUsuario(){
           System.out.println("comprobando");
    }
    public void mostrarAsc(){
        
    }
    public void mostrarDesc(){
        
    }
    
}
