/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a07_vendes;

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int D01 = 0, litros;
        double precioLitros, importeTotal;
        String articulo, seguir2;
        boolean seguir = true;

        System.out.println("*** Gestió de vendes de desinfectants ***");

        while (seguir) {
            System.out.println("Introduce el codigo del articulo: ");
            articulo = teclado.next();

            System.out.println("Introduce los litros: ");
            if (!teclado.hasNextInt()) {
                teclado.next();
                System.out.println("Error, los litros tienen que ser un valor entero. "
                        + "\n Vuelve a introducir los LITROS");
            } else {
                litros = teclado.nextInt();

                System.out.println("Introduce el precio por litro: ");
                if (!teclado.hasNextDouble()) {
                    teclado.next();
                    System.out.println("Error, los litros tienen que ser un valor entero. "
                            + "\n Vuelve a introducir los LITROS");
                } else {
                    precioLitros = teclado.nextDouble();
                    importeTotal = litros * precioLitros;
                    System.out.println("El preciode la venta es " + importeTotal);
                }

            }

            System.out.println("_______________________________________");

            System.out.println("Quieres introducir otra venta? (sS/nN)");
            seguir2 = teclado.next();
            if (seguir2.equalsIgnoreCase("s")) {
                seguir = true;
            } else if (seguir2.equalsIgnoreCase("n")) {
                seguir = false;
            }

        }

    }

}
