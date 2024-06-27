/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a04_teoriarandom;

import java.util.Random;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generador = new Random();

        int num, menor = 50, mayor = 1;
        
        
        for (int i = 0; i < 50; i++) {
            System.out.println(num = generador.nextInt(14 - 5 + 1) + 5);
            
            if (num < menor) {
                menor = num;
                    
            } else if (num > mayor){
                mayor = num;
                }
        }
        
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        
    }

}
