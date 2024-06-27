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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creo el array list de ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        
        // Realizo 4 llamadas al Metodo añade Ciudad y le paso el nombre de la ciudad y el arraylist
        MetodosEx1.añadeCiudad("Barcelona", ciudades);
        MetodosEx1.añadeCiudad("Barcelona", ciudades);
        MetodosEx1.añadeCiudad("Girona", ciudades);
        MetodosEx1.añadeCiudad("Cerdanyola", ciudades);
        
        
        
        // Muestro el arraylist invertido
       MetodosEx1.imprimirCiudades(ciudades);
    }
    
}
