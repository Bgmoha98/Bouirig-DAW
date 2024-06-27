/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a06_dadesentrada1;

import java.util.Scanner;

/**
 *
 * @author mohab
 */
public class Ejercicio1 {
    
     public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
         
         // Declaro las variables 
         String redSocial, frecuenciaPublicacion;
         char inicialUsuario;
         int usuariosSeguidos;
         double ultimaConexion;
         boolean usoRedesSociales;
         
         // Solicito informacion por teclado
         System.out.println("Introduce cual es tu red social preferida:");
         redSocial  = teclado.next();
         
         System.out.println("Introduce cual es tu inicial de usuario sin la @:");
         inicialUsuario  =  teclado.next().charAt(0);
         
         System.out.println("Introduce cuantos usuarios sigues:");
         usuariosSeguidos  = teclado.nextInt();
         
         System.out.println("Introduce cuantos horas hace desde que has revisado las redessociales: (Ejemplo 1,75 es equivalente a 1h 45minl)");
         ultimaConexion  = teclado.nextDouble();
         
         teclado.nextLine(); // limpio buffer
         
         System.out.println("Introduce cual es tu frecuencia de publicacion en redessociales: (Ejemplo una publicacion cada 2hl)");
         frecuenciaPublicacion  = teclado.nextLine();
         
         System.out.println("Crees que utilizas demasiado las redes sociales ?: (Ejemplo true / false)");
         usoRedesSociales  = teclado.nextBoolean();
         
         // Muestro el resultado con PRINTLN         
         System.out.println("La red social preferida es: " + redSocial + "\n" +  "La primera letra de mi usuario es: " + inicialUsuario);
         System.out.println("Sigues ha  " + usuariosSeguidos + " usuarios. " + "\n" + "Tu ultima conexion fue hace: " + ultimaConexion + " horas" );
         System.out.println("Tu frecuencia de publicación es cada: " + frecuenciaPublicacion + "\n" + "Y crees que utilizas demasiado las redes sociales?  " + usoRedesSociales);
         
         // Muestro el resultado con PRINTF 
         System.out.printf("La red social preferida es %s \n La primera letra de mi usuario es %c ", redSocial, inicialUsuario);
         System.out.printf("Sigues ha %d usuarios. \n Tu ultima conexion fue hace %f  horas ",usuariosSeguidos,  ultimaConexion );
         System.out.printf("Tu frecuencia de publicación es cada %s \n Y crees que utilizas demasiado las redes sociales? %b ", frecuenciaPublicacion, usoRedesSociales);
         
    
        }

}
