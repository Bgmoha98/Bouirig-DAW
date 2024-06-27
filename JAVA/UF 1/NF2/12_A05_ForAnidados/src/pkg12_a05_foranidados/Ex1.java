/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a05_foranidados;

/**
 *
 * @author mohab
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("i:" + contador++);
            for (int j = 1; j <= 10; j++) {
                System.out.print(" *" + j);
            }
            System.out.println("");
        }
    }

}
