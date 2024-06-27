/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_aplicacio;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String seleccionMenu;
        System.out.println("Selecciona una opcio:"
                + "\n1. Llistar tots els llibres"
                + "\n2. Buscar llibre a partir de l'ISBN"
                + "\n3. Inserir un nou llibre"
                + "\n4. Sortir");

        switch (seleccionMenu = teclado.next()) {

            case "1":
                break;

            case "2":
                break;

            case "3":
                break;

            case "4":
                break;

            default:
                System.out.println("Oppcio no valida.");

        }
    }

}
