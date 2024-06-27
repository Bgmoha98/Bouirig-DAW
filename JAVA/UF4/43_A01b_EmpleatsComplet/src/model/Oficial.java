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
public class Oficial extends Operari {
    
    public Oficial(String nom, String nif, String torn) {
        super(nom, nif, torn);
    }

    @Override
    public String toString() {
        return  super.toString() + " -> " + "Oficial";
    }
    
    
    
}
