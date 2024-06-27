/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg51_a03_hashset_botiga;

import java.util.Objects;

/**
 *
 * @author mohab
 */
public class Joc {

    String nom;
    String desenvolupador;
    String categoria;

    public Joc(String nom, String desenvolupador, String categoria) {
        this.nom = nom;
        this.desenvolupador = desenvolupador;
        this.categoria = categoria;
    }

    public String getNom() {
        return nom;
    }

    public String getDesenvolupador() {
        return desenvolupador;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nom);
        hash = 43 * hash + Objects.hashCode(this.desenvolupador);
       // hash = 43 * hash + Objects.hashCode(this.categoria);
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
        final Joc other = (Joc) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.desenvolupador, other.desenvolupador)) {
            return false;
        }
       // if (!Objects.equals(this.categoria, other.categoria)) {
      //      return false;
      //  }
        return true;
    }

    @Override
    public String toString() {
        return "\n " + "nom: " + nom + ", desenvolupador: " + desenvolupador + ", categoria: " + categoria;
    }

}
