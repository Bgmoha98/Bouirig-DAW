package herencia.d_ArrayListDiferentsTipus;

import herencia.c_jerarquia.Berlina;
import herencia.c_jerarquia.Cotxe;
import herencia.c_jerarquia.Vehicle;
import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        Vehicle v = new Vehicle("1111AAA", "marca1", "model1");
        Cotxe c = new Cotxe(5, 5, "2222BBB", "marca2", "model2");
        Berlina berlina = new Berlina(5, 5, "3333CCC", "marca3", "mode3");

        /*l'herència permet assignar, a una variable de la superclasse, la 
        referècia d'un objecte de qualsevol de les subclasses
         */
        Vehicle v3 = new Cotxe(3, 4, "4444DDD", "marca4", "mode4");
        Vehicle v4 = new Berlina(5, 5, "5555EEE", "marca5", "mode5");
        Vehicle v5 = c;
        Cotxe c2 = berlina;

        /*A un Arraylist de tipus la superclasse li podrem afegir qualsevol objecte 
        o instància de les subclasses de la seva jerarquia.
        En el nostre cas, a vehicles podrem afegir qualsevol objecte de tipus
        Vehicle o de qualsevol tipus de les seves subclasses
         */
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(v);
        vehicles.add(v3);
        vehicles.add(v4);
        vehicles.add(berlina);
        vehicles.add(c);
        vehicles.add(c2);

        /*Amb l'operador instanceof podem comprovar si un objecte o instància 
        s'ha creat amb una classe o alguna de les seves derivades
         */
        ArrayList<Cotxe> cotxes = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Cotxe) {
                cotxes.add((Cotxe) vehicle);
            }
        }
        System.out.println("Llista cotxes:");

        for (Cotxe cotxe : cotxes) {
            System.out.println(cotxe);
        }

    }
}
