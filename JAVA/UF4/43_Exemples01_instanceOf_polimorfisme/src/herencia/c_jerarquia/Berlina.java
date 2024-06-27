package herencia.c_jerarquia;

public class Berlina extends Cotxe {

    private boolean esFamiliar;

    public Berlina(
            int portes, int seients,
            String matricula, String marca, String model) {

        super(portes, seients, matricula, marca, model);
        System.out.println("constructor de Berlina");
    }

    public boolean getEsFamiliar() {
        return esFamiliar;
    }

    public void setEsFamiliar(boolean esFamiliar) {
        this.esFamiliar = esFamiliar;
    }

    @Override
    public String toString() {
        return "Berlina{" + super.toString() + "esFamiliar=" + esFamiliar + '}';
    }

}
