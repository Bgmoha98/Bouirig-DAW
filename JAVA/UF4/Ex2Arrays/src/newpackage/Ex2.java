/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Random;

/**
 *
 * @author mohab
 */
public class Ex2 {
    
    private int suma =0;
    
    public void rellenarDatos(int array[]){
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
    }
    
    public void mostrarDatos(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posicion " + i + " se encuentra el valor:  " + array[i]);
            suma += array[i];
        }
        
        System.out.println("La suma de todos los valores es: " + suma);
    }
    
    
}
