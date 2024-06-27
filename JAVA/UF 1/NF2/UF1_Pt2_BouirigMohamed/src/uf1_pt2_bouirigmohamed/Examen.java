/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt2_bouirigmohamed;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Variables declaradas
        Scanner teclado = new Scanner(System.in);
        final String CIUDAD = "Montcada i Reixac";
        String ciudadTeclado;
        double precioArticulo, articuloCaro = 0, importeAcumulado = 0, envio = 0;

        // for anidado donde imprimo 2 veces el caracter \
        System.out.println("Carrito de la compra");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("\\");
            }
            System.out.println("");
        }

        System.out.println(""); // simplemente imprimo un salto de linea

        System.out.println("*** Añadiendo al carrito de la ompra ***");

        do {
            System.out.print("Introduce el precio del articulo (€): ");

            if (!teclado.hasNextDouble()) {
                // si no es un double dice que es error y te pregunta si quieres añadir un articulo o no
                System.out.println(">>Error: tiene que ser un numero<<");
                System.out.print("\nAñadir otro articulo? (sS/nN)");
                teclado.next();
            } else {
                // guardo el precio del valor y lo voy sumando en una variable llamada importe Acumulado
                precioArticulo = teclado.nextDouble();
                importeAcumulado += precioArticulo;
                // comparativa de que numero introducido es el mas grande
                if (precioArticulo > articuloCaro) {
                    articuloCaro = precioArticulo;
                }
                System.out.print("\nAñadir otro articulo? (sS/nN)");
            }
            // el bucle no para de ejecutarse mientras sea s
        } while (teclado.next().equalsIgnoreCase("s"));

        // Configuracion de envio
        System.out.println("\n*** Configurando el envio ***\n");
        System.out.printf("Importe acomulado: %.2f€ \n", importeAcumulado);

        teclado.nextLine(); // limpio buffer

        System.out.print("\nIntroduce la ciudad de destino: ");
        ciudadTeclado = teclado.nextLine();
        // Si la ciudad no es montcada i reixac el envio vale 10€ si la ciudad es montcada y el precio acomulado es mas de 100 es envio gratuito
        if (ciudadTeclado.equalsIgnoreCase(CIUDAD) && importeAcumulado > 100) {
            System.out.println("Felicidades! Envio gratis a " + ciudadTeclado);
        } else {
            envio += 10;
            System.out.println("El envio costara " + envio + " hasta " + ciudadTeclado);
        }

        // Finalizando la compra con el resultado
        System.out.println("\n*** Finalizando la compra ***");
        System.out.printf("El articulo mas caro cuesta: %.2f€\n", articuloCaro);
        System.out.printf("Importe de la compra: %.2f€ \n", importeAcumulado);
        System.out.printf("Coste del envio: %.2f€ \n", envio);
        System.out.printf("Importe final: %.2f€ \n", (importeAcumulado + envio));

    }

}
