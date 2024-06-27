/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_acces_fitcher;

import java.io.File;

/**
 *
 * @author mohab
 */
public class MiGestorLlibres {

    File carpeta = new File("dades");
    File fichero = new File("dades/regLlibres.txt");

    public void generandoFichero() {
        carpeta.mkdir(); // crea carpeta si no existe
        try {
            fichero.createNewFile(); // crea fichero
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido crear el fichero" + ex.getMessage());
        }
    }

}
