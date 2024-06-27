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
public class Ex3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        double[] numeros = new double[100];

        System.out.println("*** 100 NUMEROS ARRAY ***");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce 100 numeros: ");
            while (continuar) {

                if (teclado.next().equalsIgnoreCase("fi") ) {
                    continuar = false;
                } else {

                    if (!teclado.hasNextDouble()) {
                        System.out.println("Error, debes introducir numeros reales:"
                                + "Vuelve a introducir un numero");
                        teclado.next();

                    } else {

                        numeros[i] = teclado.nextDouble();

                    }
                }
            }
        }

        System.out.println("Los numeros introducidas son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
