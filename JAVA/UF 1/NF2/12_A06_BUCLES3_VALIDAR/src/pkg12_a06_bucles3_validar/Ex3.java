/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a06_bucles3_validar;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero de asteriscos de la fila");
        do {
            if (!teclado.hasNextInt()) {
                teclado.next();
                System.out.println("Error, introdueix un nombre enter");
            } else {
                num = teclado.nextInt();

                while (true) {

                    for (int i = 0; i < num; i++) {
                        System.out.print("*");

                    }

                    System.out.println("\nEscribe s/S para salir o otro caracter para repetir la linea");
                    if (teclado.hasNext()) {
                        for (int i = 0; i < num; i++) {
                            System.out.print("*");
                        }
                    } else {
                        break;
                    }

                }
            }

        } while (!teclado.hasNext("s") || !teclado.hasNext("S"));

    }

}
