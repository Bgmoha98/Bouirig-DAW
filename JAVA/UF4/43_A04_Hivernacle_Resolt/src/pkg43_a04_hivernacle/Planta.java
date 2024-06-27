package pkg43_a04_hivernacle;

public abstract class Planta {
    
    public final String NOM;
    public final int ALTURA_MAX;
    protected int altura = 1; //ojo, no tornar-lo a declarar a les classes filles, si no no veiem l'increment al creixer()
    protected boolean esViva = true;

    public Planta(String NOM, int ALTURA_MAX) {
        this.NOM = NOM;
        this.ALTURA_MAX = ALTURA_MAX;
    }
    
    public abstract void creixer();
    
    public boolean getEsViva(){
        return esViva;
    }

    @Override
    public String toString() {
        return "\n" + NOM + ", ALTURA_MAX=" + ALTURA_MAX + ", altura=" + altura 
                + ", esViva=" + esViva;
    }
    
}
