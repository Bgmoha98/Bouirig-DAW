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
public class Ex4 {

    public static void main(String[] args) {

        double costat1, costat2, costat3;
        Scanner entrada = new Scanner(System.in);

        //demanar dades

        System.out.println("mida costat 1 (en cm): ");
        costat1 = entrada.nextDouble();

        System.out.println("mida costat 2 (en cm): ");
        costat2 = entrada.nextDouble();

        System.out.println("mida costat 3 (en cm): ");
        costat3 = entrada.nextDouble();

        //determinar si es pot construir i si és equilàter 
        if (costat1 <= 0 || costat2 <= 0 || costat2 <=0) {
                System.out.println("Las tres medidas han de ser superior a 0");
                
        } else if ((costat1 + costat2) > costat3 && (costat2 + costat3) > costat1
                && (costat1 + costat3) > costat2) {
            System.out.println("Es posible formar un triangulo. ");
        } else {

            System.out.println("No es posible formr un triangulo.");
        }
        {
        }

    }
}
