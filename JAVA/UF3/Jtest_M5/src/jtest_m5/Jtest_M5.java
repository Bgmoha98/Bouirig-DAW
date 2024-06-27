/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtest_m5;

import java.util.StringTokenizer;

/**
 *
 * @author mohab
 */
public class Jtest_M5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Cada dia surt el Sol";
        String cadena2 = "           el Sol";

        int contador = 0;
        int contadorVocals = Metodes.contarVocals(cadena2);
        int contadorParaules = Metodes.contarParaules(cadena2);

        System.out.println("N'hi ha " + contadorVocals + " vocals");
        System.out.println("N'hi ha " + contadorParaules + " paraules");
    }

}
