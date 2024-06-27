/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a02_seleccio1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num1, num2, opcionMenu;
        
        System.out.println("*** CALCULADORA ***");
        
        System.out.println("Seleccione una opcion: "
        + "\n1: Suma"
        + "\n2: Resta"
        + "\n3: Multiplicacion"
        + "\n4: Division");
        opcionMenu = teclado.nextInt();
        
        if (opcionMenu > 0 && opcionMenu <5 ) {
            
            System.out.println("Introduce dos numeros para operar: ");
            num1 = teclado.nextInt();
            num2 = teclado.nextInt();
            
            switch (opcionMenu){
                case 1:
                    System.out.println("Suma = " + (num1 + num2));
                break;
                case 2:
                    System.out.println("Resta = " + (num1 - num2));
                break;
                case 3:
                    System.out.println("Multiplicacion = " + (num1 * num2));
                break;
                case 4:
                    if (num2 !=0){
                    System.out.println("Division = " + (num1 / num2));
                    }else {
                        System.out.println("No se puede dividir entre 0");
                    }
                        
            }
            
        } else {
            System.out.println("Error, menu seleccionado erroneo");
        }
        
        
    
    }
    
}
