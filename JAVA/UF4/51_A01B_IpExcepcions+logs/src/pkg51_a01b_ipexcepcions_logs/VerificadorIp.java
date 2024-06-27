package pkg51_a01b_ipexcepcions_logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VerificadorIp {

    private static final Logger LOGGER = Logger.getLogger(VerificadorIp.class.getName());

    public boolean stringToInt(String partIp) {
        boolean esEnter;
        try {
            Integer.parseInt(partIp);
            esEnter = true;

        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, " no és un enter: " + e.getMessage());
            esEnter = false;
        }

        return esEnter;
    }

    public boolean inRangIp(int valor) {
        boolean enRang = false;

        if (valor >= 0 && valor <= 255) {
            enRang = true;
        }
        return enRang;
    }

    public String[] comprovarPartsIP(String ip) throws IPErroniaException {
        /*La String que demana split és una regular expression (una forma estàndar 
        d'indicar el contingut que vols trobar en una cadena).
        
        El punt (.) com a regular expression és un metacaràcter, que significa 
        1 caràcter (qualsevol), perquè signifiqui punt s'ha d'escapar amb 
        una contrabarra (\.).
        
        Però les regular expressions es fiquen dins de Strings, per això 
        hem de fer el mateix que si volem imprimir literalment \n i no
        un salt de línia (posariem "\\n" per escapar la contrabarra).
        
        Conclusió: indiquem el caràcter punt en una String que és una 
        expressió regular amb "\\."
        
         */
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            throw new IPErroniaException(ip);
        }
        return parts;
    }

    public boolean isIp(String ip) {
        boolean verificat = true;
        int partEnter;

        try {
            String[] parts = comprovarPartsIP(ip);

//            for (String part : parts) {
//                if (!stringToInt(part) || !inRangIp(Integer.parseInt(part))) {
//                    verificat = false;
//                }
//            }
            for (String part : parts) {
                if (!stringToInt(part)) {
                    verificat = false;
                    break;
                } else {
                    partEnter = Integer.parseInt(part);

                    if (!inRangIp(partEnter)) {
                        verificat = false;
                        break;
                    }

                }

            }

            if (verificat) {
                LOGGER.log(Level.INFO, " IP VALIDA: " + ip);
            }

        } catch (IPErroniaException ex) {
           // System.err.println(ex.getMessage() + " No té format d'IP");
            verificat = false;

            LOGGER.log(Level.SEVERE, "No te formar de ip " + ex.getMessage(), ex);
        }
        return verificat;
    }

}
