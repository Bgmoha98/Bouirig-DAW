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
public class Ex4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int anyo, dia, mes, moduloEntre400, moduloEntre4, moduloEntre100;
        String fecha, stringMes2;

        System.out.println("Introduce una fecha en formato dd/mm/aaaa: ");
        fecha = teclado.nextLine();

        if (fecha.length() != 10) {
            System.out.println("Formato fecha incorrecto, utiliza el siguiente formato (dd/mm/aaaa) ");
        } else {

            
            anyo = Integer.parseInt(fecha.substring(6));

            mes = Integer.parseInt(fecha.substring(3, 5));

            dia = Integer.parseInt(fecha.substring(0, 2));

            moduloEntre400 = anyo % 400;
            moduloEntre4 = anyo % 4;
            moduloEntre100 = anyo % 100;

            if (mes < 1 || mes > 12) {
                System.out.println("El mes ha de ser entrre 1 y 12.");

            }else {
                
                if(!(moduloEntre400 == 0 || moduloEntre4 == 0 && moduloEntre100 != 0)
                    && mes == 02 && (dia >= 28)) {
                System.out.println("El dia ha de ser entrre 1 y 28.");
            }

            switch (mes) {
                case 1:
                    stringMes2 = "Enero";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                // System.out.printf("%d de %s de %d", dia, stringMes2, anyo);
                case 2:
                    stringMes2 = "Febrero";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 3:
                    stringMes2 = "Marzo";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 4:
                    stringMes2 = "Abril";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 5:
                    stringMes2 = "Mayo";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 6:
                    stringMes2 = "Junio";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 7:
                    stringMes2 = "Julio";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 8:
                    stringMes2 = "Agosto";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 9:
                    stringMes2 = "Septiembre";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 10:
                    stringMes2 = "Octubre";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 11:
                    stringMes2 = "Noviembre";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                case 12:
                    stringMes2 = "Diciembre";
                    System.out.println("-------------------------------------------");
                    System.out.printf("Fecha verificada: %d de %s de %d", dia, stringMes2, anyo);
                    break;
                default:
                    break;
            }
            }
        }
    }

}
