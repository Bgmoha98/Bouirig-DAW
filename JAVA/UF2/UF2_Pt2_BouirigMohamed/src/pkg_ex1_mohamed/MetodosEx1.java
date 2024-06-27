/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_ex1_mohamed;

import java.util.ArrayList;

/**
 *
 * @author mohab
 */
public class MetodosEx1 {
    
    
    public static void añadeCiudad(String ciudad, ArrayList<String> ciudades){
    boolean avanza = true;
    // al array le añado la ciudad
    ciudades.add(ciudad);
    // Recorro el tamaño del arraylist y le digo que si la ciudad es igual a la anterior que muestre un mensaje de error
    // y que elimine la ciudad del array y por ultimo pasamos el booleano de trua a false
        for (int i = 1; i < ciudades.size(); i++) {
            if (ciudad.equals(ciudades.get(i-1))) {
                System.out.println("Error: Tienes que avanzar a otra ciudad");
                ciudades.remove(ciudad);
                avanza = false;
            } 
            
        }
        // Imprimimos un mensaje con el booleano
        System.out.println(avanza);  
    }
    
    // Recorre el array desde la ultima posicion y le voy restando 1 cada vez que hace una vuelta
    public static void imprimirCiudades(ArrayList<String> ciudades){
        for (int i = ciudades.size() - 1 ; i < ciudades.size(); i--) {
            System.out.println(ciudades.get(i));
        }
    }
}
