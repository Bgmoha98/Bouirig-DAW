package accesfitxerscaracter;

import java.io.File;
import java.io.FileWriter;

public class EscripturaFitxers {

    // tots els fitxers es crearan a la carpeta fitxers (és a l'arrel del projecte)
    final File DIRECTORI = new File("fitxers"); 

    void crearFitxers(File textFile, File intFile, File pacientsFile) {

        DIRECTORI.mkdir(); // només crea el directori si no existeix

        try {

            /* El codi que crea el fitxer ha d'estar dins del bloc try, així al 
               catch hi podem tractar possibles errors
             */
            // El mètode createNewFile() només crea el fitxer si no existeix
            textFile.createNewFile();
            intFile.createNewFile();
            pacientsFile.createNewFile();
            
            //Com a prova, torno a crear el directori (normalment no ho faré)
            DIRECTORI.mkdir(); // Veig que no sobreescriu el directori ni dóna error

        } catch (Exception ex) {
            System.err.println("ERROR al crear el fitxer: " + ex.getMessage());;
        }
    }

    boolean escriureText(String text, File file) {
        boolean escrit;

        /* TRY WITH RESOURCES
        Els recursos que s'han d'obrir es declaren dins del parèntesi del try.
        En quan s'acaba d'executar el bloc de sentències del try, aquests recursos 
        es tanquen automàticament. 
        
        Aquí obrim el fitxer file com a recurs del try al crear l'objecte escriptor,
        que és de tipus FileWriter. I es tanca automàticament després d'intentar 
        escriure-hi.
        */
        
        // L'argument true que passo a FileWriter() vol dir que escriurà al final 
        // del contingut actual de file. (Indica que append = true)
        try (FileWriter escriptor = new FileWriter(file, true)) {
            
            escriptor.write(text);
            escrit = true;
            
        } catch (Exception ex) {
            escrit = false;
            System.err.println("ERROR D'ESCRIPTURA text: "
                    + ex.getMessage());
        }
        return escrit;
    }

    boolean escriureInt(int valor, File file) {
        boolean escrit;

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (FileWriter escriptor = new FileWriter(file, true)) {
            //escriptor.write(valor + "\r\n");  // salt de línia per separar
            escriptor.write(valor + " "); // fem servir espai per separar els enters
            escrit = true;
            
        } catch (Exception ex) {
            escrit = false;
            System.err.println("ERROR D'ESCRIPTURA enter: "
                    + ex.getMessage());
        }
        return escrit;
    }

    boolean escriureArray(int[] valors, File file) {
        boolean escrit;

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (FileWriter escriptor = new FileWriter(file, true)) {
            
            for (int i = 0; i < valors.length; i++) {
                escriptor.write(valors[i] + " ");
            }
            
            escrit = true;
            
            /*UNA ALTRA MANERA DE FER-HO: 
            (si no comento aquest codi, estic tornant a escriure-ho al fitxer)
            
             Com que no necessito el valor de l'índex i, i vull recorrer tot 
             l'array, puc fer-ho així:
             */
            for (int num : valors) { // Per cada enter (al que li dic num) 
                                     // que hi ha a l'array valors, fer:
                
                escriptor.write(num + " ");
            }
            
            escrit = true;
            
        } catch (Exception ex) {
            escrit = false;
            System.err.println("ERROR D'ESCRIPTURA array: "
                    + ex.getMessage());
        }
        return escrit;
    }

    boolean escriurePacient(String nom, String cognoms, int edat,
            String telefon, File f) {
        
        boolean escrit;

        // TRY WITH RESOURCES: el fitxer file es tanca automàticament
        try (FileWriter escriptor = new FileWriter(f, true)) {
            
            // fem servir ":" com a separador de dades
            escriptor.write(nom + ":");
            escriptor.write(cognoms + ":");
            escriptor.write(edat + ":");
            escriptor.write(telefon + ":");

            escrit = true;

        } catch (Exception ex) {
            escrit = false;
            System.err.println("ERROR D'ESCRIPTURA pacient: "
                    + ex.getMessage());
        }

        return escrit;
    }

}
