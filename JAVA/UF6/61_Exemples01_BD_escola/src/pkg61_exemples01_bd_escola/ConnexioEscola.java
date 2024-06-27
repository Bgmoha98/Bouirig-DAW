package pkg61_exemples01_bd_escola;

/*
JDBC és una API comuna per a l’accés a qualsevol tipus de BD, 
independentment del fabricant de la BD (MySql, o qualsevol altre), però 
caldrà un controlador (driver) específic per a la BD de cada fabricant

Fixa't que no hi ha import del controlador de MySql per a l'API JDBC, 
ja que la classe com.mysql.cj.jdbc.Driver l'afegim al projecte, 
localitzant-lo manualment desde Libraries / Add JAR/Folder
Així la classe del controlador de MySql quedarà inclosa al projecte sense
fer import.

 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//Totes les classes que importem són del paquet java.sql

public class ConnexioEscola {

    /* ATRIBUT CONNEXIÓ:
    Hi guardarem una instància de la classe Connection, a partir de la que es
    pot interactuar per dur a terme qualsevol acció amb la BD
     */
    private Connection connexio = null;

    /* 
    PARÀMETRES DE LA CONNEXIÓ: urlBD, usuari i contrasenya
    
    urlBD: Ubicació de la BD. 
    Nosaltres el fem servir sempre igual, excepte l'última paraula, que canvia 
    segons el nom de la BD.
    Exemple: "jdbc:mysql://localhost:3306/escola"
    
    Parts de l'exemple:
        Protocol: (tot el que va abans de //)
            s'indiquen 2 protocols: jdbc i mysql
        Nom de la màquina (o IP) on és la BD: localhost
        Port del servei de la BD: sempre serà un número, aquí és 3306, però 
                podria ser un altre, segons la configuració de MySql
        Nom de la BD a la que es vol accedir: escola (diferent per cada BD)
     */
    private String urlBD = "jdbc:mysql://localhost:3306/escola";
    private String usuari = "root";
    private String contrasenya = "1234";

    /*
    A l’exemple els paràmetres de la connexió estan "escrits" al codi. 
    Però, en una aplicació real seria millor tenir-los en un fitxer de 
    configuració o com a paràmetre d’execució. Seria més fàcil canviar-los si 
    canvien les dades de la BD (ubicació, port, nom).
    Aleshores tindriem un constructor que inicialitzaria els atributs
    segons la configuració rebuda
     */
    public boolean connectar() {
        boolean connectat = false;
        /*
        Nom del controlador (driver)
        És específic de la BD MySql per a l'API JDBC:

        Els controladors sempre són una classe Java, identificada amb el nom 
        del paquet que la conté i el nom de la classe.

        Per a BD MySql sempre serà igual:
            Nom del paquet: com.mysql.cj.jdbc
            Nom de la classe: Driver

        Per a tenir-lo disponible l'afegim al projecte desde 
        Libraries / Add JAR/Folder, però no en fem import
         */
        String driverNom = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driverNom); //Carrega la classe per fer-la servir

            /* ESTABLIR LA CONNEXIÓ a la BD:
            
            A DriverManager.getConnection() li passem els paràmetres de la connexió:
                Ubicació de la BD:
                    Protocols
                    Nom de la màquina (o IP) on és la BD
                    Port del servei de la BD
                    Nom de la BD a la que es vol accedir
                Usuari de la BD
                Contrasenya de la BD
              
            Retorna un objecte Connection. El farem servir per accedir a 
            la connexió
             */
            connexio = DriverManager.getConnection(
                    urlBD, usuari, contrasenya);

            connectat = true;
            System.out.println("Connexió establerta");

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No s'ha pogut accedir a la BD: " + ex.getMessage());
        }

        return connectat;
    }

    //Cal tancar manualment la connexió quan ja no es necessita (alliberar recursos)
    public boolean tancarConnexio() {

        boolean haTancat = false;

        try {
            /*
            Retornar true si la connexió estava oberta i s'ha tancat, false si 
            ja estava tancada o no es pot accedir a l'objecte Connection
             */
            if (connexio != null && !connexio.isClosed()) {
                connexio.close();
                haTancat = true;
                System.out.println("S'ha tancat la connexió.\n");
            }
        } catch (SQLException ex) {
            System.out.println("Error en accedir a la BD: \n" + ex.getMessage());
        }
        return haTancat;
    }

    /*
    Cal diferenciar entre les crides per modificar el contingut de la BD i les
    consultes de dades --> programem mètodes diferents:
     */
    public void consultaUID(String stringSql) { //consulta Update Insert Delete

        Statement miStatement;

        try {
            /*
        A partir de l'objecte de la classe Connection, obtenim un objecte Statement 
        per enviar la sentència SQL a la BD
             */
            miStatement = connexio.createStatement();
            /*
            Per fer modificacions al contingut de la BD (INSERT, UPDATE, DELETE) 
            hem d'usar el mètode executeUpdate()
             */
            miStatement.executeUpdate(stringSql);
            System.out.println("Instrucció executada correctament: \n" + stringSql + "\n");

        } catch (SQLException ex) {
            System.out.println("Error en executar la instrucció: \n" + stringSql
                    + ex.getMessage());
        }
    }

    /*
    Si la sentència SQL és de consulta de dades, l'API JDBC processa la resposta 
    de la BD i la retorna com un objecte del tipus ResultSet. Amb els mètodes de
    ResultSet extraurem la informació associada
     */
    public void mostrarAlumnes(String stringSql) {

        Statement miStatement;
        ResultSet miResultSet;

        try {
            /*
        A partir de l'objecte de la classe Connection, obtenim un objecte Statement 
        per enviar la sentència SQL a la BD (igual com a les consultes UID)
             */
            miStatement = connexio.createStatement();

            /*
            Amb executeQuery() de Statement obtenim una instància de ResultSet
            La instància de ResultSet retornada per una crida a executeQuery() 
            conté la llista de files resultant de la consulta a la BD
             */
            miResultSet = miStatement.executeQuery(stringSql);

            /*
            Per recorrer la llista de files es fa sempre fila per fila, avançant 
            amb el next() del Resultset
            Abans de llegir el 1r resultat hem d'executar next() per posar-nos
            a la primera fila
             */
            while (miResultSet.next()) { //Avança 1 fila i retorna true si és vàlida

                /*
                Un cop som a la fila que es vol llegir, agafem el valor 
                d'una cel·la indicant el nom de la columna.
                El mètode depèn del tipus de dades de la columna a consultar
                passant el nom de la columna com a argument.
                 */
                System.out.println(miResultSet.getInt("id") + ": "
                        + miResultSet.getString("nom"));
            }
            System.out.println("Consulta realitzada correctament.\n");

        } catch (SQLException ex) {
            System.out.println("Error en executar el SELECT: \n" + ex.getMessage());
        }

    }

    /* PreparedStatement:
    
    Classe que executa una sentència SQL, que té interrogants (?) en comptes 
    d'alguns valors, que s'indicaran després com a paràmetres 
    (ex: el nom del client a buscar, etc).
    
    p.ex. l'usuari podria entrar per teclat el nom a buscar i després es faria
    servir al fer la consulta. O es pot fer la consulta per cada valor d'un array.
    
    PreparedStatement és més eficient que Statement si es fa diverses vegades
    la mateixa consulta, canviant només el valor dels paràmetres
    
    Podem fer servir PreparedStatement tant per consulta de dades com 
    per fer modificacions al contingut de la BD 
     */
    public void consultaSelectPS(String miNombre) {
        /* 
        A la sentència SQL posem interrogant (?) al lloc de cada valor 
        que volem parametritzar
         */
        String stringSql = "SELECT * FROM alumnes WHERE nom = ?";

        PreparedStatement miPreparedStatement;
        ResultSet miResultSet;

        try {

            /*
            Ojo, creem l'objecte PreparedStatement amb un mètode específic
            i aquí sí que li passem l'string SQL
             */
            miPreparedStatement = connexio.prepareStatement(stringSql);
            /*
            Assignar valor a cada interrogant de la preparedStatement:
            
            Ho fem amb els mètodes setXxx(posicio, valor):
                --> Xxx és el tipus de dada: hi ha un mètode diferent per 
                      cada tipus de dada, com setInt() o setDouble()...
                --> posicio indica la posició de l'interrogant (comença en 1)
                --> valor indica el valor que volem assignar
             */
            miPreparedStatement.setString(1, miNombre); //1r interrogant

            miResultSet = miPreparedStatement.executeQuery();
            //A partir d'aquí el codi serà igual que si fos un Statement estàndar

            while (miResultSet.next()) {
                System.out.println(miResultSet.getInt("id") + ": "
                        + miResultSet.getString("nom"));
            }
            System.out.println("Consulta realitzada correctament.\n");

        } catch (SQLException ex) {
            System.out.println("Error en executar la consulta preparada. \n"
                    + ex.getMessage());
        }
    }
}
