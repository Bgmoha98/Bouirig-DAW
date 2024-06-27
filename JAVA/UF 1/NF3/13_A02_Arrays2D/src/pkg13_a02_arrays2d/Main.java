/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_a02_arrays2d;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] puntos = {
            {5, 3, 0, 14, 1},
            {0, 25, 2, 47, 100, 654},
            {0, 12, 4, 12}
        };
        
        System.out.println("Tamaño de array  = "+ puntos.length);
        System.out.println("Tamaño de fila1  = "+ puntos[0].length);
        System.out.println("Tamaño de fila2  = "+ puntos[1].length);
        System.out.println("Tamaño de fila3  = "+ puntos[2].length);
        
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos[i].length ; j++) {
                System.out.print( puntos[i][j] + "\t");
            }
            System.out.println("");
        }
        
    }

}
