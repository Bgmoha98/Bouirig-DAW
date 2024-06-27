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
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        double radio, perimetro;
        System.out.println("Introduce el radio que dese: ");
         radio = teclado.nextDouble();
        
         perimetro = Math.PI*Math.pow(radio, 2);
         
         System.out.println("El preimetro es el siguiente: " + perimetro);
    }
    
}
