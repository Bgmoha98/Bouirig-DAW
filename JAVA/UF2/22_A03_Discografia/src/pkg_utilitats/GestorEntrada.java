/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_utilitats;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class GestorEntrada {
    
    public static String pedirLineaText(String frase){
        Scanner teclado = new Scanner(System.in);
        System.out.println(frase);
        return teclado.nextLine();
    
    }
    
}
