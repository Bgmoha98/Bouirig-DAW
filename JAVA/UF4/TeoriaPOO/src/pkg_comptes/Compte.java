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
public class Compte {

    private long numero;
    private Client client;
    private float saldo = 0.0F;
    private float interesAnual;

    public Compte(long numero, Client client, float interesAnual) {
        this.numero = numero;
        this.client = client;
        this.interesAnual = interesAnual;
    }
    
    public Compte(long numero) {
        this.numero = numero;
    }
    

    public long getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(float interes) {
        interesAnual += interes;
    }

    public void ingresar(float cantidad) {
        saldo += cantidad;
    }

    public boolean reintegrar(float cantidad) {
        boolean reintegrado = false;

        if (saldo > cantidad) {
            saldo -= cantidad;
            reintegrado = false;
        }

        return reintegrado;
    }

    @Override
    public String toString() {
        return "Compte(" + "numero =" + numero + ", client =" + client
                + ", saldo=" + saldo + ", interesAnual=" + interesAnual + ")";
    }

}
