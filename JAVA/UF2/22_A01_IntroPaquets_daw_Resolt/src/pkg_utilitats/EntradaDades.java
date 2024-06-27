package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaDades {

    public static void entrarNoms(int num, ArrayList<String> noms) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix els noms: ");
        for (int i = 0; i < num; i++) {

            System.out.println("\nTreballador " + (i + 1) + ": ");
            System.out.print("Nom: ");

            noms.add(sc.next());
        }
    }

    public static void entrarEdats(int num, ArrayList<Integer> edats) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix les edats: ");
        for (int i = 0; i < num; i++) {

            System.out.println("\nTreballador " + (i + 1) + ": ");
            System.out.print("Edat: ");

            edats.add(sc.nextInt());
        }
    }

    public static void entrarAltures(int num, ArrayList<Integer> altures) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix les alçades: ");
        for (int i = 0; i < num; i++) {

            System.out.println("\nTreballador " + (i + 1) + ": ");
            System.out.print("Alçada: ");

            altures.add(sc.nextInt());
        }
    }

}
