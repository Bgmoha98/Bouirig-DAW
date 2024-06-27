/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriaclassefile;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Lectura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("fitxers/dadesText.txt");
        String text = "TEXT DE PROVA2";
        try (FileWriter fw = new FileWriter(f, true)) {
            fw.write(text);
            fw.write(System.lineSeparator());
        } catch (Exception ex) {
            System.err.println(
                    "Error d'escriptura " + ex.getMessage());
        }

    }
}
