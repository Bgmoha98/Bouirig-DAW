/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_ex2_mohamed_joc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Joc {

    ArrayList<String> palabrasCorrectas = new ArrayList<>();
    char caracter;

    public  void iniciarPartida() {
        Random rnd = new Random();
        String caracteres = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < caracteres.length(); i++) {
            caracter = caracteres.charAt(rnd.nextInt(caracteres.length()));
        }
        
        System.out.println("Di una palabra que empiece por \"" + caracter + "\"");
        
    }
    
    public boolean jugando(){
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();
        boolean esCorrecto = false;
        String caracterString = String.valueOf(caracter);
        if (palabra.startsWith(caracterString)) {
            System.out.println("Muy Bien!");
            palabrasCorrectas.add(palabra);
            esCorrecto = true;
        } else {
            System.out.println("Fin de la partida!");
            esCorrecto = false;
        }
        return esCorrecto;
    }
    
    public void puntosTotales(){
        System.out.println("Has conseguido " + palabrasCorrectas.size() + " correctas");
    }

}
