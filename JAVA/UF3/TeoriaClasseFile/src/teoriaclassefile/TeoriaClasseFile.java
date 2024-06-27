/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaclassefile;

import java.io.File;

/**
 *
 * @author mohab
 */
public class TeoriaClasseFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        File directori = new File("fitxers"); //Un File pel directori i un pel fitxer 
        File f = new File("fitxers/enters.txt");
        directori.mkdir();        //Només el crea si no existeix. No llança excepcions

        try {           //si el codi del try dóna error, s'executa el codi del catch
            f.createNewFile(); //Només el crea si no existeix.
        } catch (Exception ex) { //només s'executa si el codi del try dóna error
            System.err.println("Error al crear el fitxer " + ex.getMessage());
        }
    }

}
