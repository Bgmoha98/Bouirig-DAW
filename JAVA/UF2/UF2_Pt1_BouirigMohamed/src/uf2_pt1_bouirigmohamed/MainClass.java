/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2_pt1_bouirigmohamed;

import java.util.ArrayList;

/**
 *
 * @author mohab
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int TOTALSURTIDORES = 10;
        final int LITROS = 100;
        int[] surtidores;

        // llama al metodo saluda y imprime el print del metodo
        Gasolina.saluda();

        // inicializo el aray asignandoles los valores de las constantes declaradas y llamo al metodo para que genere el 
        // array y imprima un mensaje diciendo que se han inicializado
        surtidores = Gasolina.inicializandoSurtidores(TOTALSURTIDORES, LITROS);

        // llamo al metodo para inprimir el array pasandole la informacion que habia inicializado anteriormente dentro de la variable surtidores
        Gasolina.imprimirInfoSurtidores(surtidores);

        // llamo al metodo ventas 2 veces para realizar la venta
        Gasolina.venta(surtidores);
        Gasolina.venta(surtidores);

        // imprimo el array surtidores con la modificación de las ventas
        Gasolina.imprimirInfoSurtidores(surtidores);

        System.out.println("\n** Informacion de venta realizadas **");
    }

}
