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
public class Ex5 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String dias, tipoDia;
        
        System.out.println("Introduce un dia de la semana: ");
        dias = teclado.next().toUpperCase();
        
        switch (dias) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                tipoDia = "laborable";
            break;
            
            case "SABADO":
            case "DOMINGO":
                tipoDia = "no laborable";
            break;
            
            default:
                tipoDia = "incorrecto";
                
        }
        
        System.out.println("El día introducido es : " + tipoDia);
        
    }
    
}
