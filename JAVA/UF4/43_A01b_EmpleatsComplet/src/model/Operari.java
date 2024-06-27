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
public class Operari extends Empleat {

    protected String torn;

    public Operari(String nom, String nif, String torn) {
        super(nom, nif);
        this.torn = torn;
    }

    public String getTorn() {
        return torn;
    }
    
   
    @Override
    public String allToString() {
        return "Operari{" +super.allToString() + "torn=" + torn + '}';
    }

    @Override
    public String toString() {
        return super.toString() +" -> " + "Operari";
    }
    
    

}
