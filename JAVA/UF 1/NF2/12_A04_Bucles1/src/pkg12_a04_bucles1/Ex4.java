/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a04_bucles1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean seguir = true;
        System.out.println("Introduce un numero (entero y positivo): ");

        while (!teclado.hasNextInt()) {
            teclado.next();
            System.out.println("*ERROR* Introduce un numero entero");
        }
        
        num = teclado.nextInt();
        
        
        while (seguir){
            if (num < 0) {
                System.out.println("ERROR* Introduce un numero positivo");
            } else {
                seguir = false;
            }
        //num = teclado.nextInt();
        }
        
        System.out.print("El divisor de " + num);
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i + "\n");
            }
        }
    

}
}
