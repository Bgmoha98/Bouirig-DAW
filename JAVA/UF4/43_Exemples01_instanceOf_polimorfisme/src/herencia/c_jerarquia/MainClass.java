package herencia.c_jerarquia;

public class MainClass {

    public static void main(String[] args) {

        Berlina berlina = new Berlina(5, 5, "1111ASF", "Renault", "Scenic");
        System.out.println();

        Vehicle v = new Vehicle("2222BBB", "marca2", "model2");
        System.out.println();

        Vehicle v3 = new Cotxe(3, 4, "3333CCC", "marca3", "model");
        System.out.println();

        Vehicle v4 = new Berlina(5, 5, "4444DDD", "marca4", "model");
        System.out.println();

        System.out.println("v3.marca: " + v3.marca);
        System.out.println("v3.matricula: " + v3.matricula);
        
        //  No puc accedir a getPortes() des de v3 pq el tipus de la variable 
        // (la classe de referencia) és Vehicle
        //v3.getPortes(); 

        /* 
        L'operador instanceof torna true si l'objecte al que referencia la 
        variable de la seva esquerra (ex cotxe1) és de la classe de la dreta:
        
           cotxe1 instanceOf Cotxe --> true
        o d'una subclasse:
           berlina1 instanceOf Cotxe --> true
        
        O dit d'una altra manera:
        Si la classe de la dreta és la de l'objecte creat o la de la superclasse:
          cotxe1 instanceOf Vehicle --> true
          cotxe1 instanceOf Berlina --> false
        
         */
        //Vehicle v3 = new Cotxe(3, 4, "3333CCC", "marca3", "model");
        System.out.println();
        System.out.println(
                "v3 instanceof Cotxe --> " + (v3 instanceof Cotxe)); //-->true
        System.out.println(
                "v3 instanceof Berlina --> " + (v3 instanceof Berlina));//-->false
        System.out.println(
                "v3 instanceof Vehicle --> " + (v3 instanceof Vehicle));//-->true
    }
}
