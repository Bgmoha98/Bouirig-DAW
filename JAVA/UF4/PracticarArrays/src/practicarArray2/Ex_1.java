/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarArray2;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex_1 {
    
    int tamanyo = 10;
    
    int [] array = new int[tamanyo];
    
    public void rellenarArray(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 10 numeros:");
        for (int i = 0; i < tamanyo; i++) {
            array[i]= teclado.nextInt();
            
        }
    }
    
    public void mostrarValores(){
            for (int i = 0; i < array.length; i++) {
                System.out.println("En la posicion " + i + " esta el siguiente valor: " + array[i] );
        }
    }
    
}
