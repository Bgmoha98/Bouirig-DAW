 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a06_dadesentrada1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ejercicio2 {

    public static void main(String[] args) {
                 Scanner teclado = new Scanner(System.in);
                 
                 double  calculoKmLitro;
                 double  consumoLitrosKm, consumoLitros,kmRecorridos;
                 int cien = 100;
                 
                 
                 System.out.println("Cuantos litros consume tu coche a los 100km?");
                 consumoLitros = teclado.nextDouble();
                 
                 System.out.println("Cuantos KM hay hacia tu destino?");
                 kmRecorridos = teclado.nextInt();
                 
                 consumoLitrosKm =kmRecorridos / cien   * consumoLitros ;
                 //System.out.println(consumoLitrosKm);
                 calculoKmLitro = consumoLitros / cien;
                 
                 System.out.printf(" Has recorrido %.0f km y tu motor consume %.1f litros por cada 100km (%.1f): En total consumiras %.1f litros\n ", kmRecorridos, consumoLitros, calculoKmLitro, consumoLitrosKm);
    }
}
