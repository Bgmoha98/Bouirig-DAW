package exemple01;

public class TestPagosTargeta {

    public static void main(String[] args){

        PagosTarjeta pagos1 = new PagosTarjeta();
        
        pagos1.pagarTarjetaConCatch(-5);
        pagos1.pagarTarjetaConCatch(2);
        
        /*
        aquesta línia ha d'anar dins d'un bloc try-catch.
        Si no, dóna error de compilació "unreported exception", perquè l'excepció
        que llança el mètode és de gestió obligatòria, però ha fet throws.
         */
        //pagos1.pagarTarjetaConThrows(-6);
        try {
            pagos1.pagarTarjetaConThrows(-11);
            pagos1.pagarTarjetaConThrows(6);

        } catch (ExcepcioNegatiu ex) {
            System.err.println("Missatge de l'excepció al main: " + ex.getMessage());

        } finally {
            System.out.println("Aquest codi sempre s'executa. " 
                    + pagos1.toString());
        }
        
        pagos1.pagarTarjetaConCatch(4);
    }

}
