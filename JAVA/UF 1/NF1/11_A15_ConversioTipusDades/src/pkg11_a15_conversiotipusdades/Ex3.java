/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a15_conversiotipusdades;

/**
 *
 * @author Moha
 */
public class Ex3 {

    public static void main(String[] args) {
        // TODO code application logic here

        byte valorByte1 = 10;
        byte valorByte2 = 2;

        char valorChar1 = 'a';
        char valorChar2 = 'b';

        int valorInt1 = 100;
        int valorInt2 = 200;

        long valorLong1 = 1000;
        long valorLong2 = 2000;

        float valorFloat1 = 1000.1234f;
        float valorFloat2 = 2000.5678f;

        double valorDouble1 = 100000.1234;
        double valorDouble2 = 200000.5678;
        
        int  resultado1 =  valorByte1 / valorByte2;
        int resultado2 = valorChar1 + valorChar2;
        int  resultado3 = (int) (valorLong1 * valorLong2);
        double resutado4 = (valorByte1 * valorLong2) / valorDouble1;
        float resutado5 = (float) ((valorByte1 * valorLong2) / valorDouble1);
        double resultado6 = valorChar1 * valorFloat1 + (valorByte1 * valorLong2) / valorDouble1;
        
    }

}
