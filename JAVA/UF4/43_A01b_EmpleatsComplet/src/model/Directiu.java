/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mohab
 */
public class Directiu extends Empleat {
    
    public Directiu(String nom, String nif) {
        super(nom, nif);
    }

    @Override
    public String toString() {
        return super.toString() + " -> "+ "Directiu" ;
    }
    
    
    
}
