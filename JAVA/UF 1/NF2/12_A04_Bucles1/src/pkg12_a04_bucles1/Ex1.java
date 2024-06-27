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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int num, sumaNum = 0;
        
        
        System.out.println("Introduce un num: ");
        if (!teclado.hasNextInt() ) {
            num = teclado.nextInt();
            System.out.println("El numero tiene que ser entero.");
         else if (teclado.nextInt() < 0){
            System.out.println("El numero tiene que ser positivo.");
        } else {
            for (int i = 0; i < num; i++) {
                sumaNum += num;
            }
        } System.out.println(sumaNum);
        
    }
    
}
