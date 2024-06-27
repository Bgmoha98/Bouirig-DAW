/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mohab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // EMPLEADO
        Empleat empleado1 = new Empleat("Moha", "48200000F");
        System.out.println(empleado1);
        Empleat empleado2 = new Empleat("MOHAMED", "47200000F");

        //DIRECTIU
        Empleat directiu1 = new Directiu("Mohamed1", "4800000F");
        System.out.println(directiu1);

        //OPERARI
        Operari operari1 = new Operari("Carlos", "98000000G", "Mati");
        System.out.println(operari1);

        // OFICIAL
        Oficial ofical1 = new Oficial("Sergi", "91000000G", "Nit");
        System.out.println(ofical1);

        //TECNIC
        Tecnic tecnic1 = new Tecnic("Alberto", "99000000G", "Nit");
        System.out.println(tecnic1);

        GestioEmpleats gestionEmpleados = new GestioEmpleats();

        System.out.println("Empleado ?" + gestionEmpleados.afegir(empleado1));
        System.out.println("Empleado ?" + gestionEmpleados.afegir(empleado2));
        System.out.println(" Directiu ?" + gestionEmpleados.afegir(directiu1));
        System.out.println(" Tecnic ?" + gestionEmpleados.afegir(tecnic1));
        System.out.println(" Operari ?" + gestionEmpleados.afegir(operari1));
        System.out.println(" Operari ?" + gestionEmpleados.afegir(ofical1));

        System.out.println(gestionEmpleados.getDirectiu());
        System.out.println(gestionEmpleados.getOperaris());
        System.out.println(gestionEmpleados.getTecnics());
        System.out.println(gestionEmpleados.getOficials());

        System.out.println(operari1.allToString());
        gestionEmpleados.cambiarTurno(operari1, "Tarde");
        System.out.println(operari1.allToString());

    }

}
