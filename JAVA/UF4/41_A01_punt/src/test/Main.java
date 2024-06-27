/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import punt.Punt;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Punt punto = new Punt();
        
        System.out.println(punto);
        
        Punt punto2 = new Punt(3,5);
        
         System.out.println(punto2);
         
         Punt punto3 = new Punt();
         
         punto3.setX(5);
         punto3.setY(9);
         
         System.out.println(punto3);
         
         System.out.println("X = " +punto3.getX());
         System.out.println("X = " +punto3.getY());
        
    }
    
}
