package pkg43_a04_hivernacle;

import java.util.ArrayList;
import java.util.List;

public class HivernacleTest {

    public static void main(String[] args) {
        Hivernacle hort = new Hivernacle(10);
        
        hort.afegirPlanta(new AmbFruits("Maduixera1", "Maduixa", 2, 3, 2, 4));
        hort.afegirPlanta(new AmbFruits("Tomaquera1", "Tomaquet", 3, 6, 2, 7));
        
        hort.afegirPlanta(new SenseFruits("Espinacs", 4, 5));
        hort.afegirPlanta(new SenseFruits("Enciam", 6, 8));
        
        for (int i = 0; i < 3; i++) {
            hort.passarTemps();
        }
        
        System.out.println("\n****** Hort setmana 3, abans de collir:\n" + hort);
        System.out.println("COLLITA setmana 3: \n" + hort.collirFruits());
        
        System.out.println("\n****** Hort setmana 3, després de collir:\n" + hort);

        for (int i = 0; i < 3; i++) {
            hort.passarTemps();
        }

        System.out.println("\n****** Hort setmana 6, abans de collir:\n" + hort);
        System.out.println("COLLITA setmana 6: " + hort.collirFruits());
        
        System.out.println("\n****** Hort setmana 6, després de collir:\n" + hort);
        
        
        System.out.println("\nPLANTES MORTES TRETES setmana 6: \n" + hort.treurePlantesNoVives());
        
        System.out.println("\n****** Hort setmana 6, després de netejar:\n" + hort);
    }

}
