package llistacotxes;

import java.util.ArrayList;

public class ArrayListCotxes {

    public static void main(String[] args) {

        //Declaració i inicialització de l'ArrayList de tipus Cotxe
        ArrayList<Cotxe> cotxesAL = new ArrayList<>();

        //Es creen 4 objectes de tipus Cotxe i els afegim a l'arraylist
        cotxesAL.add(new Cotxe("Seat0", "Leon0", 100));
        cotxesAL.add(new Cotxe("Seat1", "Leon1", 110));
        cotxesAL.add(new Cotxe("Seat2", "Leon2", 120));
        Cotxe cotxe3 = new Cotxe("Seat3", "Leon3", 130);

        cotxesAL.add(cotxe3);

        //Imprimim l'estat dels cotxes existents a l'arraylist
        System.out.println(cotxesAL);

        //El mètode get() torna la referència de l'objecte de la posicició rebuda          
        Cotxe cotxe0 = cotxesAL.get(0);
        
        System.out.println("cotxe0: " + cotxe0);
        System.out.println("cotxe a la pos 0: \n" + cotxesAL.get(0));

        /*El mètode set() permet substituir l'objecte referenciat de la posició 
        indicada, per l'objecte rebut.  */
        cotxesAL.set(2, new Cotxe("Seat2a", "Leon2a", 140));
        System.out.println(cotxesAL);

        // --> modificar l'objecte d'una posició de l'ArrayList
        cotxesAL.get(0).setMarca("marca000");
        System.out.println(cotxesAL);
        
        /*El mètode indexOf() torna la posició on es troba la referència de
        l'objecte rebut  o -1 si no es troba.*/
        System.out.println("indexOf() existent a l'AL: "
                + cotxesAL.indexOf(cotxe0));

        Cotxe cotxe4 = new Cotxe("Seat3", "Leon3", 130);

        System.out.println("indexOf() no existent a l'AL: "
                + cotxesAL.indexOf(cotxe4));

        /*El mètode contains() torna true si la referència rebuda es troba a 
        l'arraylist i false en cas contrari.*/
        System.out.println("contains() existent a l'AL: "
                + cotxesAL.contains(cotxe0));
        System.out.println("contains() no existent a l'AL: "
                + cotxesAL.contains(cotxe4));

        //El mètode size() torna la quantitat d'elements que hi ha  a l'arraylist.
        System.out.println("mida de l'arraylist: " + cotxesAL.size());

        /*El mètode remove() elimina de l'arraylist l'element de la posició rebuda
        o l'element rebut
        */
        System.out.println("remove() per pos: " + cotxesAL.remove(1));
        System.out.println(cotxesAL);

        /*El mètode remove() està sobrecarregat i elimina de l'arraylist el
        primer element que coincideixi amb el rebut per paràmetre*/
        System.out.println("remove per objecte: " + cotxesAL.remove(cotxe4));
        System.out.println(cotxesAL);

        //El mètode clear() elimina tots els elements existents a l'arraylist.
        cotxesAL.clear();
        System.out.println(" s'ha buidat: " + cotxesAL.isEmpty());// torna true si es troba buit.
    }
}
