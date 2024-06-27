package pkg61_exemples01_bd_escola;

public class TestExemple {

    public static void main(String[] args) {

        ConnexioEscola connexio = new ConnexioEscola();

        connexio.connectar(); //estem rebent una booleana, tot i que no la fem servir

        //ho executem només una vegada, després comentar aquestes línies
        /*
        //inserir, actualitzar i eliminar alumnes:
        connexio.consultaUID("INSERT INTO alumnes (nom) VALUES ('Pep')");
        connexio.consultaUID("INSERT INTO alumnes (nom) VALUES ('Ana')");
        connexio.consultaUID("INSERT INTO alumnes (nom) VALUES ('Luisa')");

        connexio.consultaUID("UPDATE alumnes SET nom = 'Jose' WHERE nom = 'Pep'");
        connexio.consultaUID("INSERT INTO alumnes (nom) VALUES ('Ona')");
        connexio.mostrarAlumnes("SELECT * FROM alumnes");

        connexio.consultaUID("DELETE FROM alumnes WHERE nom = 'Ona'");
        
        //inserir notes:
        connexio.consultaUID("INSERT INTO notes (nota, alumne_id) VALUES (10, 1)");
        connexio.consultaUID("INSERT INTO notes (nota, alumne_id) VALUES (7, 2)");
        connexio.consultaUID("INSERT INTO notes (nota, alumne_id) VALUES (7, 3)");
         */
        //
        
        connexio.consultaUID("INSERT INTO alumnes (nom) VALUES ('Luisa')");
         connexio.consultaUID("INSERT INTO notes (nota, alumne_id) VALUES (4, 4)");
        connexio.mostrarAlumnes("SELECT * FROM alumnes");

        System.out.println("PreparedStatement: Mostrar id de l'alumne Luisa");
        connexio.consultaSelectPS("Luisa");

        System.out.println("Alumnes amb nota 7");
        connexio.mostrarAlumnes(
                "SELECT alumnes.id, nom FROM alumnes inner join notes \n"
                + "on alumnes.id = notes.alumne_id \n"
                + "where nota = 7");

        connexio.tancarConnexio();
    }

}
