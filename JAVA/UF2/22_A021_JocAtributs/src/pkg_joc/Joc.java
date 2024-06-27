/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_joc;

import java.util.Random;

/**
 *
 * @author mohab
 */
public class Joc {

    String[][] tauler = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"1", "2", "3"},
        {"4", "5", "6"}
    };

    public void desordenarTablero() {
        Random rnd = new Random();
        String numeros = ("123456");
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                int fila = rnd.nextInt(i);
               int columna = rnd.nextInt(j);
                String numeroAleatorio = String.valueOf(fila);
                String numeroAleatorio2 = String.valueOf(columna);
                tauler[i][j] = tauler[numeroAleatorio][numeroAleatorio2];

            } 
        }

    }
    
    public void imprimirTablero(){
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print( tauler[i][j]);  
            }
            System.out.println("");
        }

    }

}
