package herencia.b_constructors;

public class ClassA {

    private int valorA;

    public ClassA() {
        valorA = 100;
        System.out.println(" Constructor ClassA");
        
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public void metA() {
        System.out.println("Des de ClassA metA");
    }

}
