/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Punt;
import model.Rectangle;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punt punto1 = new Punt(2,3);
        Punt punto3 = new Punt(6,5);
         
         Rectangle rec = new Rectangle(punto1, punto3);
         
         System.out.println("Rectangle 1\n"+ rec);
         
         Rectangle rec2 = new Rectangle(6,3);
         
         System.out.println("\nRectangle 2\n"+ rec2);
         
         System.out.println("\nSuperficie rec1: "+ rec.getSuperficie());
         
         System.out.println("\nSuperficie rec2: "+ rec2.getSuperficie());
         
                
          rec.moverRectangulo(2,2);
          
           rec2.moverRectangulo(5,5);
         
         System.out.println("\nRectangulo1 movido\n "+ rec);
         
         System.out.println("\nRectangulo 2 movido\n "+ rec2);
         
        System.out.println("\nPunto cualquiera de un vertice de REC4" + rec.getPunt2()); 
        
        
    }
    
}
