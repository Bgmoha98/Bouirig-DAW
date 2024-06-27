/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a02_classes_abstractes;
import java.math.*;

/**
 *
 * @author mohab
 */
public final class Cercle extends Figura {

    private double radi;

    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }

    @Override
    public double calcularPerimetre() {
        return 2*Math.PI*radi;
    }

    @Override
    public double CalcularArea() {
        return Math.PI*Math.pow(radi, 2);
    }
    
    public double getRadi() {
        return radi;
    }
    
    public void setRadi(double radi){
        this.radi = radi;
    }

    @Override
    public String toString() {
        return "Cercle -> " + "nom = " +super.getNom() + ", radi=" + radi + ", area = " + CalcularArea() + ", perimetre = " + calcularPerimetre();
    }
    
    

}
