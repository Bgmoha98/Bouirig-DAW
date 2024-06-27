/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaclassefile;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author mohab
 */
public class TeoriaFileWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File fitxer = new File("arxius/dadesText.txt");
        String nom = "Mohamed";
        String apellido = "Bouirig";
        int edad = 25;
        double sueldo = 3500;

        try (FileWriter fw = new FileWriter(fitxer, true)) {           
            fw.write(nom + ":" + apellido + ":"  + edad + ":"  + sueldo + ":" );
            System.out.println("Documento actualizado!");
        } catch (Exception ex) { //només s'executa si el codi del try dóna error
            System.err.println("Error " + ex.getMessage());
        }
    }

}


