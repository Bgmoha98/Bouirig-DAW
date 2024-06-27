package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilitats {

    public static void mostrarTaula(
            ArrayList<String> noms, ArrayList<Integer> altures, ArrayList<Integer> edats) {

        System.out.printf("%-15s%-15s%-15s \n", "NOM", "ALÇADA", "EDAT");
        for (int i = 0; i < noms.size(); i++) {
            System.out.printf("%-15s", noms.get(i));
            System.out.printf("%-15d", altures.get(i));
            System.out.printf("%-15d", edats.get(i));

            System.out.println();
        }

        System.out.println("\n");

    }

    public static void trobarEdat(int treballador, ArrayList<Integer> edats) {
        //treballador--;

        for (int i = 0; i < edats.size(); i++) {
            /*
        Només si els Integer són entre -128 i 127 (inclosos), funciona ==
        Però millor fer servir sempre equals o equivalent per evitar errors.
        
            if (i != treballador - 1 && edats.get(i) == edats.get(treballador - 1)) {
            
             */
            if (i != treballador - 1 
                    && edats.get(i).equals(edats.get(treballador - 1))) {
                System.out.printf("El treballador %d té la mateixa edat "
                        + "que el treballador %d\n", (i + 1), treballador);
            }
        }
        System.out.println("\n");
    }

    public static void trobarAlturaRepe(ArrayList<Integer> altura) {

        boolean trobat = false;

        //mentre i sigui menor que altura.size() i trobat val false
        for (int i = 0; i < altura.size() && !trobat; i++) {
            for (int j = i + 1; j < altura.size(); j++) {
                if (altura.get(i).equals(altura.get(j))) {
                    //if (altura.get(i).compareTo(altura.get(j)) == 0) {

                    System.out.printf("El treballador %d és igual d'alt "
                            + "que el treballador %d\n", i + 1, j + 1);
                    trobat = true;
                    break;
                }
            }
            /*
            if (trobat) {
                break;
            }  */
        }
        System.out.println("\n");
    }
}
