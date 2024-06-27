package uf5_activitathashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Botiga {

    private static final Logger LOGGER
            = Logger.getLogger(Botiga.class.getName());

    private Set<Joc> jocs = new HashSet<>();

    public void comprar(Joc joc) {
        if (joc != null) {
            //add() retorna true si el set no tenia l'element 
            if (jocs.add(joc)) {
                LOGGER.log(Level.INFO, joc + " S'ha comprat correctament.");
            }
        }
    }

    public boolean contiene(Joc joc) {
        return jocs.contains(joc);
    }

    public List<Joc> getJocs() {
        List<Joc> juegos = new ArrayList<>();
        for (Joc joc : jocs) {
            juegos.add(joc);
        }
        return juegos;
    }

    public boolean esborrar(Joc joc) {

        boolean eliminat = false;

        if (jocs.remove(joc)) {
            eliminat = true;
            LOGGER.log(Level.WARNING, "S'ha esborrat correctament " + joc);
        }
        return eliminat;

    }

    public List<Joc> filtrar(String categoria) {
        List<Joc> filtrats = new ArrayList<>();

        for (Joc joc : jocs) {
            if (joc.getCategoria().equals(categoria)) {
                filtrats.add(joc);
            }
        }

        return filtrats;
    }

    @Override
    public String toString() {
        return "\nJocs comprats:" + jocs + '\n';
    }

}
