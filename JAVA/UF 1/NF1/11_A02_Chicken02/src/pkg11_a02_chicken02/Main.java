/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a02_chicken02;

/**
 *
 * @author Moha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dilluns = 100;
        int dimarts = 121;
        int dimecres = 117;
        double preuOu = 0.18;
        
        double mitjanaDia,mitjanaMes, preuMes;
        mitjanaDia = (dilluns + dimarts + dimecres) / 3.0;
        mitjanaMes = mitjanaDia * 30;
        preuMes = mitjanaMes * preuOu;
        
        System.out.println("La mitjana d'ous d'un dia es: " + mitjanaDia);
        System.out.println("La mitjana d'ous d'un mes es: " + mitjanaMes);
        System.out.println("El preu total del ous de tot un mes:  " + preuMes);
        
    }
    
}
