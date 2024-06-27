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
public class Ex6 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double nota;

        //demanar dades
        System.out.println("Calificaciones");

        System.out.print("Introduce tu nota:  ");
        nota = entrada.nextDouble();


        if ( nota <5) {            
            System.out.println("Insuficiente: " + nota);            
        } else if (nota <= 5 || nota <6) {            
            System.out.println("Suficiente: " + nota);            
        } else if (nota <= 6 || nota <7) {            
            System.out.println("Bien: " + nota);            
        } else if (nota <= 7 || nota <9) {            
            System.out.println("Notable: " + nota);            
        } else if (nota <= 9 || nota <=10) {            
            System.out.println("Excelente: " + nota);            
        } else  {            
            System.out.println("Nota introducida incorrecta.");            
        }
        
        
        
        
        
        

    }

}
