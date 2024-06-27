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
public class Ejercicio3 {
    
   
     public static void main(String[] args) {
         
         Scanner teclado = new Scanner(System.in);
         
         int num, unidades, num2, unidades2, num3, unidades3;
         String producto, marca, asteriscos, producto2, marca2, producto3, marca3;
         double precio, precio2, precio3, importe,importe2, importe3, importeTotal;
         
         System.out.println("Que producto desea comprar?");
         producto = teclado.nextLine();
         
         System.out.println("Indica la marca del marca del producto");
         marca = teclado.nextLine();
         
          System.out.println("Indica el precio del producto");
         precio = teclado.nextDouble();
         
         System.out.println("Indica las unidades que desea comprar");
         unidades = teclado.nextInt();
         
         System.out.println("Indica el num (1, 2 o 3)");
         num = teclado.nextInt();
         
         teclado.nextLine(); // Limpio buffer
         
         // Segunda tanda de preguntas
          System.out.println("Que producto desea comprar?");
         producto2 = teclado.nextLine();
         
         System.out.println("Indica la marca del marca del producto");
         marca2 = teclado.nextLine();
         
          System.out.println("Indica el precio del producto");
         precio2 = teclado.nextDouble();
         
         System.out.println("Indica las unidades que desea comprar");
         unidades2 = teclado.nextInt();
         
         System.out.println("Indica el num (1, 2 o 3)");
         num2 = teclado.nextInt();
         
          teclado.nextLine(); // Limpio buffer
         
         // Tercera tanda de preguntas
          System.out.println("Que producto desea comprar?");
         producto3 = teclado.nextLine();
         
         System.out.println("Indica la marca del marca del producto");
         marca3 = teclado.nextLine();
         
          System.out.println("Indica el precio del producto");
         precio3 = teclado.nextDouble();
         
         System.out.println("Indica las unidades que desea comprar");
         unidades3 = teclado.nextInt();
         
         System.out.println("Indica el num (1, 2 o 3)");
         num3 = teclado.nextInt();
         
         importe =  precio * unidades;
         importe2 =  precio2 * unidades2;
         importe3 =  precio3 * unidades3;
         asteriscos = "**********************";
         importeTotal = importe + importe2 + importe3;
         
         System.out.printf(" %s %8s %19s %14s %11s%s\n ", "UNITATS", "PRODUCTE", "MARCA", "PREU €/U", "IMPORT €"," NUM");
         System.out.println("");
         System.out.printf("%6d %s %13s %10.2f %11.2f %03d\n ", unidades, producto, marca, precio, importe, num);
         System.out.println("");
         System.out.printf(" %6d %s %16s %13.2f %11.2f %03d\n ", unidades2, producto2, marca2, precio2, importe2, num2);
         System.out.println("");
         System.out.printf(" %6d %s %20s %15.2f %11.2f %03d\n ", unidades3, producto3, marca3, precio3, importe3, num3);
         System.out.println("");
         System.out.printf(" %62s ", asteriscos);
         System.out.println("");
         System.out.printf(" %54s %.2f ","Import total:", importeTotal);
          System.out.println("");
          System.out.printf(" %62s ", asteriscos);
          System.out.println("");
     }//44
}
