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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Declarcion de variables
        int temperaturasFueraRango = 0;
        int temperaturaMaxima = -1;
        final int TEMPERATURAMENOR22 = 22;
        final int TEMPERATURAMAYOR28 = 28;
        // Temp Media declarada como double ya que tiene que tener decimales
        double temperaturaMedia = 0;

        // Declaracion array.
        int[] temperaturas = {28, 27, 29, 28, 27, 30, 29, 28, 29, 29, 28, 29, 30, 29, 30, 29, 28, 27, 29};

        // For donde recorro todo el array indicndo que si es menor de 22 se sume 1 a temperaturasFueraRango
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < TEMPERATURAMENOR22) {
                temperaturasFueraRango++;
            } else if (temperaturas[i] > TEMPERATURAMAYOR28) {
                temperaturasFueraRango++;
            }
        }

        // For donde recorre la longitud del array y busca el numero mas grande.
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }

        // For donde recorre todo el array sumando todas las temperaturas
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturaMedia += temperaturas[i];
        }

        // Print de los resultados
        System.out.printf("Se han registrado %d días fuera del rango óptimo\n", temperaturasFueraRango);
        System.out.printf("La temperatura máxima registrada es de %dºC\n", temperaturaMaxima);
        // divido el total de las temperaturas sumadas con la longitud del array.
        System.out.printf("La media es de %.1fºC\n", (temperaturaMedia / temperaturas.length));

    }

}
