/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_exemple1_c_loteriaprimitiva;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Main {

    static int entradaNum() {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Introduir un valor enter i positiu:");
        while (true) {
            if (!teclado.hasNextInt()) {
                System.out.println("valor incorrecte. Torna-hi");
                teclado.next();

            } else {
                valor = teclado.nextInt();
                if (valor > 0) {
                    break;
                } else {
                    System.out.println("valor incorrecte. Torna-hi");
                }
            }

        }
        return valor;
    }
    
    static double calcularFactorial(int valor){
        double factorial = 1;
        for (int i = 1; i <= valor; i++) {
              factorial = i * factorial;
        
        }
        return factorial;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        int valorm = entradaNum();
        int valorn = entradaNum();
        
        double factorialM = calcularFactorial(valorm);
        double factorialN = calcularFactorial(valorn);
        double factorialMN = calcularFactorial(valorm - valorn );
        
        System.out.println("Factorial M     " + factorialM);
         System.out.println("Factorial N    " + factorialN);
          System.out.println("Factorial M - N    " + factorialMN);
        
          System.out.print("El resultado es: ");
        System.out.print(factorialM / (factorialN * (factorialMN)));
        System.out.println("");
    }

}
