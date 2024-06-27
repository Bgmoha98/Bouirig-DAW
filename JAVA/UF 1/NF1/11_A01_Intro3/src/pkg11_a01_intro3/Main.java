/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a01_intro3;

/**
 *
 * @author Moha
 */
public class Main {

    /**
     * Declaro variable con el multiplicador ya que no cambiara, y he realizado un for donde recorre del 1 al 10 y lo multiplica por la variable creada
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int multiplicador = 1000;
                
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x 1000 = " + i * multiplicador);
        }
       
    }
    
}
