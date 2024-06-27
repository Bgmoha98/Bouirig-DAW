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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creo instnacia deHubRobot
        HubRobot home = new HubRobot();

        // Con la instancia creada anterior mente, llamo a enchufar y le paso los robots
        home.enchufar(new RobotLimpieza("Cleanbot 650", 11));
        home.enchufar(new RobotVigilancia("FullView  360", 20, 4));
        home.enchufar(new RobotVigilancia("CamMax  1200", 15, 6));
        home.enchufar(new RobotLimpieza("LimpiTech Z", 50));

        // Muestro el listado de enchufados
        System.out.println("*** Despés de enchufarlos:");
        System.out.println(home.toString());

        // Muestro el listado de RobotsVigiliancia actualizados
        System.out.println("\n**** Los actualizados a 5:");
        System.out.println(home.actualizar(5));

    }

}
