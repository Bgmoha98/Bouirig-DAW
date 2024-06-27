package pkg43_a04_hivernacle;

import java.util.ArrayList;
import java.util.List;

public class Hivernacle implements IHivernacle {

    public final int MAX_PLANTES;
    private List<Planta> plantes = new ArrayList<>();

    public Hivernacle(int MAX_PLANTES) {
        this.MAX_PLANTES = MAX_PLANTES;
    }

    @Override
    public boolean afegirPlanta(Planta p) {
        boolean afegit = false;
        if (plantes.size() < MAX_PLANTES && p != null) {
            plantes.add(p);
            afegit = true;
        }

        return afegit;
    }

    @Override
    public List<Fruit> collirFruits() {
        List<Fruit> fruitsCollits = new ArrayList<>();

        for (Planta planta : plantes) {
            if (planta instanceof AmbFruits) {
                fruitsCollits.addAll(((AmbFruits) planta).treureFruits());

            }
        }

        return fruitsCollits;
    }

    @Override
    public List<Planta> collirPlantes() {
        List<Planta> plantesCollides = new ArrayList<>();
        
        for (int i = 0; i < plantes.size(); i++) {
            
            if(plantes.get(i) instanceof SenseFruits){
                if(((SenseFruits)plantes.get(i)).getEsPotCollir()){
                    plantesCollides.add(plantes.get(i));
                    plantes.remove(i);
                    i--;
                }
            }
            
        }
        
        return plantesCollides;
    }

    @Override
    public List<Planta> treurePlantesNoVives() {
        List<Planta> plantesMortes = new ArrayList<>();
        
         /*
        Si modifiquem el número de valors d'un List (afegir o eliminar) 
        dins d'un for each, no podrem seguir recorrent-lo fins al final 
        (caldria sortir amb break), si no es llança ConcurrentModificationException
        
        Quan cal eliminar i recorrer fins al final:
         */
        for (int i = 0; i < plantes.size(); i++) {
            if (!plantes.get(i).esViva) {
                
                plantesMortes.add(plantes.get(i));
                plantes.remove(i);
                /*
                cal tornar a recorrer la mateixa posició pq ara en aquesta hi ha
                el que estava a la següent posició abans d'esborrar
                 */
                i--;
            }
        }
        return plantesMortes;

    }

    public void passarTemps() {
        for (Planta planta : plantes) {
            planta.creixer();
        }
    }

    @Override
    public String toString() {
        return "Hivernacle{" + "plantes=\n" + plantes + '}';
    }

}
