package accesfitxerscaracter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        // creo un objecte de la classe EscripturaFitxers i de LecturaFitxers,
        // perquè els seus mètodes no són static (els cridaré des del nom de 
        // l'objecte escriptura i lectura, no desde EscripturaFitxers i LecturaFitxers)
        EscripturaFitxers escriptura = new EscripturaFitxers();
        LecturaFitxers lectura = new LecturaFitxers();

        // cadascun d'aquests objectes File és una ruta per arribar a un fitxer
        File textFile = new File("fitxers/text.txt");
        File intFile = new File("fitxers/enters.txt");
        File pacientsFile = new File("fitxers/pacients.txt");

        // crear els fitxers si no existeixen
        escriptura.crearFitxers(textFile, intFile, pacientsFile);

        //ESCRIPTURA 
        //
        System.out.println("Escriure text: " 
                + escriptura.escriureText(
                        "Atenció: això és una prova d'escriptura;", textFile));
                // fem servir ";" com a separador

        System.out.println("Escriure un enter: " 
                + escriptura.escriureInt(100, intFile));

        int[] nums = {3, 5, -23, 125, 8976};
        System.out.println("Escriure un array d'enters al fitxer d'enters: "
                + escriptura.escriureArray(nums, intFile));

        System.out.println("Escriure una persona: "
                + escriptura.escriurePacient(
                        "Maria", "López Fons", 21, "931111111", pacientsFile));

        //LECTURA
        //
        System.out.println("\n\nDADES LLEGIDES DELS FITXERS: \n");
        System.out.println(lectura.llegirFitxerText(textFile));
        
        System.out.println("Suma= " + lectura.sumarFitxer(intFile) + "\n");
        
        // no sé quants valors llegirà: no array normal
        ArrayList<Integer> valors = lectura.llegirEnters(intFile);
        System.out.println("Valors llegits: \n" + valors + "\n");

        lectura.llegirPersones(pacientsFile);
        
        // CERCAR PER 1 VALOR
        System.out.println("\n\n CERCAR PER 1 VALOR");
        System.out.println("Cercar pacients amb nom Maria");
        
        ArrayList<String> pacients = lectura.cercaPacientPerNom("Maria", pacientsFile);
        
        for(String pacient : pacients){
            System.out.println("\nPacient trobat: \n" + pacient);
        }
    }

}
