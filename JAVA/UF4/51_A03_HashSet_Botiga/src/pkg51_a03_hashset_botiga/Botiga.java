/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg51_a03_hashset_botiga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author mohab
 */
public class Botiga {
    
    private Set<Joc> jocs = new HashSet<Joc>();
    
    
    public void comprar(Joc joc){
        if (joc != null) {
            jocs.add(joc);
        }
    }
    
    public boolean contiene(Joc joc){
        boolean estaEnLista = false;
        if (jocs.contains(joc)) {
            estaEnLista=true;
        }
        
        return estaEnLista;
    }
    
    public boolean esborrar(Joc joc){
        boolean borrado = false;
        if (jocs.remove(joc)) {
            borrado=true;
        }
        
        return borrado;
    }
    
    public List<Joc> filtrar(String categoria){
        List<Joc> jocsCategoria = new ArrayList<>();
        
        for (Joc joc : jocs) {
            if (joc.getCategoria().equals(categoria)) {
                jocsCategoria.add(joc);
            }
        }
    
    return jocsCategoria;
    }

    @Override
    public String toString() {
        return "Botiga{" + "juegosCategoria=" + jocs + '}';
    }

    
    
    
    
}
