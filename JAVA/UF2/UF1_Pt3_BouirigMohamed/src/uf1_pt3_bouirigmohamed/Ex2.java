/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt3_bouirigmohamed;

/**
 *
 * @author mohab
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion variables
        boolean encontrado = false;
        // declaracion array
        int[][] numeros = {
            {1, 3, 3, 2},
            {5, 5, 3, 1},
            {2, 4, 6, 6}
        };

       
        // recorre y imprime array
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }
        
        // multiplica la fila 3 por 2
        for (int i = 0; i < numeros[2].length; i++) {
            numeros[2][i] *= 2;
        }

        for (int i = 0; i < numeros[1].length; i++) {
            System.out.print("Buscando el  " + numeros[1][i]);
            System.out.println("");
            for (int j = 0; j < numeros[0].length; j++) {
                if (numeros[0][j] == numeros[1][i]) {
                    System.out.println("encontrado en la columna " + numeros[0][j]);
                    
                    break;
                }

            }
            
        }
        
    }

}
