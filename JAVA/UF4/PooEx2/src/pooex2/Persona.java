/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex2;

import java.util.Random;

/**
 *
 * @author mohab
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo = 'M';
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double calculoICM = peso / (altura * 2);
        
        if (calculoICM < 20) {
            return -1;
        } else if (calculoICM>= 20 || calculoICM<=25 ){
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(int edad){
        if (edad >= 18) {
            return true;
        } 
        return false;
    }
    
    public void comprobarSexo(char sexo){
        if (sexo == 'H') {
            this.sexo = sexo;
        } else if (sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H';
        }
    }
    
    public void generarDNI(){
        Random rand = new Random();
        
        for (int i = 0; i < 8; i++) {
           DNI += rand.nextInt(10);
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    

}
