package uf5_activitathashmap;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestBotiga {

    public static void main(String[] args) {
        
        Logger logger = Logger.getLogger(TestBotiga.class.getName());

        //1. configuració del logger:
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream(
                    "fitxers/configLog.properties"));
        } catch (FileNotFoundException ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        } catch (IOException ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        } catch (SecurityException ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }
        
        //2. Crea tres jocs (joc1, joc2 i joc3) i compra joc1 i joc2
        Botiga botiga = new Botiga();

        Joc joc1 = new Joc("Minecraft", "Mojang Studios", "Sandbox");
        Joc joc2 = new Joc("Among Us", "InnerSloth", "Multiplayer");
        Joc joc3 = new Joc("Terraria", "Re-Logic", "Sandbox");
        
        botiga.comprar(joc1);
        botiga.comprar(joc2);
        
        //3. Mostra un missatge indicant si tens o no un joc.
        // provar amb joc2 i joc3:
        if (botiga.contiene(joc2)) {
            System.out.println("\nJa tens el joc " + joc2.getNom());
        } else {
            System.out.println("\nEncara no tens el joc " + joc2.getNom());
        }

        //4. Compra joc3 i mostra els jocs comprats de botiga
        botiga.comprar(joc3);        
        System.out.println(botiga);
        
        //5. Imprimeix els jocs filtrats per la categoria Sandbox
        System.out.println("\nJocs de Sandbox: \n" + botiga.filtrar("Sandbox"));

        //6. Elimina joc1 i després mostra els jocs comprats de botiga
        botiga.esborrar(joc1);     
        System.out.println(botiga);
        
        //7. Intenta afegir un joc ja comprat i després mostra els jocs comprats
        botiga.comprar(joc3);
        System.out.println(botiga);
    }    
}