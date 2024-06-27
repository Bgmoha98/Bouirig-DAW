package entradaDades;

import java.util.Scanner;

public class Rectangle {

    /* Programa que demana la base i l'altura d'un retangle,
calcula l'àrea i el perímetre i els imprimeix per pantalla
     amb dues xifres decimals.
     */
    public static void main(String[] args) {

        //Declarar variables
        double base, altura, area, perimetre;
        Scanner lector = new Scanner(System.in);

        //Demanar les dades guardant-les a les variables
        System.out.println("Introduir base:");
        base = lector.nextDouble();
        System.out.println("Introduir l'altura:");
        altura = lector.nextDouble();

        //Fer els càlculs
        area = base * altura;
        perimetre = 2 * (base + altura);

        //Imprimir els resultats
        System.out.printf("àrea= %.2f%nperímetre= %.2f%n",
                area, perimetre);

    }

}
