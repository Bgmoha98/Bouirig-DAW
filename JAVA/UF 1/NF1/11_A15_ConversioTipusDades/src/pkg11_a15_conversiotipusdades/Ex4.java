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
public class Ex4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double precioLibro;
        final short IVA = 21;
        float precioFinal, calculoIva;

        System.out.println("Introduce el precio del libro sin IVA: ");
        precioLibro = teclado.nextDouble();

        // En calculo IVA si no se pone la F de float al 100 no te hace bien el calculo de la linea 28
        precioFinal = (float) precioLibro * (1 + (float) IVA / 100);

        System.out.printf("El precio final es: %.2f€ \n", precioFinal);

    }

}
