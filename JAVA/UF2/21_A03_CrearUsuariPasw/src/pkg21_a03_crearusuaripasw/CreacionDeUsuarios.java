/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21_a03_crearusuaripasw;

/**
 *
 * @author mohab
 */
public class CreacionDeUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contraseña = "";
        String[][] usuarisDades = {
            {"Aleix", "Garcia", "Fernandez", "agarcia", "MnX2rEuU"},
            {"Laura", "Perez", "Lopez", "lperez", "j0Ixm1pW"},
            {"Ana", "Garciales", "Lopez", "agarciales", "YmUk7ndo"},
            {"Adria", "Garcia", "Perez", "agarcia2", "U4ZRf0Mn"},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        };
        int indexUsuaris = 4;  //posicions ocupades

        for (int i = 4; i < usuarisDades.length; i++) {
            for (int j = 0; j < usuarisDades[5].length; j++) {
                usuarisDades[i][4] = CrearUsuariosMetodos.generadorContraseñas();
            }
        }

    }
}
