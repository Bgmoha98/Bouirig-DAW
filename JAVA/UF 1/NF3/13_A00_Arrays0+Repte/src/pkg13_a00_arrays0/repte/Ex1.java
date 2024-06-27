/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_a00_arrays0.repte;

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
        int[] edats = new int[10];
        Scanner lector = new Scanner(System.in);

        System.out.println("Introdueix l'edat de 10 persones en anys:");

        for (int i = 0; i < 10; i++) {
            edats[i] = lector.nextInt();
        }

        System.out.println("Les edats introduïdes són: ");

        for (int i = 0; i < edats.length; i++) {
            System.out.printf("Edat %d: %d \n", i, edats[i]);
        }
    }

}
