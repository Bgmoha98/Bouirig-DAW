/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int anyo, moduloEntre400, moduloEntre4, moduloEntre100;

        System.out.println("Introduce un año: ");
        anyo = teclado.nextInt();

        moduloEntre400 = anyo % 400;
        moduloEntre4 = anyo % 4;
        moduloEntre100 = anyo % 100;

        /**
         * Primero decimos si el modulo entre 400 es 0 pues es un año bisiensto
         * y debuelve True, Despues del OR (||) significa que si es divisible
         * entre 4 y no divisible entre 100 pues es un año bisiensto y debuelve
         * True Si no debolvera False y no es un año bisiesto
         */
        boolean esTraspaso = moduloEntre400 ==  0 || moduloEntre4 == 0 && moduloEntre100 != 0;

        System.out.printf("El año (%d) introducido, es un año bisiesto? %b\n", anyo, esTraspaso);

    }

}
