/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_activitathashmap;

import java.util.Objects;

/**
 *
 * @author mohab
 */
public class Client {
    private String nif;
    private String nom;
    private String cognom;

    public Client(String nif, String nom, String cognom) {
        this.nif = nif;
        this.nom = nom;
        this.cognom = cognom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nif);
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
        final Client other = (Client) obj;
        if (!Objects.equals(this.nif, other.nif)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", cognom=" + cognom + ", nif=" + nif + '}';
    }
    
    
    
    
}
