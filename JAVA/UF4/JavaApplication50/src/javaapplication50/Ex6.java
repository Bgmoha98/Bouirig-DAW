/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num= teclado.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero introducido \" " + num + "\" es divisible entre 2");
        } else {
            System.out.println("El numero introducido \" " + num + "\" no es divisible entre 2");
        }
    }
    
}
