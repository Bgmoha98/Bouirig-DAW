/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_pt1_bouirigmohamed;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mohab
 */
public class Partit {
    
    // Declaro el LOGGER como atributo
    private static  final Logger LOGGER = Logger.getLogger(TestPartit.class.getName());
    // Declaro data como String y atributo, mas tarde le asignare la fecha en formato string
    private String data;
    // Declaro HashSet de futbolistas convocados
    private HashSet<Futbolista> futbolistesConvocats = new HashSet<Futbolista>(); 

    // Constructor de Partit
    public Partit(String data) {
        this.data = data;
    }
    
    // Metodo convocar
    public void convocar(Futbolista futbolista){
        // Si el futbolista introducido es nulo devolvera un mensaje de error
        if (futbolista == null) {
            System.out.println("El futbolista es nulo");
        } else {
            // Si el futbolista no esta convocado, lo añadira en el HashSet y añade un Mensaje de tipo INFO que lo mostrara
            // y lo guardara en el fichero .log
            if (!futbolistesConvocats.contains(futbolista)) {
                futbolistesConvocats.add(futbolista);
                LOGGER.log(Level.INFO, futbolista + "  S'ha convocat correctament");
            } else {
                
                System.out.println("El futbolista ya se encuentra convocado");
            }
        }
        }
    
    // Metodo desconvocar
    public boolean desconvocar(Futbolista futbolista){
        // Booleana en false
        boolean desconvocat = false;
        // Si el futbolista se desconvoca (Devuelve true en este caso) con LOGGER mostrare y guardare un mensaje de tipo WARNING
        if (futbolistesConvocats.remove(futbolista)) {
            LOGGER.log(Level.WARNING, futbolista + "  S'ha desconvocat correctament");
        }
        // Devuelvo la booleana
        return desconvocat;
    }
    
    // Metodo dede compruebo los convocados por posicion
    public List<Futbolista> getConvocatsPosicio(String posicio){
        // Declaro un List de futbolistas
        List <Futbolista> convocadosPosicion = new ArrayList<>();
        // Realizo un for each donde recorre los futbolistas en el HASHSET
        for (Futbolista f1 : futbolistesConvocats) {
            // Si la posicion del futbolista es igual a la posicion indicada, añadira el futbolista al list creado anteriormente
            if (f1.getPosicio().equals(posicio)) {
                convocadosPosicion.add(f1);
            }
            
        }
        return convocadosPosicion;
    }
    
    
    // Genero toString añadiendo la fecha y los futbolistas convocados
    @Override
    public String toString() {
        return "\nPartit{" + "data=" + data + ", futbolistesConvocats=" + futbolistesConvocats + '}';
    }
    }


    
    

