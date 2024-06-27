/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a17_repasteatre;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class ExTeatre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        double precioGalliner = 18.50;
        double precioPlatea = 28.50;
        double precioRomera = 29.50;
        String nombreCasal;
        int interesadosTNC1, porcentageTNC1, interesadosTNC2, porcentageTNC2, interesadosRomera, porcentageRomera;
        boolean ofertaGalliner, ofertaPlatea, ofertaRomera;
        int calculoGalliner, calculoPlatea, calculoRomera, calculoGallinerYPlatea;
        
        System.out.println("Número d'interessats en el TNC1:  ");
        interesadosTNC1 = teclado.nextInt();

        System.out.println("Percentatge final al TNC1 (sobre 100):  ");
        porcentageTNC1 = teclado.nextInt();

        System.out.println("Número d'interessats en el TNC2: ");
        interesadosTNC2 = teclado.nextInt();

        System.out.println("Percentatge final al TNC2 (sobre 100):  ");
        porcentageTNC2 = teclado.nextInt();

        System.out.println("Número d'interessats en el Romea: ");
        interesadosRomera = teclado.nextInt();

        System.out.println("Percentatge final al Romea (sobre 100): ");
        porcentageRomera = teclado.nextInt();
        
        teclado.nextLine(); // Limpio buffer

        System.out.println("Nom sencer del casal vinculat a l'oferta: ");
        nombreCasal = teclado.nextLine();

        
        // calculos
        calculoGalliner = (interesadosTNC1 * porcentageTNC1) / 100;
        calculoPlatea = (interesadosTNC2 * porcentageTNC2) / 100;
        calculoRomera = (interesadosRomera * porcentageRomera) / 100;
        //calculoGallinerYPlatea = calculoGalliner + calculoPlatea;
       
        
        ofertaGalliner = calculoGalliner >= 35;
        ofertaPlatea = calculoPlatea >= 35;
        ofertaRomera = (calculoGalliner + calculoPlatea >=40 &&  calculoRomera >=30 );
        
        System.out.printf("\n*** OFERTA PER AL CASAL \"%S\" ***", nombreCasal);
        
        System.out.printf("\nPreu TNC al galliner reduït (%.2f€)? %b (%d avis apuntats, %d%%)", precioGalliner,
                ofertaGalliner , calculoGalliner, porcentageTNC1);   
        
        System.out.printf("\nPreu TNC al galliner reduït (%.2f€)? %b (%d avis apuntats, %d%%)", precioPlatea, ofertaPlatea
                , calculoPlatea, porcentageTNC2);    
        
        System.out.printf("\nPreu TNC al galliner reduït (%.2f€)? %b (%d avis apuntats, %d%%)", precioRomera, ofertaRomera
                , calculoRomera, porcentageRomera);
        
        System.out.printf("\nConclusió a partir de les dades: Podem anar al teatre? %b\n",ofertaRomera );
    }

}
