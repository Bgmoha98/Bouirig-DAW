/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_22_a01_intropaquets;

import java.util.ArrayList;
import pkg_utilitats.EntradaDades;

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
        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<Integer> altura = new ArrayList<>();
        ArrayList<Integer> edad = new ArrayList<>();

        nombre.add(EntradaDades.entradaNombre(nombre));
        nombre.add(EntradaDades.entradaAltura(altura));
        System.out.println(nombre.get(0));
    }

}
