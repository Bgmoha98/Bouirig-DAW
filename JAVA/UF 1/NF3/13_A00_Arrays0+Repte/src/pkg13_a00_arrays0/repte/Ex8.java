/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_a00_arrays0.repte;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] edats = new int[10];
        int edadComparar;
        boolean hiHaEdad = false;
        Scanner lector = new Scanner(System.in);
        

        System.out.println("Introduce la edad de 10 personas:");

        for (int i = 0; i < 10; i++) {
            edats[i] = lector.nextInt();
        }

        System.out.println("Introduce otra edad a comparar: ");
        edadComparar =   lector.nextInt();
        
        for (int i = 0; i < edats.length; i++) {
            if (edadComparar == edats[i]) {
                hiHaEdad = true;
                break;
            } 
        }
        
        if (hiHaEdad) {
            System.out.println("La edad introducida (" + edadComparar+ ") existe en el array");
        } else {
            System.out.println("La edad introducida  (" + edadComparar+ ")  no existe en el array");
        }
        
    }

}
