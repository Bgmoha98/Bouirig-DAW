/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouirigmohamed;

/**
 *
 * @author mohab
 */
public class RobotLimpieza extends Robot {

    // Constructor de RobotLimpieza donde modifico el modelo y bateria de la superclase
    public RobotLimpieza(String modelo, int bateria) {
        super.setModelo(modelo);
        super.setBateria(bateria);
    }

    // Metodo cargar sobreescrito, suma 50 a la bateria pero si tiene mas de un 50%, hace el calculo y suma el restante.
    @Override
    public void cargar() {
        if (super.getBateria() < 100) {
            int restante = 100 - super.getBateria();

            if (restante > 50) {
                super.setBateria(super.getBateria() + 50);
            } else {
                super.setBateria(super.getBateria() + restante);
            }

        }
    }

    // sobreescribo el metodo toString
    @Override
    public String toString() {
        return "\n" + "Robot: " + "robot de limpieza" + " - " + "modelo: " + super.getModelo() + ", bateria:" + super.getBateria();
    }

}
