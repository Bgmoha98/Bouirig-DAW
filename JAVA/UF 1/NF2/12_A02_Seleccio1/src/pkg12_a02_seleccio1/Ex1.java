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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int temperatura;
        String estado;

        System.out.println("Introduce la temperatura en numero entero: ");
        temperatura = teclado.nextInt();

        if (temperatura < 0) {
            estado = "Solido";
        } else if (temperatura < 100) {
            estado = "Liquido";
        } else {
            estado = "Gas";
        }

        System.out.printf("El estado del agua (%dºC) es %s \n", temperatura, estado);
    }

}
