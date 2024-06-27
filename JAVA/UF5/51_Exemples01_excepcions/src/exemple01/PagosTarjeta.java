package exemple01;

import java.util.ArrayList;

class PagosTarjeta {

    private ArrayList<Integer> pagos = new ArrayList();

    public void pagarTarjetaConCatch(int importe) {

        try {
            if (importe < 0) {
                throw new ExcepcioNegatiu("Valor negatiu.");
            }

            /* Podem afegir més condicions que llancin les seves excepcions
            Cada excepció ha de tenir la seva classe (cal crear les classes
            ExcepcioBaixa i ExcepcioAlta)
            
            if (importe > 0 && importe <3){
                throw new ExcepcioBaixa("Cantidad baja para pago con tarjeta");
            }
            if (importe > 500){
                throw new ExcepcioAlta("Superado el límite de compra");
            } */
             
            pagos.add(importe);

        } catch (ExcepcioNegatiu ex) {
            System.err.println(
                    "Missatge de l'excepció al mètode: " + ex.getMessage());
            /*
        } catch (ExcepcioBaixa ex) {
            System.err.println(
                    "Missatge de l'excepció al mètode: " + ex.getMessage());
        } catch (ExcepcioAlta ex) {
            System.err.println(
                    "Missatge de l'excepció al mètode: " + ex.getMessage());
             */
        } finally {
            System.out.println(
                    "Aquest codi sempre s'executa. Pagos: " + pagos);
        }
    }

    public void pagarTarjetaConThrows(int importe) throws ExcepcioNegatiu {
        /*
        Com que fem throws, ExcepcióNegatiu se li passa al mètode que hagi cridat
        a pagarTarjetaConThrows
        */

        if (importe < 0) {
            throw new ExcepcioNegatiu("Nombre negatiu.");
        }

        pagos.add(importe);

    }

    @Override
    public String toString() {
        return "Pagos: {" + pagos.toString() + "}";
    }
}
