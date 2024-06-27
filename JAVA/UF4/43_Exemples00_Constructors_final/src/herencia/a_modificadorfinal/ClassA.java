package herencia.a_modificadorfinal;

public class ClassA {

    /**
     * Aquest mètode no es podrà sobreescriure en les classes derivades o
     * subclasses per ser final.
     */
    public final void met1(String text) {
        System.out.println("met1 :" + text);
    }

    public void met2() {
        System.out.println("met2 de ClassA");
    }

}
