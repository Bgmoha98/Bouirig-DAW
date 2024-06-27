/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles5;

/**
 *
 * @author mohab
 */
public class Bucles5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 6;
        System.out.println("\nEjercicio 5 \n");
        for (int numeroespacios = num, numeroasteriscos = 1; numeroasteriscos <= (num * 2) - 1; numeroespacios--, numeroasteriscos += 2) {
            //Espacios
            for (int i = 0; i < numeroespacios; i++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = numeroasteriscos; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\nEjercicio 6 \n");

        for (int numeroespacios = 0, numeroasteriscos = (num * 2) - 1; numeroasteriscos > 0; numeroespacios++, numeroasteriscos -= 2) {
            //Espacios
            for (int i = 0; i < numeroespacios; i++) {
                System.out.print(" ");
            }
            //Asteriscos
            for (int j = numeroasteriscos; j != 0; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
