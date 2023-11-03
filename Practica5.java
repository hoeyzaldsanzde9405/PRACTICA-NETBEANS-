//Jose Maria Sachez Aldama
// Calcular el factorial de que le usuario ingrese y muestre el resultado en pantalla 
package com.mycompany.practica5;
import java.util.Scanner ; 


public class Practica5 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in); 
        System.out.println("ingrese numero para calcular factorial:");
        int numero=Scanner.nextInt();
        int factorial=1;
        while (numero !=0)
        {              
        factorial*=numero;
        numero-- ;
        }   
        
        System.out.println("el factorial es:" +factorial);
    }
}
