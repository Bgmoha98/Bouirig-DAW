/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a04_hivernacle;

/**
 *
 * @author mohab
 */
public abstract class Planta {

    public String nom;
    public int ALTURA_MAX;
    protected int altura;
    protected boolean esViva = true;

    public Planta(String nom, int ALTURA_MAX) {
        this.nom = nom;
        this.ALTURA_MAX = ALTURA_MAX;
    }

    public boolean getEsViva() {
        return esViva;
    }

    public abstract void creixer();

}
