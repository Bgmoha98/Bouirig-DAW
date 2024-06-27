package pkg51_a01b_ipexcepcions_logs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestVerificaIp {

    public static void main(String[] args) {

        final Logger LOGGER = Logger.getLogger(TestVerificaIp.class.getName());

        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream(
                    "fitxers/configuracioLog.properties"));
        } catch (FileNotFoundException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        } catch (SecurityException ex) {
            LOGGER.log(Level.SEVERE, ex.getMessage());
        }

        VerificadorIp verificador = new VerificadorIp(); //gestió obligatòria (error "unreported...")
        // Mostra la pila de crides
        //el compilador no n'obliga la gestió
        // Mostra la pila de crides
        //Aquí també podria haver enregistrat amb LOGGER
        String ip = "123.222.44.23";
        System.out.println(ip + ": " + verificador.isIp(ip));
        ip = "aaa.222.44.23";
        System.out.println(ip + ": " + verificador.isIp(ip));
        ip = "222.44.23";
        System.out.println(ip + ": " + verificador.isIp(ip));

    }

}
