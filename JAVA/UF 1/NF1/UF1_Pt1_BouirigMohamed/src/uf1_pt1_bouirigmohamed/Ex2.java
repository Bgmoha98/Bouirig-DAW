/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_bouirigmohamed;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex2 {

    public static void main(String[] args) {
        
        // Declaro Scanner
        Scanner teclado = new Scanner(System.in);
        
        // Declaro las variables necesarias
        double ventasEnero, ventasFebrero, ventasMarzo, comisionTrimestre;
        boolean derechoComision;
        String subcontrata;
        
        // Pregunto al usuario por teclado los valores
        System.out.println("Cuanto has vendido en Enero? ");
        ventasEnero = teclado.nextDouble();

        System.out.println("Cuanto has vendido en Febrero? ");
        ventasFebrero = teclado.nextDouble();

        System.out.println("Cuanto has vendido en Marzo? ");
        ventasMarzo = teclado.nextDouble();

        teclado.nextLine(); // Limpio el buffer

        System.out.println("Nombre de la empresa subcontrata? ");
        subcontrata = teclado.nextLine();
        
        // Operacion para mostrar el 10% del trimestre. 
        // Lo multiplico directamente por 0,10 ya que eslo mismo * 10 y luego / 100
        comisionTrimestre = (ventasEnero + ventasFebrero + ventasMarzo) * 0.10;
        
        // En el booleando digo que si el valor de enero es mayor que 15000 -
        // - Directamente devuelve true y si tiene derecho a comision
        // Si sale false pasaria a preguntar si algun mes ha vendido menos de 800
        // Entonces si un mes vende menos de 800 sale false y no tendria derecho a comision
        derechoComision = ventasEnero > 15000 || ventasEnero < 800
                && ventasFebrero < 800 && ventasMarzo < 800;

        
        
        // Muestro los printf por consola

        System.out.println("Ventas: ");

        System.out.printf("%8.2f€ Enero %n%8.2f€ Febrero %n%8.2f€ Marzo"
                , ventasEnero, ventasFebrero,ventasMarzo);


        System.out.printf("%n10%% del trimestre: %.2f€ (%s)"
                , comisionTrimestre,subcontrata);

        System.out.printf("%nTiene derecho a Comisión trimestral? %b%n"
                , derechoComision);

    }

}
