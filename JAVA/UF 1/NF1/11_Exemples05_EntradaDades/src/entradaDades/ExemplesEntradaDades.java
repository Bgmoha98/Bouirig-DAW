package entradaDades;

import java.util.Scanner;

public class ExemplesEntradaDades {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String paraula, linia;
        int dadaInt;
        double dadaDouble;
        char caracter;

        System.out.println("Introduir una paraula:");
        paraula = lector.next();

        System.out.println("paraula = " + paraula);

        lector.nextLine();  // Per buidar el buffer

        System.out.println("Introduir una cadena de text:");
        linia = lector.nextLine();
        System.out.println("linia = " + linia);

        System.out.println("Introduir un valor enter:");
        dadaInt = lector.nextInt();
        System.out.println("dadaInt = " + dadaInt);

        System.out.println("Introduir un valor real:");
        dadaDouble = lector.nextDouble();
        System.out.println("dadaDouble = " + dadaDouble);

        lector.nextLine();  // Per buidar el buffer

        System.out.println("Introduir una cadena de text:");
        linia = lector.nextLine();
        System.out.println("linia = " + linia);

        System.out.println("Introduir un caràcter:");
        caracter = lector.next().charAt(0);
        System.out.println("caracter = " + caracter);

    }

}
