package pkg43_a04_hivernacle;

public class SenseFruits extends Planta {

    public final int ALTURA_MIN_COLLIR;
    private boolean altaPerCollir = false;

    public SenseFruits(String NOM, int ALTURA_MIN_COLLIR, int ALTURA_MAX) {
        super(NOM, ALTURA_MAX);
        this.ALTURA_MIN_COLLIR = ALTURA_MIN_COLLIR;
    }

    public boolean getEsPotCollir() {
        return altaPerCollir;
    }

    @Override
    public void creixer() {
        if (esViva) {
            if (altura < ALTURA_MAX) {
                altura++;
                if (altura >= ALTURA_MIN_COLLIR) {
                    altaPerCollir = true;
                }
            } else {
                esViva = false;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + " --> SenseFruits{" + "\n ALTURA_MIN_COLLIR=" + ALTURA_MIN_COLLIR
                + ", esPotCollir=" + altaPerCollir + "}\n\n";
    }

}
