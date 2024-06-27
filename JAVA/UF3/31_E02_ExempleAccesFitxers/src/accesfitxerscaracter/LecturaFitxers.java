package accesfitxerscaracter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LecturaFitxers {

    String llegirFitxerText(File file) {
        String dades = "";

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(file)) {

            // hasNextLine(): Per evitar error quan arribem al final del fitxer 
            // (mentre hasNextLine() retorna true, és que encara no estem al final)
            while (lector.hasNextLine()) {
                
                // No hem escrit salts de linia al fitxer, tots els textos escrits 
                // són en 1 única línia: amb un nextLine() ja llegeix tot el fitxer
                dades = lector.nextLine() + "\n";
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA text: " + ex.getMessage());
        }
        return dades;
    }

    ArrayList<String> llegirFitxerTextArray(File file) {
        ArrayList<String> dades = new ArrayList<>();

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(file)) {

            while (lector.hasNextLine()) {
                dades.add(lector.nextLine());
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA: " + ex.getMessage());
        }
        return dades;
    }

    long sumarFitxer(File file) {
        long suma = 0;

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(file)) {
            
            while (lector.hasNextInt()) { // mentre no arriba a final de fitxer:
                suma += lector.nextInt(); 
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA enter: " + ex.getMessage());
        }
        return suma;
    }
    
    ArrayList<Integer> llegirEnters(File f) {
        
        // no array normal perquè no sé quants valors llegiré
        ArrayList<Integer> nums = new ArrayList();

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(f)) {
            
            while (lector.hasNextInt()) { // mentre no arriba a final de fitxer:
                nums.add(lector.nextInt());
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA enter: " + ex.getMessage());
        }
        return nums;
    }

    void llegirPersones(File f) {

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(f)) {
            
            lector.useDelimiter(":"); // next() llegeix fins que troba ":", no " "

            while (lector.hasNext()) { // mentre no arriba a final de fitxer:
                System.out.println("NOM és " + lector.next());
                System.out.println("COGNOMS és " + lector.next());
                System.out.println("EDAT és " + lector.nextInt());
                System.out.println("TELEFON és " + lector.next());
                System.out.println("--------------------\n");
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA: " + ex.getMessage());
        }
    }

    ArrayList<String> cercaPacientPerNom(String nom, File file) {

        // Hi guardaré tots els pacients que coincideixin amb la cerca:
        ArrayList<String> resultats = new ArrayList();
        
        String dadesPacient = "";
        
        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (Scanner lector = new Scanner(file)) {

            lector.useDelimiter(":");  // next() llegeix fins que troba ":", no " "

            while (lector.hasNext()) { // mentre no arriba a final de fitxer:
                
                dadesPacient = lector.next(); // el 1r valor és el del nom
                if (dadesPacient.equalsIgnoreCase(nom)) {// si l'he trobat, guardar dades
                    
                    // afegeix totes les dades del pacient a dadesPacient, 
                    // amb ":" com a separador
                    dadesPacient += ":" + lector.next() + ":";  //cognoms
                    dadesPacient += lector.nextInt() + ":";     //edat
                    dadesPacient += lector.next() + ":";        //telefon
                    
                    resultats.add(dadesPacient);

                } else { 
                    // llegir la resta de dades del pacient actual per
                    // arribar fins just abans del nom del següent.
                    lector.next();
                    lector.nextInt();
                    lector.next();
                }
            }
        } catch (Exception ex) {
            System.err.println("ERROR DE LECTURA pacient: " + ex.getMessage());
        }

        return resultats;
    }
}
