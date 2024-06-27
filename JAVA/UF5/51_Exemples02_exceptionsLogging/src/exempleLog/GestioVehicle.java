package exempleLog;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestioVehicle {

    private static final Logger LOGGER
            = Logger.getLogger(GestioVehicle.class.getName());

    private List<Vehicle> vehicles = new ArrayList();

    /**
     * @param v
     * @throws VehicleException, es llançada si el vehicle rebut ja existeix a
     * la llista.
     * @throws DadesVehicleException, és llançada si v és null o les dades del
     * vehicle no compleixen els requeriments.
     */
    public void afegir(Vehicle v) throws VehicleException {

        //Si alguna dada és null o "", llançarà DadesVehicleException
        comprovarVehicle(v);
        /*
        Com que comprovarVehicle(v) llançaria una excepció si alguna dada 
        fos errònia, en aquell cas ja no s'executaria el codi de sota: 
        no cal ficar comprovarVehicle(v) en un if/else
         */

        //Si el vehicle està repe, llança VehicleException
        if (!vehicles.contains(v)) {
            vehicles.add(v);
            
            //Si l'he afegit, vull enregistrar-ho
            LOGGER.log(Level.INFO, "Vehicle afegit: " + v.getMatricula());
            
        } else {
            
            /*Si ja existeix, vull enregistrar-ho
            Aquí estic fent el mateix de 2 maneres diferents 
            (generaré 2 registres del mateix vehicle):
             */
            //Enregistro aquí
            LOGGER.log(Level.WARNING, "Vehicle ja existent.");
            
            //Llanço l'exepció per enregistrar després
            throw new VehicleException("Vehicle ja existent.");

            //System.out.println("Hola!"); //Això dóna error unreachable statement
        }
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    /**
     * @param v
     * @return
     * @throws DadesVehicleException, és llançada si v és null o les dades del
     * vehicle no compleixen els requeriments.
     */
    boolean comprovarVehicle(Vehicle v) {
        boolean validat = true;
        String missatge = "";

        if (v == null) {  // L'objecte rebut és null
            missatge = "Vehicle null";
            validat = false;

        } else if (v.getMatricula() == null || v.getMatricula().equals("")) {
            missatge = "Matrícula no vàlida: " + v;
            validat = false;

        } else if (v.getMarca() == null || v.getMarca().equals("")) {
            missatge = "Marca no vàlida: " + v;
            validat = false;

        } else if (v.getModel() == null || v.getModel().equals("")) {
            missatge = "Model no vàlid: " + v;
            validat = false;
        }

        if (!validat) {
            throw new DadesVehicleException(missatge); //hereta de RuntimeException

            //System.out.println("Hola!"); //Això dóna error unreachable statement
        }

        //Aquí només hi arribo si ha validat
        return validat; //en aquest exemple, això no cal, pq no recolliré la booleana
    }
}
