/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohab
 */
public class GestioEmpleats {

    private List<Empleat> empleats = new ArrayList<>();

    public Boolean afegir(Empleat empleado) {
        if (!empleats.contains(empleado)) {
            empleats.add(empleado);
            return true;
        }
        return false;
    }

    public List cambiarTurno(Operari Operari, String turno) {
        List<Operari> operaris = new ArrayList<>();

        for (Empleat empleat : empleats) {
            if (empleat instanceof Operari) {
                Operari.torn = turno;
                operaris.add((Operari) empleat);
            }
        }
        return operaris;
    }

    public List getTecnics() {
        List<Tecnic> tecnics = new ArrayList<>();

        for (Empleat empleat : empleats) {
            if (empleat instanceof Tecnic) {
                tecnics.add((Tecnic) empleat);
            }
        }
        return tecnics;
    }

    public List getOperaris() {
        List<Operari> operaris = new ArrayList<>();

        for (Empleat empleat : empleats) {
            if (empleat instanceof Operari) {
                operaris.add((Operari) empleat);
            }
        }
        return operaris;
    }

    public List getOficials() {
        List<Oficial> oficials = new ArrayList<>();

        for (Empleat empleat : empleats) {
            if (empleat instanceof Oficial) {
                oficials.add((Oficial) empleat);
            }
        }
        return oficials;
    }

    public List getDirectiu() {
        List<Directiu> directius = new ArrayList<>();

        for (Empleat empleat : empleats) {
            if (empleat instanceof Directiu) {
                directius.add((Directiu) empleat);
            }
        }
        return directius;
    }

}
