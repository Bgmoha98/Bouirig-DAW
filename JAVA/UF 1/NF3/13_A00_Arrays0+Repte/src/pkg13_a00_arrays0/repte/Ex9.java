/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_a00_arrays0.repte;

import java.util.Random;

/**
 *
 * @author mohab
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random rand = new Random();
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
        int[] numeros = new int[50];

        for (int i = 0; i < 50; i++) {
            numeros[i] = rand.nextInt(6) + 1;
            System.out.print(numeros[i]+"  ");
            if (numeros[i] == 1) {
                uno++;
            } else if (numeros[i] == 2) {
                dos++;
            } else if (numeros[i] == 3) {
                tres++;
            } else if (numeros[i] == 4) {
                cuatro++;
            } else if (numeros[i] == 5) {
                cinco++;
            } else if (numeros[i] == 6) {
                seis++;
            }
        }

        System.out.println("\nEl numero 1 se ha repetido " + uno + " veces");
        System.out.println("El numero 2 se ha repetido " + dos + " veces");
        System.out.println("El numero 3 se ha repetido " + tres + " veces");
        System.out.println("El numero 4 se ha repetido " + cuatro + " veces");
        System.out.println("El numero 5 se ha repetido " + cinco + " veces");
        System.out.println("El numero 6 se ha repetido " + seis + " veces");

    }

}
