/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_pt1_bouirigmohamed;

import java.util.Objects;

/**
 *
 * @author mohab
 */
public class Futbolista {
    
    // Atributos necesarios
    private String nom;
    private String posicio;
    private int numeroSamarreta;

    // Constructor solicitado con el nombre, posicion y numero de camiseta.
    public Futbolista(String nom, String posicioJoc, int numeroSamarreta) {
        this.nom = nom;
        this.posicio = posicioJoc;
        this.numeroSamarreta = numeroSamarreta;
    }
    
    
    // GETTERS Y SETTERS (Donde devuelvo el atributo o modifico el atributo)
    public String getNom(){
    return nom;
    }
    
    public String getPosicio(){
    return posicio;
    }
    
     public void setPosicio(String posicio){
     this.posicio = posicio;
    }
     
    public int getNumeroSamarreta(){
    return numeroSamarreta;
    }

    
    // Genero hashcode y equals indicando que los valores a tener en cuenta si son iguales es el nombre y numero camiseta
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + this.numeroSamarreta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Futbolista other = (Futbolista) obj;
        if (this.numeroSamarreta != other.numeroSamarreta) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }
    
    
    // Genero toString como en el ejemplo de salida del examen
    @Override
    public String toString() {
        return "\n-  "+ nom + "( numero " + numeroSamarreta+ ", " + posicio  + ")";
    }
    
    
    
    
}
