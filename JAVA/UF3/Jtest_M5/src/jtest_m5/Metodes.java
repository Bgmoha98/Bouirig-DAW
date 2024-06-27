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
public class Metodes {

    public static int contarVocals(String cadena) {
        int count = 0;
        for (int i = 0; i < cadena.length(); i++) {
            //Comprobamos si el caracter es una vocal
            if (cadena.charAt(i) == 'a'
                    || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

    public static int contarParaules(String cadena) {

        StringTokenizer st = new StringTokenizer(cadena);
        int count = st.countTokens();

        return count;

    }

}
