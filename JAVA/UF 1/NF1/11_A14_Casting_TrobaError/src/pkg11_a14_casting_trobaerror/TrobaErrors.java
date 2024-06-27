/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a14_casting_trobaerror;

/**
 *
 * @author mohab
 */
public class TrobaErrors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //World population today
        long currentWorldPop = 7_000_000_000L;
        System.out.println("Current World Population: " + currentWorldPop);

        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        int africaPop = 221_000_000;
        int asiaPop = 1_402_000_000;
        int europePop = 547_000_000;
        int americasPop = 339_000_000;
        int oceanaPop = 13_000_000;

        System.out.println("World Population in 1950: "
                + ((long)africaPop + asiaPop + europePop + americasPop + oceanaPop));

        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 9.6;
        double currentAsiaPop =   currentWorldPop *  percentAsia;
        System.out.println("Current Asia Population: " +  currentAsiaPop);

    }

}
