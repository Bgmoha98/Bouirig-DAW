/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class EntradaDades {

    public static String entradaNombre(ArrayList<String> nombre) {
        Scanner teclado = new Scanner(System.in);
        String nom;
        System.out.println("introduce tu nombre: ");
        nom = teclado.next();
        return nom;
    }

    public static Integer entradaAltura(ArrayList<Integer> altura) {
        Scanner teclado = new Scanner(System.in);
        int alt;
        System.out.println("introduce tu altura: ");
        alt = teclado.nextInt();
        return alt;
    }
    
}
