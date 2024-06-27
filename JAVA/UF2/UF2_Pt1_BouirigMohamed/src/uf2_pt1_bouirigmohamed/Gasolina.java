/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2_pt1_bouirigmohamed;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Gasolina {

    /**
     * @param saluda mensaje de Bienvenida
     * 
     */
    static void saluda() {
        // imprimo mensaje de bienvenida
        System.out.println("Bienvenidos a DAME GASOLINA");
        System.out.println("\\\\\\\\\\\\\\\\\\\\$$$$$$$//////////");
    }

    static int[] inicializandoSurtidores(int num1, int num2) {
        // declaro array surtidores y le paso los valores num1 y num2 que seran surtidores y litros
        int[] surtidores = new int[num1];
        for (int i = 0; i < surtidores.length; i++) {
            // inicializo el arrar con los valores de surtidores y litros
            surtidores[i] = num2;

        }
        System.out.println("\n** Surtidores Inicializados **");
        return surtidores;
    }

    static void imprimirInfoSurtidores(int[] surtidores) {
        System.out.println("\n** Litros disponibles en los surtidores **");
        // recorro el array de surtidores y voy imprimendo el surtidor +1 ya que empieza en 0 mas los litros
        for (int i = 0; i < surtidores.length; i++) {
            System.out.println(">> Surtidor #" + (i + 1) + ": " + surtidores[i] + " litros");
        }
    }

    static ArrayList<Integer> venta(int[] surtidores) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> litrosGuardados = new ArrayList<>();
        // creo contador que se ira sumando y variables para guardar los valores que indique por teclado
        int contador = 1;
        int numSurtidor, litros;
        // muestro mensaje mas el contador++
        System.out.println("\nRealizar venta #" + (contador++));
        // pido los datos por teclado
        System.out.print("Inroduce el numero de surtidor >");
        numSurtidor = teclado.nextInt();
        System.out.print("Inroduce los litros >");
        litros = teclado.nextInt();

        // Le indico que si litros es menor a 1 o litros es mayor que 100 que muestre un mensaje de error
        if (litros < 1 || litros > 100) {
            System.out.println("\nError, no hay " + litros + " en el surtidor #" + numSurtidor
                    + "\nHaz una nueva venta en otro surtidor");
        } else {
            // si son correctos los datos introducidos, añado litros al arraylist que habia creado antes
            litrosGuardados.add(litros);
            //al array de surtidores le paso el numero de surtidor -1 ya que si no se aplicara para el siguiente numero
            // ejemplo si pongo 5 se aplicara el cambio en el numero 6 pero con el -1 evito que pase.
            surtidores[numSurtidor - 1] -= litros;
            // imprimo mensaje de venta realizada
            System.out.println("\nVenta realizada. Quedan " + surtidores[numSurtidor - 1] + " litros en el surtidor #" + (numSurtidor));

        }

        // el apartado para imprimir la informacion de ventas, no se como realizarla desde el main
        return litrosGuardados;

    }

}
