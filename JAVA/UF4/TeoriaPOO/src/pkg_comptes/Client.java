/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_comptes;

/**
 *
 * @author mohab
 */
public class Client {

    private String nombre;
    private String dni;

    public Client(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNom() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNom(String nom) {
        nombre = nom;
    }

    @Override
    public String toString() {
        return " (" + "nombre = " + nombre + ", DNI = " + dni + ") ";
    }

}
