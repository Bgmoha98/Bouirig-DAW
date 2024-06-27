/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouirigmohamed;

/**
 *
 * @author mohab
 */
public abstract class Robot {

    private String modelo;
    private int bateria;

    // Retorna el modelo
    public String getModelo() {
        return modelo;
    }

    // Modifica el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // retorna la bateria
    public int getBateria() {
        return bateria;
    }

    // modifica la bateria
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    // metodo abstracto
    public abstract void cargar();

    // sobreescribo el metodo toString
    @Override
    public String toString() {
        return "modelo: " + modelo + ", bateria:" + bateria;
    }

}
