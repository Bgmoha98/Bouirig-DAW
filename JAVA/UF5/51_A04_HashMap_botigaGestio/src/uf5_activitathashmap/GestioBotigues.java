/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf5_activitathashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mohab
 */
public class GestioBotigues {

    Map<Client, Botiga> botigues = new HashMap();
    

    public void comprar(Client client, Joc joc) {
        
        botigues.get(client).comprar(joc);
    }

}
