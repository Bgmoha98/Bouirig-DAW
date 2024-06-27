package acces_fitxers;

import vista.Sortida;
import vista.Entrada;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLlibreria {

    File carpeta = new File("dades");
    File fichero = new File("dades/regLlibres.txt");

    public void crearFitxerSiNoExiste() {
        carpeta.mkdir(); // crea carpeta si no existe
        try {
            fichero.createNewFile(); // crea fichero, lo crea si no exsiste
        } catch (Exception ex) {
            System.out.println("Error, no se ha podido crear el fichero" + ex.getMessage());
        }

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
        ArrayList<String> llistaLlibres = new ArrayList<>();
        String libro = "";

        try (Scanner lector = new Scanner(fichero)) {

            lector.useDelimiter(";");

            while (lector.hasNext()) {

                libro = lector.next(); // isbn
                libro += ";" + lector.next() + ";";  //nombre libro
                libro += lector.next() + ";";     //autor
                libro += lector.nextInt() + ";"; // año

                llistaLlibres.add(libro);
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA " + ex.getMessage());
        }

        return llistaLlibres;
    }

    public String buscarLlibre(String isbn) {

        String libroEncontrado = "";
        try (Scanner lector = new Scanner(fichero)) {

            lector.useDelimiter(";");

            while (lector.hasNext()) {

                libroEncontrado = lector.next(); // isbn

                if (libroEncontrado.equals(isbn)) { // si es igual a isbn
                    libroEncontrado += ";" + lector.next() + ";";  //nombre libro
                    libroEncontrado += lector.next() + ";";     //autor
                    libroEncontrado += lector.nextInt() + ";"; // año
                    break;
                } else {

                    lector.next(); //nombre libro
                    lector.next(); //autor
                    lector.nextInt(); // año
                    libroEncontrado = "";
                }
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA  " + ex.getMessage());
        }
        return libroEncontrado;
    }

    public void inserirLlibre() {
        String isbn = Entrada.demanarIsbn("Introduce ISBN");
        String libro = buscarLlibre(isbn);
        try (FileWriter fw = new FileWriter(fichero, true)) {

            if (libro.length() > 0) {
                System.out.println("EXISTE");
            } else {
                fw.write(isbn + ";");
                fw.write(Entrada.demanarDadesLlibre());
            }

        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA " + ex.getMessage());
        }
    }

}
