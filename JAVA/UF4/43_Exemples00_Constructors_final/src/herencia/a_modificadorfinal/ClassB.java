package herencia.a_modificadorfinal;

public class ClassB extends ClassA {

    private int valor;

    @Override
    public void met2() {
        System.out.println("met2 de ClassB");
    }

    public void met3() {
        met2();
        this.met2();
        super.met2();
        met1("hola");
        this.met1("adeu");
        super.met1("bon dia");
    }

}
