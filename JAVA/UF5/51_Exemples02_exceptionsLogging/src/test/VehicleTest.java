package test;

import exempleLog.DadesVehicleException;
import exempleLog.GestioVehicle;
import exempleLog.Vehicle;
import exempleLog.VehicleException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class VehicleTest {

    public static void main(String[] args) {

        final Logger LOGGER = Logger.getLogger(VehicleTest.class.getName());

        GestioVehicle gv;

        LogManager logManager = LogManager.getLogManager();

        try {
            logManager.readConfiguration(new FileInputStream(
                    "fitxers/configuracioLog.properties"));
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (SecurityException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        /*
        Puc crear l'objecte GestioVehicle abans o després de carregar 
        la configuració dels Logger:
        */
        gv = new GestioVehicle();

        /*
        Aquest codi crida a mètodes que llancen excepcions però no les capturen
        així que les he de capturar aquí, per a que el programa no "peti"
        */
        try {
            //vehicle correcte
            gv.afegir(new Vehicle("AAA1234", "marca1", "mode1", LocalDate.of(2021, 10, 30)));

            //intentem afegir un vehicle amb dades no vàlides
            gv.afegir(new Vehicle("BBB1234", "", "mode1", LocalDate.now()));

            /*
            La línia anterior llança una excepció (DadesVehicleException), 
            així que no s'executarà la resta de codi del try: 
               el següent vehicle no s'arriba a afegir
            */
            //vehicle amb matrícula ja existent
            gv.afegir(new Vehicle("AAA1234", "marca2", "mode2", LocalDate.now()));

        } catch (DadesVehicleException ex) { //el compilador no n'obliga la gestió
            System.err.println(ex.getMessage());
            ex.printStackTrace(); // Mostra la pila de crides
            //Aquí també podria haver enregistrat amb LOGGER
            
        } catch (VehicleException ex) {//gestió obligatòria (error "unreported...")
            LOGGER.log(Level.WARNING, "-->>>Això ja ha sortit: " + ex.getMessage(), ex);
            ex.printStackTrace(); // Mostra la pila de crides
        }

        System.out.println("VEHICLES: \n" + gv.getVehicles());
    }

}