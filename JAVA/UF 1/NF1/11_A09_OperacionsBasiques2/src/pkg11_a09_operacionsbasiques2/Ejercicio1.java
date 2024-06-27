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
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numeroDni;
        char letraDni;
        int numeroFinalDni;
        boolean comparador;

        System.out.println("Introduce el numero de tu DNI:");
        numeroDni = teclado.nextInt();

        System.out.println("Introduce el numero de tu DNI:");
        letraDni = teclado.next().charAt(0);

        numeroFinalDni = numeroDni % 23;
        
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        
        comparador = letraDni == caracteres.charAt(numeroFinalDni);
        
        System.out.println("El DNI es correco si muestra TRUE, si es incorrecto mostrara FALSE:  "+ comparador);

    }

}
