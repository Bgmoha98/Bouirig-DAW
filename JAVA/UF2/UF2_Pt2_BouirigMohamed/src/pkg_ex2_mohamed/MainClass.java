/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_ex2_mohamed;

import pkg_ex2_mohamed_joc.Joc;

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
        Joc joc = new Joc();
        boolean correcto = true;
        
        do {
            joc.iniciarPartida();
            joc.jugando();
            correcto = joc.jugando();
        } while (!correcto);
        
        joc.puntosTotales();
    }

}
