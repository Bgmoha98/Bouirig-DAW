/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a02_chicken01;

/**
 *
 * @author Moha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Todas las variables
        int ousGallinaDia = 4 ;
        int numGallines = 9 ;        
        int dilluns, dimarts, dimecres, unaGallinames, totalOus;
        
        // Calculo dilluns
        dilluns = ousGallinaDia * numGallines;
        
        // Calculo dimarts
        unaGallinames = numGallines + 1;
        dimarts = unaGallinames * ousGallinaDia;
        
        // Calculo dimecres 
        dimecres = (unaGallinames / 2) * ousGallinaDia;
        
        // Total ous
        totalOus = dilluns + dimarts + dimecres;
        
        
        // Mostrant resultats
        System.out.println("El Dilluns en Paco aconsegueix recollir " + dilluns + " ous");
        System.out.println("El Dimarts en Paco aconsegueix recollir " + dimarts + " ous");
        System.out.println("El Dimecres en Paco aconsegueix recollir " + dimecres + " ous");
        System.out.println("El numero total de ous es: " + totalOus);
        
    }   
    
    
}
