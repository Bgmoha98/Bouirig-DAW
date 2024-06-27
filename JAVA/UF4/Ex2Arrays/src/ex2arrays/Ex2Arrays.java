/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2arrays;

import java.util.Scanner;
import newpackage.Ex2;

/**
 *
 * @author mohab
 */
public class Ex2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ex2 datos = new Ex2();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño deseado para el  Array");
        int num = teclado.nextInt();
        
        int [] numeros = new int[num];
        
        datos.rellenarDatos(numeros);
        
        datos.mostrarDatos(numeros);
    }
    
}
