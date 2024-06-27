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
public class Ex3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        char categoria;

        System.out.println("Selcccionala opcion deseada: "
                + "\nA. Extraer"
                + "\nB. Ingresar"
                + "\nC. Ultimos movimientos"
                + "\nD. Salir del Menu");
        categoria = teclado.next().toUpperCase().charAt(0);

        switch (categoria) {
            case 'A':
                System.out.println("Opcion deseada: Extraer");
                break;
            case 'B':
                System.out.println("Opcion deseada: Ingresar");
                break;
            case 'C':
                System.out.println("Opcion deseada: Ultimos movimientos");
                break;
            case 'D':
                System.out.println("Opcion deseada: Salir del menu");
                break;
            default:
                System.out.println("Categoria incorrecta");

        }

    }
}
