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
public class RobotVigilancia extends Robot {

    private int firmware;

    // Constructor de RobotVigilancia donde modifico el modelo y bateria de la superclase, tambien se le pasa el firmware
    public RobotVigilancia(String modelo, int bateria, int firmware) {
        super.setModelo(modelo);
        super.setBateria(bateria);
        this.firmware = firmware;
    }

    // retorna version del firmware
    public int getFirmware() {
        return firmware;
    }

    // modifica la version del firmware
    public boolean setFirmware(int version) {
        if (version > firmware) {
            firmware = version;
            return true;
        }
        return false;
    }

    // Metodo cargar sobreescrito, suma 50 a la bateria pero si tiene mas de un 50%, hace el calculo y suma el restante.
    @Override
    public void cargar() {
        if (super.getBateria() < 120) {
            int restante = 120 - super.getBateria();
            if (restante > 100) {
                super.setBateria(super.getBateria() + 100);
            } else {
                super.setBateria(super.getBateria() + restante);
            }
        }
    }

    // sobreescribo el metodo toString
    @Override
    public String toString() {
        return "\n" + "Robot: " + "robot de vigilancia" + "  -  " + "modelo: " + super.getModelo() + ", bateria: "
                + super.getBateria() + ", firmware: " + firmware;
    }

}
