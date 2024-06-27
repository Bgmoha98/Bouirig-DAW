/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg51_a03_hashset_botiga;

/**
 *
 * @author mohab
 */
public class TestBotiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Joc joc1 = new Joc("Zelda tofk1", "Nintendo","Mundo Abierto");
        Joc joc2 = new Joc("Zelda boftw2", "Nintendo2","Mundo Abierto");
        Joc joc3 = new Joc("Zelda tofk3", "Nintendo","Mundo Abierto2");
        Joc joc4 = new Joc("Zelda boftw4", "Nintendo2","Mundo Abierto");
        
        Botiga botiga1 = new Botiga();
        
        botiga1.comprar(joc1);
        botiga1.comprar(joc3);
        
        System.out.println(botiga1.esborrar(joc2));
        
        System.out.println(botiga1.filtrar("Mundo Abierto"));
    }
    
}
