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
    private String[] username;
    private int n=0;
private int contador=1;
private String nombre;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public Usuario(){
       username = new String[5];
        int a;
        int restador=5;
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
            System.out.println("Ingrese Nombre #"+ contador+n);
            Scanner sc= new Scanner(System.in);
            nombre= sc.next();
            username[n]= nombre;
            System.out.println();
            System.out.println(username[n]+" "+contador);
            n++;
            contador++;
           /* if (comprobarUsuario(nombre)) {
            user= new int[n];
            n++;
            contador++;
            }else{
                System.out.println("error");
                ingresarUsuarios();
            }*/
        }while(n!=5);
          setN(0);
    }
    public boolean comprobarUsuario(String nombre){
           System.out.println("comprobando");
          
           return true;
    }
    public void mostrarAsc(){
        if(username[n]==null){
            for (int i = 0; i < 5; i++) {
                username[i]="Vacio";
                System.out.println(username[i]);
            }       
        }
        else{
      for (int i = 0; i < 5; i++) {
            System.out.println(username[i]);
            
        }}
    }
    public void mostrarDesc(){
        for (int i = 4; i >=0; i--) {
            System.out.println(username[i]);
        }
    }
    
}
