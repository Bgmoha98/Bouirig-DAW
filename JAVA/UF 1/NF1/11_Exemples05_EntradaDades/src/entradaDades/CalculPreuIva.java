package entradaDades;

import java.util.Scanner;

public class CalculPreuIva {

    /* Es demana introduir un import sense IVA, 
    calcula l'import amb IVA i l'imprimeix. 
     */
    public static void main(String[] args) {

        //Declarar variables
        final double IVA;
        Scanner lector = new Scanner(System.in);
        double valor, valorAmbIva;

        //Demanar l'IVA en tant per cent
        System.out.println("Introduir l'IVA en %");
        IVA = lector.nextDouble() / 100;

        //Demanar l'import sense IVA
        System.out.println("Introduir import sense IVA:");
        valor = lector.nextDouble();

        //Fer el càlcul
       // valorAmbIva = valor * (1 + IVA);
         valorAmbIva = valor + valor * IVA;

        //Imprimir import amb IVA
        System.out.printf("Import amb IVA: %.2f€%n", valorAmbIva);
    }

}
