/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_intro_metodos;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class B_contarPalabras {
    
    static String demanarLinia (String frase) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        frase = teclado.nextLine();
        return frase;
    }
    
    static int comptarParaules (String frase, int palabras) {
        demanarLinia(frase);
        frase.
    return palabras;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase = "";
        
        frase = demanarLinia(frase);
        
        
        System.out.println("Numero de paraules que conte " + comptarParaules(frases));
        
    }
    
}
