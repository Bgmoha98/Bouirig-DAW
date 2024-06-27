/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex1;

/**
 *
 * @author mohab
 */
public class Cuenta {

    String titular;
    double cantidad;

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String ttular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double ingresar) {

        if (ingresar < 0) {
            System.out.println("Opración cancelada");
        } else {
            cantidad += ingresar;
        }
    }

    public void retirar(double retiro) {
        if ((cantidad - retiro) < 0) {
            cantidad = 0;
        } else {
            cantidad -= retiro;
        }
    }

}
