/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_pt1_bouirigmohamed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *
 * @author mohab
 */
public class TestPartit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        final Logger LOGGER = Logger.getLogger(TestPartit.class.getName());

        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream(
                    "fitxers/configLog.properties"));
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }
        
        
        // Creo futbolistas
        Futbolista futbolista1 = new Futbolista("Justin", "Defensa", 20);
        Futbolista futbolista2 = new Futbolista("Moha", "Medio", 14);
        Futbolista futbolista3 = new Futbolista("Sergio", "Delantero", 7);
      
         // Creo Partido 
        Partit partit = new Partit("20/05/2023");
        partit.convocar(futbolista1);
        partit.convocar(futbolista2);
        partit.convocar(futbolista3);

        System.out.println("Mostrant convocats que són delanters:");
        System.out.println(partit.getConvocatsPosicio("Delantero"));
        
        // Desconvoco futbolista1
        partit.desconvocar(futbolista1);
        
        // Imprimo Partido
        System.out.println(partit);

    }

}
