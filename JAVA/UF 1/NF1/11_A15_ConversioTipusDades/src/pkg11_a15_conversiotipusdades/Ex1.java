/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a15_conversiotipusdades;

import java.util.Scanner;

/**
 *
 * @author Moha
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int temperatura, presion;

        System.out.print("Introduce la temperatura: ");
        temperatura = (int) teclado.nextDouble();

        System.out.print("Introduce la presion: ");
        presion = (int) teclado.nextDouble();

        System.out.println("La temperatura es de: " + temperatura + "ºC"
                + " y la presion indicada es de: " + presion + "Pa");

    }

}
