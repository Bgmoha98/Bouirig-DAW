/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_main;

import pkg_joc.Joc;

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
        Joc juego = new Joc();
        
        juego.desordenarTablero();
        
        juego.imprimirTablero();
    }
    
}
