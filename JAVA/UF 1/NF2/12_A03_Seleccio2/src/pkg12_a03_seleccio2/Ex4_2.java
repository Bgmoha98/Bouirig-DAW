/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_a03_seleccio2;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ex4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int diaIn, mesIn, anyIn;

        int diesMes;

        String dataIn;
        String auxString;
        Scanner lector = new Scanner(System.in);

        System.out.println("________________________________\n"
                + "Introdueix una data (dd/mm/aaaa)");

        dataIn = lector.nextLine();
        System.out.println("________________________________\n");

        //verificar format dd/mm/aaaa (són 10 caràcters en total)
        if (dataIn.length() != 10) {
            System.out.println(
                    "Format incorrecte:\n"
                            + "Cal seguir el format dd/mm/aaaa");
        } else {
            /*
            Agafar cada tros del String llegit i convertir-lo a enter
            */
            
            // Tros de cadena del número de dia
            auxString = dataIn.substring(0, 2); //torna els caràcters 0 i 1

            // Convertir-lo a enter:
            diaIn = Integer.parseInt(auxString);

            // Puc convertir a enter la substring, en una sola expressió
            mesIn = Integer.parseInt(dataIn.substring(3, 5)); //caràcters 3 i 4

            anyIn = Integer.parseInt(dataIn.substring(6, 10));//caràcters 6 a 9

            /* Passem a verificar la data:
            
            Si mes és correcte:
            -. calcula el número de dies del mesIn
            -. verifica que dia es correcte
            Si dia és correcte:
            -. imprimir la respuesta
            
            */
            // Detectar error en mesIn
            if (mesIn < 1 || mesIn > 12) {

                System.out.println("Error a la data introduïda:\n"
                        + "El mes ha de ser entre 1 i 12");

            } else {

                // calcular nombre de dies del mes:
                switch (mesIn) {
                    case 2:
                        /* Un año es bisiesto si:
                        -. es múltiplo de 4 () y no de 100, (como 1988, pero no 1900)
                        -. es múltiplo de 4 y de 400 (como 2000)
                        */
                        if (anyIn % 4 == 0 && (anyIn % 100 != 0 || anyIn % 400 == 0)) {
                            diesMes = 29;

                        } else {
                            diesMes = 28;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        diesMes = 30; //abril(4) juny(6) setembre(9) novembre(11)
                        break;
                    default:
                        diesMes = 31;
                }

                // Detectar error al dia:
                if (diaIn < 1 || diaIn > diesMes) {

                    System.out.println("Error a la data introduïda:");
                    System.out.printf("El dia ha de ser entre 1 i %d%n", diesMes);

                } else { // Data verificada

                    //Donar resposta:
                    System.out.println("Data verificada: " + dataIn);
                }

            }
        }
    }
    
}
