
package pkg22_a01_intropaquets;

import java.util.ArrayList;
import pkg_utilitats.EntradaDades;
import pkg_utilitats.Utilitats;


public class MainClass {

    public static void main(String[] args) {

        int quantitatTreballadors = 5;
        ArrayList<String> noms = new ArrayList();
        ArrayList<Integer> altures = new ArrayList();
        ArrayList<Integer> edats = new ArrayList();

        System.out.println("\nPrograma per a gestionar edats i alçades");
        System.out.println(".........................................\n\n");

        //descomentar per provar el programa sense introduïr dades per teclat
/*      
        noms.add("Pepe");
        noms.add("Esther");
        noms.add("Manuel");
        noms.add("David");
        noms.add("Pepe");
        edats.add(22);
        edats.add(52);
        edats.add(22);
        edats.add(25);
        edats.add(22);
        altures.add(187);
        altures.add(173);
        altures.add(158);
        altures.add(173);
        altures.add(173);
      
*/
        //Entrem les dades
        //comentar per provar el programa sense introduïr dades per teclat
        EntradaDades.entrarNoms(quantitatTreballadors, noms);
        EntradaDades.entrarEdats(quantitatTreballadors, edats);
        EntradaDades.entrarAltures(quantitatTreballadors, altures);
      
        //Mostrem la taula de dades 
        Utilitats.mostrarTaula(noms, altures, edats);

        //Mostrar si tenim treballadors de la mateixa edat que un treballador
        Utilitats.trobarEdat(3, edats);
        
        //Mostrar si tenim treballadors de la mateixa edat
        Utilitats.trobarAlturaRepe(altures);

        System.out.println("................................................");

    }

}
