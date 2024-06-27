/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a02_classes_abstractes;


import java.util.ArrayList;
import java.util.List;

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
        
        List<Figura> figures = new ArrayList<>();
        
        Cercle cercle = new Cercle("Circulo mediano", 3);
        Rectangle rectangle = new Rectangle("Rectangulo pequeño", 2, 4);
        Cercle cercle2 = new Cercle("Circulo pequeño", 1);
        Rectangle rectangle2 = new Rectangle("Rectangulo mediano", 5, 6);
        
        figures.add(cercle);
        figures.add(rectangle);
        figures.add(cercle2);
        figures.add(rectangle2);
        
        Figura circulo2 = new Cercle("Circulo pequeño2", 1.5);
        
        figures.add(circulo2);
        
        ((Cercle) circulo2).setRadi(7);
      
        
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
        
        System.out.println();
        if (figures.contains(rectangle)) {
            for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i));
        }
        }
        
        
    }
    
}
