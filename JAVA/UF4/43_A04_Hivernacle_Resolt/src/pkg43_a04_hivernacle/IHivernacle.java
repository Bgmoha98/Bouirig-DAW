package pkg43_a04_hivernacle;

import java.util.List;

public interface IHivernacle {
    
    //Només conté mètodes public i abstractes
    boolean afegirPlanta (Planta p);
    List<Fruit> collirFruits();
    
    void incrementa();;
void incrementa(int increment);
    
    List<Planta> collirPlantes();
    List<Planta> treurePlantesNoVives();
    
}
