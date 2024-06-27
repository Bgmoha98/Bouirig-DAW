/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a02_classes_abstractes;

/**
 *
 * @author mohab
 */
public abstract class Figura {
    
    private String nom;
    
    public Figura(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return nom;
    }
    
    public abstract double calcularPerimetre();
    
     public abstract double CalcularArea();
}
