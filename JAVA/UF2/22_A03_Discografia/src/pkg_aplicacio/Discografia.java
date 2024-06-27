/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_aplicacio;

import java.util.ArrayList;
import java.util.Scanner;
import pkg_utilitats.GestorEntrada;

/**
 *
 * @author mohab
 */
public class Discografia {

    ArrayList<String> cantantes = new ArrayList<>();
    ArrayList<String> discos = new ArrayList<>();

    public String opcionesMenu() {
        return GestorEntrada.pedirLineaText(
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\nEscoge una opcion: "
                + "\n 1. Alta cantant i disc més venut"
                + "\n 2. Llista cantants i disc més venut"
                + "\n 3. Eliminar cantant i disc més venut"
                + " \n 4. Actualitzar Disc"
                + "\n 5. Sortir");
    }

    public void introducionCantantesDiscos() {
        String cantante = GestorEntrada.pedirLineaText("\nIntroduce el nombre del cantante : ");
        cantantes.add(cantante);
        String disco = GestorEntrada.pedirLineaText("Introduce el nombre el disco mas vendido del cantante: ");
        discos.add(disco);
    }

    public void listarCantantesDiscos() {
        System.out.println("\nLista actual de cantantes y discos mas vendidos: ");
        for (int i = 0; i < cantantes.size(); i++) {
            System.out.print("\nCantante: " + cantantes.get(i) + "\tDisco mas vendido: " + discos.get(i));
        }

    }

    public void eliminarCantantesDiscos() {        
        String cantanteElimnar = GestorEntrada.pedirLineaText("\nIntroduce el nombre del cantante a eliminar: ");
        int indice;
        indice = cantantes.indexOf(cantanteElimnar);

        if (indice == -1) {
            System.out.println("No se ha encontrado el cantante");
        } else {
            cantantes.remove(indice);
            discos.remove(indice);
        }
    }

    public void actualizarDiscos() {
        String cantantePosicion = GestorEntrada.pedirLineaText("\nIntroduce el nombre del cantante a modificar el disco: ");
        String discoModificar;
        int indice;
        

        indice = cantantes.indexOf(cantantePosicion);

        if (indice == -1) {
            System.out.println("No se ha encontrado el cantante");
        } else {
            System.out.println();
            discoModificar = GestorEntrada.pedirLineaText("Introduce el nuevo disco mas vendido");
           
            discos.set(indice, discoModificar);
        }
    }

}
