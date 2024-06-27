/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a04_bucles1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menu, num1, num2;
        double num11;
        boolean seguir = true;

        while (seguir) {

            System.out.println("Escoge una opcion"
                    + "\n1. Suma"
                    + "\n2. Resta"
                    + "\n3. Multiplicacion"
                    + "\n4. Division"
                    + "\n0. Salir \n");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Introduce dos numeros: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("Suma = " + (num1 + num2)); 
                    break;

                case 2:
                    System.out.println("Introduce dos numeros: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("Resta = " + (num1 - num2)); 
                    break;

                case 3:
                    System.out.println("Introduce dos numeros: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    System.out.println("Multiplicacion = " + (num1 * num2)); 
                    break;

                case 4:
                    System.out.println("Introduce dos numeros: ");
                    num1 = teclado.nextInt();
                    num2 = teclado.nextInt();
                    if (num2 == 0) {
                        System.out.println("No se puede realizar una division entre 0");
                    } else {
                        System.out.println("Division = " + (num1 / num2)); 
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del menu. ");
                    seguir = false;

                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }

}
