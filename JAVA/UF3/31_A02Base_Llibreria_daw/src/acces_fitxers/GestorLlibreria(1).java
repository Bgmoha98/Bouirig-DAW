package acces_fitxers;

import vista.Sortida;
import vista.Entrada;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLlibreria {
    
    //atributs d'instància File per al directori i el fitxer

    
    public void crearFitxerSiNoExiste() {

    }

    public String triarAccio() {

        return Entrada.demanarLiniaText(
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
                + "\nIntrodueix l'opció desitjada: \n"
                + "	1. Llistar tots els llibres \n"
                + "	2. Buscar llibre a partir de l'ISBN\n"
                + "	3. Inserir un nou llibre\n"
                + "	4. Sortir");
    }

    public ArrayList<String> getLlistaLlibres() {
     
    }

    public String buscarLlibre(String isbn) {
     
    }

    public void inserirLlibre() {
       
    }

}
