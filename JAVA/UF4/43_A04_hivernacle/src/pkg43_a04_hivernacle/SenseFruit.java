/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg43_a04_hivernacle;

/**
 *
 * @author mohab
 */
public class SenseFruit extends Planta {

    public int ALTURA_MIN;
    private boolean altaPerCollir = false;

    public SenseFruit(String nom, int ALTURA_MAX, int ALTURA_MIN) {
        super(nom, ALTURA_MAX);
        this.ALTURA_MIN = ALTURA_MIN;
    }

    @Override
    public void creixer() {
        if (esViva == true) {

            if (altura < ALTURA_MAX) {
                altura++;
                
                if (altura >= ALTURA_MIN) {
                    altaPerCollir = true;
                }
                
            } else{
                esViva = false;
            }

        }
    }

}
