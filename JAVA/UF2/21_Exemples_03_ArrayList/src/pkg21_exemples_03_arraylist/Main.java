/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_exemples_03_arraylist;

import java.util.*;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crear arraylist y que pida letras o un 0 para salir. luego mostrar todas iniciales en forma vertical

        Scanner teclado = new Scanner(System.in);

        ArrayList<Character> iniciales = new ArrayList<>();

        boolean esCaracter = true;

        System.out.println("introduce un caracter o el numero 0 para salir.");

        while (!teclado.hasNext("0")) {
            iniciales.add(teclado.next().charAt(0));
        }
        
        System.out.println("*** INICIALES ****");
        
        for (int i = 0; i < iniciales.size(); i++) {
            System.out.println(iniciales.get(i));
        }

    }

}
