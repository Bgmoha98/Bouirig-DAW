package exemple01;

//Creem la nostra pròpia excepció, derivant de la classe Exception: serà de 
//gestió obligatòria
public class ExcepcioNegatiu extends Exception {

    public ExcepcioNegatiu(String msg) {
        
        super(msg);
    }
    
}
