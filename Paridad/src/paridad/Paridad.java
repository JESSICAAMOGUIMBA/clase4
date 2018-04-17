/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paridad;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */


public class Paridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  int x = 2+3;
        int y = 3-5;
        double z= x/ (double)y;
        
        System.out.println(z);
         System.out.println(y);
      boolean esReciclable =true;
      
      if (esReciclable){
      double w = 13.5;
          System.out.println("Es reciclable" + esReciclable);
           System.out.println("Pasa: " + w);
      }*/
       Scanner scan = new Scanner(System.in);
       
       String nombre =  scan.nextLine();
       System.out.println("Ingrese su edad: ");
       int edad = scan.nextInt();
       
       System.out.println("Ingrese su sueldo: ");
       double sueldo = scan.nextDouble();
       
       System.out.println("");
       System.out.println("Los datos ingresados son: ");
       System.out.println(" Nombre"+ nombre);
       System.out.println(" Edad"+ edad);
       System.out.println(" ASueldo"+ sueldo);
       System.out.println();
       System.out.println("Su nombre es: "+ nombre +
               ", usted tiene" + edad+ " y su sueldo es "+ sueldo);
       
    }
    
}
