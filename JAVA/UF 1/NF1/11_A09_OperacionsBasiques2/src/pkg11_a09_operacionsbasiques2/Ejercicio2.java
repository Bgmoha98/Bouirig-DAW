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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int ladotriangulo1, ladotriangulo2, ladotriangulo3;
        boolean comprobadorTriangulo, comprobadorEquilater;

        System.out.println("Introduce cuanto mide el lateral de un triangulo");
        ladotriangulo1 = teclado.nextInt();

        System.out.println("Introduce cuanto mide el lateral de un triangulo");
        ladotriangulo2 = teclado.nextInt();

        System.out.println("Introduce cuanto mide el lateral de un triangulo");
        ladotriangulo3 = teclado.nextInt();

        comprobadorTriangulo = (ladotriangulo1 + ladotriangulo2) > ladotriangulo3 || (ladotriangulo2 + ladotriangulo3) > ladotriangulo1 || (ladotriangulo1 + ladotriangulo3) > ladotriangulo2;
        comprobadorEquilater = ladotriangulo1 == ladotriangulo2 && ladotriangulo2 == ladotriangulo3;

        System.out.printf("Dos de los lados es superio al otro? %b\nEl triangulo es equilater? %b\n", comprobadorTriangulo, comprobadorEquilater);

    }

}
