/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_a03_crearusuaripasw;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class CrearUsuariosMetodos {

    static String generadorContraseñas() {
        Random generador = new Random();
        String contraseña = "";
        String caracteres = ("abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        for (int i = 0; i < 8; i++) {
            int posiciones = generador.nextInt(caracteres.length() - 1);
            char caracterAleatorio = caracteres.charAt(posiciones);
            contraseña += caracterAleatorio;
        
        }
        return contraseña;
}
    
    static void generarUsuarios(int posicion,String[][] datos){
        Scanner teclado = new Scanner(System.in);
        for (int i = posicion; i < datos.length; i++) {
            
        }
    }
    
    
}
