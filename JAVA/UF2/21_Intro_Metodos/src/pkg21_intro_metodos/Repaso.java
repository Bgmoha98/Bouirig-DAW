/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_intro_metodos;

/**
 *
 * @author mohab
 */
public class Repaso {

    static void imprimir(String holaMundo) {
        System.out.println(holaMundo);
    }
    
    static void modificacionMal(String modi) {
        modi = "Juan;";
        System.out.println(modi);
        
    }
    
    static String modificacionBien(String modi) {
        modi = "Federico;";
        return modi;
        
    }

    static void imprimir(int num) {
        System.out.println(num);
    }
    
    static void modificacionArray (int [] m) {
      m[1] = 999;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int [] longitudes = {9,6,7,12};
        String modi = "PEPE";
        modificacionMal(modi);
        System.out.println(modi);
        modi = modificacionBien(modi);
        System.out.println(modi);
        
        modificacionArray(longitudes);
        
        System.out.println(longitudes[1]);

    }

}
