/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, num3, num4, auxiliar,numMenor,numMayor;
        
        System.out.println("Introduce dos numero enteros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();
        num4 = teclado.nextInt();
        
        
        if (num1 > num2) {
            numMayor = num1;
            
            
        } if (num3 > num4) {
            numMayor = num3;
            
        } if (num1 > num3) {
            numMayor = num1;
            
        } if (num1 < num2) {
            numMenor = num1;
        } if (num3 < num4) {
            numMenor = num3;
        }
        
       // System.out.println(numMayor + " es mayor que " + numMenor);
}
}