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
public class TeoriaScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fitxer = new File("arxius/dadesText.txt");

        try (Scanner lector = new Scanner(fitxer)) {
            lector.useDelimiter(":");
            
            while (lector.hasNext()) {
                System.out.println("NOMBRE " + lector.next());
                System.out.println("APELLIDO " + lector.next());
                System.out.println("EDAD " + lector.nextInt());
                System.out.println("SUELDO " + lector.nextDouble());
            }
        } catch (Exception ex) { //només s'executa si el codi del try dóna error
            System.err.println("Error " + ex.getMessage());
        }

    }

}
