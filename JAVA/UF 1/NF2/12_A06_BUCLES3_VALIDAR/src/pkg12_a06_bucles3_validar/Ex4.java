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
public class Ex4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int aprobado = 0, suspendido = 0;
        double nota;

        System.out.println("Introduce notas, entre 0 y 10 o fi para acabar. ");

        while (!teclado.hasNext("fi")) {

            if (!teclado.hasNextDouble()) {
                teclado.next();
                System.out.println("Error, la nota tiene que ser un numero");
            } else {

                nota = teclado.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Error, la nota tiene que ser entre 0 y 10");
                } else if (nota < 5) {
                    suspendido++;
                } else if (nota >= 5) {
                    aprobado++;
                }
            }

        }

        System.out.println("Tienes " + aprobado + " aprobados " + " y " + suspendido + " suspensos");

    }

}
