/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a06_bucles3_validar;

import java.util.Scanner;

/**
 *
 * @author Moha
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        String contrasenya;
        
        
        while (seguir) {
            System.out.print("Introduce tus credenciales :");
            contrasenya = teclado.next();
            if (contrasenya.equals("BONDIA!")) {
                System.out.println("CONTRASEÑA CORRECTA");
                seguir = false;
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }

    }

}
