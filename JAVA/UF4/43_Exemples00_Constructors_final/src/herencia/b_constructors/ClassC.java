package herencia.b_constructors;

public class ClassC extends ClassB {

    public ClassC() {
        System.out.println(" Constructor  ClassC");

        System.out.println("Des de ClassC valorA: " + this.getValorA());

    }

    public void metC() {
        this.metA();
        this.metB();
    }
    
    @Override
    public void metA(){
        
        
    }
}
