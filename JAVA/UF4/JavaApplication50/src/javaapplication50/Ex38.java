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
public class Ex38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int num, sumaPositivos = 0, sumaNegativos = 0, mediaSuma;
        int numMayor = -999;
        int numMenor = 999;
        boolean seguir = true;

        while (seguir) {
            System.out.println("Introduce un numero");
            num = teclado.nextInt();
            if (num == -1) {
                seguir = false;
            } else {
                if (num > numMayor) {
                    numMayor = num;
                } else if (num < numMenor) {
                    numMenor = num;
                }

                if (num >= 0) {
                    sumaPositivos += num;
                } else {
                    sumaNegativos += num;
                }
            }

        }

        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
        System.out.println("La suma de los numeros positivos es: " + sumaPositivos);
        System.out.println("La suma de los numeros negativos es: " + sumaNegativos);
    }

}
