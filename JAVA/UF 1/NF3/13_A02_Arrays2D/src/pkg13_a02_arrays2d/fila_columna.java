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
public class fila_columna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [][] posiciones = new String [4][4];
        
        for (int i = 0; i < posiciones.length; i++) {
            for (int j = 0; j < posiciones[i].length; j++) {
                posiciones[i]  [j] = " Fila " + i + " Columna" + j;
            }
        }
        
        for (int i = 0; i < posiciones.length; i++) {
            for (int j = 0; j < posiciones[i].length; j++) {
                System.out.print(posiciones[i]  [j]);
            }
            System.out.println("");
        }
        
    }
    
}
