/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_a00_arrays0.repte;

/**
 *
 * @author mohab
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] temperaturas = {2.5, 7.5, 9.65, 15.05, 19.25, 24.9, 29.0, 27.5, 22.0, 17, 11.2, 9.2};
        int contador = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Temperaturas [%d] = %.2f\n", (i + 1), temperaturas[i]);
            contador++;

        }

        System.out.println("");
        System.out.println("* Temperatures dels mesos senars *");
        
        for (int j = 0; j < temperaturas.length; j += 2) {
            System.out.printf("Mes  %d : %.2f\n", (j + 1), temperaturas[j]);

        }
    }
}
