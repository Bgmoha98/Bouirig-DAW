/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_a04_formatsortida1;

/**
 *
 * @author esther
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char miLletraInicial = 'G';
        int miEdat = 33;
        float miAlçada = 1.85f;
        String miCiutat = "Barcelona";
        boolean agradaFutbol = false;
        
        System.out.println("La meva lletra és " + miLletraInicial);
        System.out.println("La meva edat és " + miEdat);
        System.out.println("La meva alçada és " + miAlçada);
        System.out.println("La meva ciutat és " + miCiutat);
        System.out.println("El futbol m'agrada és " + agradaFutbol);
        
        System.out.println();
        
        System.out.printf("La meva lletra és %c\n", miLletraInicial);
        System.out.printf("La meva edat és %d\n", miEdat);
        System.out.printf("La meva alçada és %f\n", miAlçada);
        System.out.printf("La meva ciutat és %s\n", miCiutat); 
        System.out.printf("1 => El futbol m'agrada és %b\n", agradaFutbol);
        System.out.printf("2 => El futbol m'agrada és %B\n", agradaFutbol);
            }
    
}
