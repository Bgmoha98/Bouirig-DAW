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
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[100];
        int contador = 0;
        boolean validado = false;

        System.out.println("*** 100 NUMEROS ARRAY ***");
        System.out.println("Introduce 100 numeros o fi para finalizar: ");

        for (int i = 0; i < numeros.length; i++) {
            while (!validado) {

                if (teclado.hasNext("fi")) {
                    break;
                } else if (teclado.hasNextDouble()) {
                    numeros[i] = teclado.nextDouble();
                    contador++;
                    validado = true;
                    
                } else {
                    System.out.println("Error, debes introducir numeros reales:"
                            + "Vuelve a introducir un numero");
                    teclado.next();

                }

            }
            validado = false;
        }

        System.out.println("Los numeros introducidas son: ");

        for (int j = 0; j < contador; j++) {
            System.out.println( numeros[j]);
        }
    }

}
