/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes;

        System.out.println("Introduce en dia en el que has nacido: ");
        dia = teclado.nextInt();
        System.out.println("seguido introduce el mes: ");
        mes = teclado.nextInt();
        

        if ((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12)) {

            if ((dia >= 22 && mes == 12) || (dia <= 20 && mes == 1)) {
                System.out.println("Capricornio \u2651" );
            } else if ((dia >= 21 && mes == 1) || (dia <= 19 && mes == 2)) {
                System.out.println("Aquario \u2652");
            } else if ((dia >= 20 && mes == 2) || (dia <= 20 && mes == 3)) {
                System.out.println("Piscis \u2653");
            } else if ((dia >= 21 && mes == 3) || (dia <= 19 && mes == 4)) {
                System.out.println("Aries \u2648");
            } else if ((dia >= 20 && mes == 4) || (dia <= 20 && mes == 5)) {
                System.out.println("Tauro \u2649");
            } else if ((dia >= 21 && mes == 5) || (dia <= 21 && mes == 6)) {
                System.out.println("Gemenis \u264A");
            } else if ((dia >= 22 && mes == 6) || (dia <= 21 && mes == 7)) {
                System.out.println("Cancer \u264B");
            } else if ((dia >= 22 && mes == 7) || (dia <= 21 && mes == 8)) {
                System.out.println("Leo \u264C");
            } else if ((dia >= 22 && mes == 8) || (dia <= 22 && mes == 9)) {
                System.out.println(" Virgo \u264D");
            } else if ((dia >= 23 && mes == 9) || (dia <= 22 && mes == 10)) {
                System.out.println("Libra \u264E");
            } else if ((dia >= 23 && mes == 10) || (dia <= 21 && mes == 11)) {
                System.out.println("Escorpio \u264F");
            } else if ((dia >= 22 && mes == 11) || (dia <= 21 && mes == 12)) {
                System.out.println(" Sagitario \u2650");
            }
        } else  {
            System.out.println("Fecha de nacimiento erronea.");
        }
    }

}
