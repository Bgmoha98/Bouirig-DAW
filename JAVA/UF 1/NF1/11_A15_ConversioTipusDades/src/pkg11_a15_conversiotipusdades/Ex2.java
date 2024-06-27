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
public class Ex2 {

    public static void main(String[] args) {
        // TODO code application logic here

        // declaraciones de las variables vocales
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';

        // muestro el resultado final en una sola linea
        System.out.printf(" a\t%d\n e\t%d\n i\t%d\n o\t%d\n u\t%d\n",
                (int) a, (int) e, (int) i, (int) o, (int) u);

        System.out.println("************");

        // muestro el resultado final en mas de una linea para visualizarlo mejor
        System.out.printf(" a\t%d\n", (int) a);
        System.out.printf(" e\t%d\n", (int) e);
        System.out.printf(" i\t%d\n", (int) i);
        System.out.printf(" o\t%d\n", (int) o);
        System.out.printf(" u\t%d\n", (int) u);

    }

}
