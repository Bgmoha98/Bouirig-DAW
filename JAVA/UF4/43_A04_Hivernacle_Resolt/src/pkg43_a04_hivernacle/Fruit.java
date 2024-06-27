package pkg43_a04_hivernacle;

public class Fruit {
    private final String NOM;
    public final int MIN_ES_MADUR;
    private int comptMadur = 1;
    private boolean esMadur = false;

    public Fruit(String NOM, int MIN_ES_MADUR) {
        this.NOM = NOM;
        this.MIN_ES_MADUR = MIN_ES_MADUR;
    }

    public boolean getEsMadur() {
        return esMadur;
    }
    
    public void madurar(){
        if (!esMadur){
            if (++comptMadur >= MIN_ES_MADUR){
                esMadur = true;
            }
        }
    }

    @Override
    public String toString() {
        return "\nFruit " + NOM + "{ MIN_ES_MADUR=" + MIN_ES_MADUR 
                + ", comptMadur=" + comptMadur + ", esMadur=" + esMadur + "}";
    }
    
}
