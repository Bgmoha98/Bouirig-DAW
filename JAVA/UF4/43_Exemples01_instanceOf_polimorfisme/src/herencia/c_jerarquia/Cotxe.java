package herencia.c_jerarquia;

public class Cotxe extends Vehicle {

    private int portes;
    private int seients;

    public Cotxe(int portes, int seients, String matricula, String marca, String model) {

        super(matricula, marca, model); //ha de ser la primera sentència del constructor

        this.seients = seients;
        this.portes = portes;
        System.out.println("constructor de cotxe");
    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getSeients() {
        return seients;
    }

    public void setSeients(int seients) {
        this.seients = seients;
    }

    @Override
    public String toString() {
        return "Cotxe{" + super.toString() + "portes=" + portes + ", seients=" + seients + '}';
    }

}
