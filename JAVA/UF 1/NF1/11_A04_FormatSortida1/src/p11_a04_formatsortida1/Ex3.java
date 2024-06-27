/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_a04_formatsortida1;

/**
 *
 * @author esther
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom1 = "ANTONI";
        String cognom11 = "LOPEZ";
        String cognom12 = "RODRIGUEZ";
        int edat1 = 17;
        double alçada1 = 1.67;
        String ciutat1 = "Montcada i Reixac";

        
        String nom2 = "PAU";
        String cognom21 = "GARCÍA";
        String cognom22 = "ARENÒS";
        int edat2 = 5;
        double alçada2 = 1.4;
        String ciutat2 = "Barcelona";

        String nom3 = "LAURA";
        String cognom31 = "GONZÁLEZ";
        String cognom32 = "BAYÉS";
        int edat3 = 101;
        double alçada3 = 1.552;
        String ciutat3 = "Cerdanyola";


        System.out.printf("%-12s;%-15s;%-15s;%3d; %4.2f;%-20s\n", nom1, cognom11, cognom12, edat1, alçada1, ciutat1);
        System.out.printf("%-12s;%-15s;%-15s;%3d; %4.2f;%-20s\n", nom2, cognom21, cognom22, edat2, alçada2, ciutat2);
        System.out.printf("%-12s;%-15s;%-15s;%3d; %4.2f;%-20s\n", nom3, cognom31, cognom32, edat3, alçada3, ciutat3);
    
    }
    
}
