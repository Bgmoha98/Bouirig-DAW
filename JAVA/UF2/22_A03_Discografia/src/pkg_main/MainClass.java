/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_main;

import pkg_aplicacio.Discografia;
import pkg_utilitats.GestorEntrada;

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
        Discografia discografia = new Discografia();
        boolean sortir = false;
        
        do {
            
            switch (discografia.opcionesMenu()) {
                case "1":
                    discografia.introducionCantantesDiscos();
                    discografia.listarCantantesDiscos();
                    break;
                case "2":
                    discografia.listarCantantesDiscos();
                    break;
                case "3":
                    discografia.eliminarCantantesDiscos();
                    discografia.listarCantantesDiscos();
                    break;
                case "4":
                    discografia.actualizarDiscos();
                    discografia.listarCantantesDiscos();
                    break;
                case "5":
                    sortir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
            
        } while (!sortir);
    }
    
}
