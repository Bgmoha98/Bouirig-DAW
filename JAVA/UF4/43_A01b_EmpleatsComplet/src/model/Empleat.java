/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author mohab
 */
public class Empleat {

    private String nom;
    private String nif;

    public Empleat(String nom, String nif) {
        this.nom = nom;
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }
    
    public String getNif() {
        return nif;
    }
    
    public String allToString() {
        return "Empleat{" + "nom=" + nom + ", nif=" + nif + '}';
    }

    @Override
    public String toString() {
        return "Empleat/da" + " " + nom;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nif);
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
      //  if (getClass() != obj.getClass()) {
      //      return false;
      //  }
        final Empleat other = (Empleat) obj;
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }
    
    

}
