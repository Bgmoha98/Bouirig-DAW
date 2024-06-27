package llistacotxes;

public class Cotxe {

    private String marca;
    private String model;
    private double potenciaCV;

    public Cotxe(String marca, String model, double potenciaCV) {
        this.marca = marca;
        this.model = model;
        this.potenciaCV = potenciaCV;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "Cotxe{" + "marca=" + marca + ", model=" + model + ", potenciaCV=" + potenciaCV +"}\n";
    }
    



}
