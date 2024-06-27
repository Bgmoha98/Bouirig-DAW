/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1_pt1_bouirigmohamed;

/**
 *
 * @author mohab
 */
public class Ex1 {

    public static void main(String[] args) {
        
        // Ejercicio 1
        // Declaro 3 variables float y una int
        float valorFloat1 = 0.4F;
        float valorFloat2 = 0.4F;
        float valorFloat3 = 0.4F;
        int valorInt;
        
        // Realizo la operacion en una sentencia haciendo cast a las operaciones
        valorInt = (int) (valorFloat1 + valorFloat2 + valorFloat1); // devuelve 1
        
        //Ejercicio 2
        
        // Declaro la variable luz como int y con la velocidad de la luz.
        int luz = 299_792_458;
        
        // En el println para hacer la operacion,  
        // primero paso la variable int(Luz) a long para que me pueda dar los
        // valores exactos al realizar la multiplicacion
        System.out.println( ("La velocidad de la nave es: " +(long) luz * 10));
        

    }

}
