/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a04_hivernacle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohab
 */
public class AmbFruits extends Planta {

    public int ALTURA_MIN_DONAR_FRUIT;
    public int MAXIM_FRUITS;
    public String NOM_FRUITS;
    public int MIN_ES_MADUR;
    private int comptFruits;
    
    private List<Fruit> fruits = new ArrayList();

    public AmbFruits(String nom, int ALTURA_MAX, int ALTURA_MIN_DONAR_FRUIT, int MAXIM_FRUITS,
            String NOM_FRUITS, int MINIM_ES_MADUR) {
        super(nom, ALTURA_MAX);
        this.ALTURA_MIN_DONAR_FRUIT = ALTURA_MIN_DONAR_FRUIT;
        this.MAXIM_FRUITS = MAXIM_FRUITS;
        this.NOM_FRUITS = NOM_FRUITS;
        this.MIN_ES_MADUR = MINIM_ES_MADUR;
    }
    
    private void crearFruit(Fruit Fruit){
        fruits.add(Fruit);
    }

    @Override
    public void creixer() {

    }

}
