/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a02_classes_abstractes;

/**
 *
 * @author mohab
 */
public class Rectangle extends Figura {

    private double amplada;
    private double altura;

    public Rectangle(String nom, double amplada, double altura) {
        super(nom);
        this.amplada = amplada;
        this.altura = altura;
    }

    @Override
    public final double calcularPerimetre() {
        return (amplada*2) + (altura*2);
    }

    @Override
    public final double CalcularArea() {
        return amplada * altura;
    }

    public double getAmplada() {
        return amplada;
    }

    public void setAmplatada(double ancho) {
        amplada = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alto) {
        altura = alto;
        
    }

    @Override
    public String toString() {
        return  "Rectangle -> " + " nom = " + super.getNom()  + ", amplada=" + amplada + ", altura=" + altura + ", area = " + CalcularArea() + ", perimetre = " + calcularPerimetre();
    }
    
    
}
