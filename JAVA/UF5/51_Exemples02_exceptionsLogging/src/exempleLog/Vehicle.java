package exempleLog;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

    private String matricula;
    private String marca;
    private String model;
    private LocalDate dataMatriculacio;

    public Vehicle(String matricula, String marca, String model,
            LocalDate dataMatriculacio) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.dataMatriculacio = dataMatriculacio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDataMatriculacio() {
        return dataMatriculacio;
    }

    @Override
    public String toString() {
        return "Vehicle{"
                + "matricula=" + matricula + ", marca=" + marca + ", model="
                + model + ", dataMatriculacio=" + dataMatriculacio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

}
