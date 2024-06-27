/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numMenor, numMayor, auxiliar;

        System.out.println("Introduce dos numero enteros: ");
        numMenor = teclado.nextInt();
        numMayor = teclado.nextInt();

        if (numMenor > numMayor) {
            auxiliar = numMenor;
            numMenor = numMayor;
            numMayor = auxiliar;
        }

        System.out.println(numMayor + " es mayor que " + numMenor);

        if (numMayor % numMenor == 0) {
            System.out.println(numMayor + " es multiplo de " + numMenor);
        } else {
            System.out.println(numMayor + " no es multiplo de " + numMenor);
        }
    }
}
