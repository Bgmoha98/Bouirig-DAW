/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoriapoo;

import pkg_comptes.Compte;
import pkg_comptes.Client;

/**
 *
 * @author mohab
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Compte c3 = new Compte(547800923, new Client("Moha", "48230000F"), 0.25F);
         Compte c1 = new Compte(547800924);
        c3.getClient().setNom("Sergio");
        System.out.println(c3); // imprime todo compte
        System.out.println(c3.getClient().getNom()); // imprime nuevo nombre
        
        Compte compte4; 
        compte4 = c3;
        
        compte4.ingresar(100000);
        
        System.out.println(compte4);
        
        System.out.println(c3);
        
         System.out.println(c1);
         
         compte4 = null;
         
         System.out.println(compte4);
        
        

    }

}
