/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooex1;

/**
 *
 * @author mohab
 */
public class PooEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta = new Cuenta("Mohamed", 100);
        
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getCantidad());
        
        cuenta.ingresar(33.33);
        
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getCantidad());
        
        cuenta.retirar(400);
        cuenta.ingresar(-200);
        
        System.out.println(cuenta.getTitular());
        System.out.println(cuenta.getCantidad());
    }
    
}
