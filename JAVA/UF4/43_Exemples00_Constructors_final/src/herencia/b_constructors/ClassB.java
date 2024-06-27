package herencia.b_constructors;

public class ClassB extends ClassA {

    public ClassB() {
        System.out.println(" Constructor ClassB");
        System.out.println("valorA: " + getValorA());
    }

    public void metB() {
        System.out.println("Des de ClassB"
                + " metB");
    }

    @Override
    public void metA() {
        System.out.println("Des de ClassB"
                + " metA sobreescrit");
    }

}
