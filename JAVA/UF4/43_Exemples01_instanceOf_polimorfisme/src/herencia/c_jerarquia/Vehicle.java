package herencia.c_jerarquia;

public class Vehicle {

    protected String matricula;
    String marca;
    private String model;

    public Vehicle(String matricula, String marca, String model) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;

        System.out.println("constructor de vehicle");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "matricula=" + matricula + ", marca=" + marca + ", model=" + model + '}';
    }
}
