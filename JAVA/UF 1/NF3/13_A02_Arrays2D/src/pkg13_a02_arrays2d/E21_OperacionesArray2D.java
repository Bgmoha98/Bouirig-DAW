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
public class E21_OperacionesArray2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] numeros = new int[3][5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = 7;
            }

        }

        for (int i = 0; i < numeros[0].length; i++) {
            numeros[0][i] *= numeros[0][i];

        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i][0] *= numeros[i][0];

        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("");
        }

    }

}
