package pkg43_a04_hivernacle;

import java.util.ArrayList;
import java.util.List;

public class AmbFruits extends Planta {

    public final String NOM_FRUIT;
    public final int ALTURA_MIN_DONAR_FRUIT;
    public final int MAX_FRUITS;
    public final int MIN_ES_MADUR;
    private List<Fruit> fruits = new ArrayList<>();
    //per no perdre el compte de fruits produïts tot i collir-los
    private int comptaFruits = 0;

    public AmbFruits(
            String NOM, String NOMFRUIT, int ALTURA_MIN_DONAR_FRUIT,
            int MAX_FRUITS, int MIN_ES_MADUR, int ALTURA_MAX) {

        super(NOM, ALTURA_MAX);
        this.NOM_FRUIT = NOMFRUIT;
        this.ALTURA_MIN_DONAR_FRUIT = ALTURA_MIN_DONAR_FRUIT;
        this.MAX_FRUITS = MAX_FRUITS;
        this.MIN_ES_MADUR = MIN_ES_MADUR;
    }

    private void crearFruit() {
        //mirem comptaFruits i no la mida del List, pq anirem traient els madurs
        if (comptaFruits < MAX_FRUITS) {
            fruits.add(new Fruit(NOM_FRUIT, MIN_ES_MADUR));
            comptaFruits++;
        }
    }

    public List<Fruit> treureFruits() {
        List<Fruit> collita = new ArrayList<>();

        /*
        Si modifiquem el número de valors d'un List (afegir o eliminar) 
        dins d'un for each, no podrem seguir recorrent-lo fins al final 
        (caldria sortir amb break), si no es llança ConcurrentModificationException
        
        Quan cal eliminar i recorrer fins al final:
         */
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).getEsMadur()) {
                collita.add(fruits.get(i));
                fruits.remove(i);
                /*
                cal tornar a recorrer la mateixa posició pq ara en aquesta hi ha
                el que estava a la següent posició abans d'esborrar
                 */
                i--;
            }
        }
        return collita;
    }

    @Override
    public void creixer() {
        if (esViva) {
            if (altura < ALTURA_MAX) {
                altura++;
                if (altura >= ALTURA_MIN_DONAR_FRUIT) {
                    for (Fruit fruit : fruits) {
                        fruit.madurar();
                    }
                    crearFruit();
                }
            } else {
                esViva = false;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " --> AmbFruits{" + "\n ALTURA_MIN_DONAR_FRUIT="
                + ALTURA_MIN_DONAR_FRUIT + ", MAX_FRUITS=" + MAX_FRUITS
                + ", MIN_ES_MADUR=" + MIN_ES_MADUR
                + "\n fruits=" + fruits + "}\n\n";
    }

}
