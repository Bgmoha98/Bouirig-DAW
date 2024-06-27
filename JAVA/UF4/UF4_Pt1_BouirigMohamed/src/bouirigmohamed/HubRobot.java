/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouirigmohamed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohab
 */
public class HubRobot {

    private List<Robot> enchufados = new ArrayList<>();

    // Metodo donde añado los objetos de Robot al List de enchufados
    public void enchufar(Robot r) {
        enchufados.add(r);
        r.cargar();
    }

    // MEtodo actuaizar version
    public List<Robot> actualizar(int version) {
        List<Robot> vigilancia = new ArrayList<>();
        // Recorre los objetos en el listado de enchufados
        for (Robot robot : enchufados) {
            // si el objeto robot es de la clase RobotVigilancia
            if (robot instanceof RobotVigilancia) {
                // Y la version es superior a la actual
                if (version > ((RobotVigilancia) robot).getFirmware()) {
                    // Entonces lo añade a la lista de vigilancia
                    vigilancia.add(robot);
                    // Modifica la version por la indicada
                    ((RobotVigilancia) robot).setFirmware(version);
                }
            }
        }
        return vigilancia;
    }

    // sobreescribo el metodo toString
    @Override
    public String toString() {
        return "HubRobot{" + "enchufados=" + enchufados + '}';
    }

}
