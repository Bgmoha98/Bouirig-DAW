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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        double preuOrdinador = 500.45;
        int numOrdinadors = 25;
        
        System.out.printf("Hi han %d ordinadors, el seu preu és %f i en total costen %f\n",
               numOrdinadors, preuOrdinador, preuOrdinador*numOrdinadors);
        
        System.out.printf("Hi han %d ordinadors, el seu preu és %.2f€ i en total costen %.2f €\n",
               numOrdinadors, preuOrdinador, preuOrdinador*numOrdinadors);
        
    }
    
}
