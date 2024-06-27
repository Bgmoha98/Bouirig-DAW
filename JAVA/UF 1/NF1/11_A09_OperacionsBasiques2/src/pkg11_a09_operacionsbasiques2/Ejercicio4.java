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
public class Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String nombre;
        boolean menor25Anys, franjaHoraria1, matriculaPrevia, descuento;

        System.out.println("Podrías indicar cual es tu nombre juntamente con el primer apellido? ");
        nombre = teclado.nextLine();

        System.out.println("Tienes menos de 25 años? (Si es asi indica true y si no false) ");
        menor25Anys = teclado.nextBoolean();

        System.out.println("Tienes disponiblidad de 9:00h a 12:00h? (Si es asi indica true y si no false) ");
        franjaHoraria1 = teclado.nextBoolean();

        System.out.println("Has estado matriculado en otra autoescuela previamente? (Si es asi indica true y si no false) ");
        matriculaPrevia = teclado.nextBoolean();

        descuento = menor25Anys == true && franjaHoraria1 == true && matriculaPrevia == false;

        System.out.printf("Hola %s, en tu caso el descuento a la matricula es: %b\n", nombre, descuento);

    }

}
