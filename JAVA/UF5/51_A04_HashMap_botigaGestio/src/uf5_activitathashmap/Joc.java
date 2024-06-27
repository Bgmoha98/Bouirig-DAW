package uf5_activitathashmap;

import java.util.Objects;

public class Joc {

    private String nom;
    private String desenvolupador;
    private String categoria;

    public Joc(String nom, String desenvolupador, String categoria) {
        this.nom = nom;
        this.desenvolupador = desenvolupador;
        this.categoria = categoria;
    }

    public String getNom() {
        return nom;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nom);
        hash = 17 * hash + Objects.hashCode(this.desenvolupador);
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
        return true;
    }

    @Override
    public String toString() {
        return "\n- " + nom + " (" + desenvolupador + ", " + categoria + ")";
    }

}
