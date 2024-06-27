/*
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
 * Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */
package javaapplication50;

/**
 *
 * @author mohab
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num = 2;
        int num2 = 2;
        int numMayor;

        if (num > num2 ) {
            System.out.println("El numero mayor es: " + num);
        } else if (num < num2) {
         System.out.println("El numero mayor es: " + num2);
        } else if ( num == num2){
         System.out.println("Los numeros " + num + " , " + num2 + " son iguales");
        }
    }

}
