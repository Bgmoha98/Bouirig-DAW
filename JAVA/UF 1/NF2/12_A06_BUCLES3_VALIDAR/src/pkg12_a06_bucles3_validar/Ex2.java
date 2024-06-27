/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a06_bucles3_validar;

import java.util.Scanner;

/**
 *
 * @author Moha
 */
public class Ex2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int edad, mayor = -1;
        String edads;
        boolean seguir = true;

        System.out.println("Introduce la edad de un miembro de la familia, o \"surt\" para salir");

        while (!teclado.hasNext("surt")) {

            if (!teclado.hasNextInt()) {
                teclado.next();
                System.out.println("Error, la edad tiene que ser un numero entero");

            } else {

                edad = teclado.nextInt();

                if (edad < 0 || edad > 150) {
                    System.out.println("Error, edades permitidas de 0 a 150");
                } else {
                    System.out.println("Introduce una edad");

                }
                
                if (edad > mayor) {
                    mayor = edad;
                }
            }

        }
        System.out.println("La edad mas grande es: "+ mayor);
    }

}
