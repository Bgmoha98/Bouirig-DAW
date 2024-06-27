---------------------------------------------
--   CREACIÓ DE TIPUS
----------------------------------------------
/* Crear el següents tipus OBJECT:


NACIONALITAT_TYPE:
    nom_nacionalitat: VARCHAR2(40)
    nom_pais: VARCHAR2(40)
    funció code_pais: torna les dues primeres lletres del pais
*/
SET SERVEROUTPUT ON;

DROP TABLE NACIONALITAT_TYPE;
CREATE OR REPLACE TYPE NACIONALITAT_TYPE AS OBJECT(
    nom_nacionalitat VARCHAR2(40),
    nom_pais VARCHAR2(40),
    MEMBER FUNCTION code_pais RETURN VARCHAR2);

CREATE OR REPLACE TYPE BODY NACIONALITAT_TYPE AS
MEMBER FUNCTION code_pais
RETURN VARCHAR2
    IS
        --Declaració de variables
        cadena VARCHAR2(2);
    BEGIN
        cadena := SUBSTR(nom_pais,1,2);
    RETURN cadena;
    END code_pais;
    
END;

DECLARE 
 NAS NACIONALITAT_TYPE := NACIONALITAT_TYPE('ESPAÑOLA','ESPAÑA');
BEGIN
 DBMS_OUTPUT.PUT_LINE(NAS.CODE_PAIS);
END;

/*
AUTOR_TYPE:
    nif: VARCHAR2(9)
    nom: VARCHAR2(50),
    data_naixement: DATE
    nacionalitat: referència a  NACIONALITAT_TYPE
    funció edat: torna els anys (sense decimals) 
    
*/

CREATE OR REPLACE TYPE AUTOR_TYPE AS OBJECT(
    nif VARCHAR2(9),
    nom VARCHAR2(50),
    data_naixement DATE,
    nacionalitat REF NACIONALITAT_TYPE,
    MEMBER FUNCTION edat RETURN INTEGER);

CREATE OR REPLACE TYPE BODY AUTOR_TYPE AS
MEMBER FUNCTION edat
RETURN INTEGER
    IS
        --Declaració de variables
        edad INTEGER;
    BEGIN
        edad := (SYSDATE - data_naixement) / 365; --puede dar decimales
    RETURN edad;
    END edat;
    
END;
/



/*
DOMICILI_TYPE:
    carrer: VARCHAR2(40)
    num: INTEGER
    ciutat: VARCHAR2(40)
    codi_postal: VARCHAR2(5)
    funció adreça_completa: torna una línia formada per la concatenació de tots els
                            atributs, separats per un espai

*/                            
CREATE OR REPLACE TYPE DOMICILI_TYPE AS OBJECT(
    carrer VARCHAR2(40),
    nume INTEGER,
    ciutat VARCHAR2(40),
    codi_postal VARCHAR2(5),
    MEMBER FUNCTION adreça_completa RETURN VARCHAR2);
                            
CREATE OR REPLACE TYPE BODY DOMICILI_TYPE AS
MEMBER FUNCTION adreça_completa
RETURN VARCHAR2
    IS
        --Declaració de variables
        direccion VARCHAR2(90);
        numero VARCHAR2(4);
    BEGIN
        numero := TO_CHAR(nume);
        direccion := carrer || '  ' || numero || '  ' || ciutat || '  ' || codi_postal;
    RETURN direccion;
    END adreça_completa;
    
END;

DECLARE 
 NAS DOMICILI_TYPE := DOMICILI_TYPE('PABLO PICASSO',88,'SABADELL','08140');
BEGIN
 DBMS_OUTPUT.PUT_LINE(NAS.adreça_completa);
END;
                            
/*
EDITORIAL_TYPE:
    nom: VARCHAR2(50)
    domicili: DOMICILI_TYPE,
    num_llibres_publicats: INTEGER,
    funció milers_llibres_publicats: torna el número de llibres publicats dividit per
                                1000 (sense decimals)
*/

CREATE OR REPLACE TYPE EDITORIAL_TYPE AS OBJECT(
    nom VARCHAR2(50),
    domicili DOMICILI_TYPE,
    num_llibres_publicats INTEGER,
    MEMBER FUNCTION milers_llibres_publicats RETURN INTEGER);
    --funció milers_llibres_publicats: torna el número de llibres publicats dividit 
    --per 1000 (sense decimals)
CREATE OR REPLACE TYPE BODY EDITORIAL_TYPE AS
MEMBER FUNCTION milers_llibres_publicats
RETURN INTEGER
    IS
        --Declaració de variables
        numero_libros INTEGER;
    BEGIN
        numero_libros := FLOOR(num_llibres_publicats/1261) ;
    RETURN numero_libros;
    END milers_llibres_publicats;
    
END;


---------------------------------------------
--   CREACIÓ DE TAULES
----------------------------------------------
--Crear les següents taules
--
--NACIONALITAT_TAB: taula d'objectes NACIONALITAT_TYPE          
--PRIMARY KEY: nom_nacionalitat         
--OBJECT IDENTIFIER la primary key
DROP TABLE NACIONALITAT_TAB;

CREATE TABLE NACIONALITAT_TAB OF NACIONALITAT_TYPE(
    nom_nacionalitat PRIMARY KEY)
OBJECT IDENTIFIER IS PRIMARY KEY;

--AUTOR_TAB: taula d'objectes AUTOR_TYPE          
--PRIMARY KEY: nif 
--nacionalitat: referencia a la taula NACIONALITAT_TAB
--OBJECT IDENTIFIER la primary key
DROP TABLE AUTOR_TAB;

CREATE TABLE AUTOR_TAB OF AUTOR_TYPE(
    nif PRIMARY KEY,
    nacionalitat SCOPE IS NACIONALITAT_TAB)
OBJECT IDENTIFIER IS PRIMARY KEY;

--EDITORIAL_TAB: taula d'objectes     EDITORIAL_TYPE     
--PRIMARY KEY: nom
--OBJECT IDENTIFIER la primary key.

DROP TABLE EDITORIAL_TAB;

CREATE TABLE EDITORIAL_TAB OF EDITORIAL_TYPE(
    nom PRIMARY KEY)
    --domicili SCOPE IS DOMICILI_TYPE)
OBJECT IDENTIFIER IS PRIMARY KEY;

---------------------------------------------
--  SQL: ACCESS A TAULES DE TIPUS OBJECT
----------------------------------------------
--1. Inserir 3 objectes a la taula NACIONALITAT_TAB 
INSERT INTO NACIONALITAT_TAB
VALUES ( NACIONALITAT_TYPE('ESPAÑOLA', 'ESPAÑA') );

INSERT INTO NACIONALITAT_TAB
VALUES ( NACIONALITAT_TYPE('MARROQUI', 'MARRUECOS') );

INSERT INTO NACIONALITAT_TAB
VALUES ( NACIONALITAT_TYPE('BRASILEÑO', 'BRASIL') );

--2. Inserir 3 objectes a la taula AUTOR_TAB. Cada objecte ha de
--tenir una nacionalitat diferent
    
INSERT INTO AUTOR_TAB
VALUES ( AUTOR_TYPE('48230000F', 'MOHA', TO_DATE('29/01/1998'),(SELECT REF(N) FROM NACIONALITAT_TAB N WHERE N.nom_nacionalitat = 'ESPAÑOLA')));

INSERT INTO AUTOR_TAB
VALUES (AUTOR_TYPE('48000000F','Sergio',TO_DATE('28/05/1992'),(SELECT REF(N) FROM NACIONALITAT_TAB N WHERE n.nom_nacionalitat = 'MARROQUI')));

INSERT INTO AUTOR_TAB
VALUES (AUTOR_TYPE('40000000F','Marc',TO_DATE('12/06/1989'),(SELECT REF(N) FROM NACIONALITAT_TAB N WHERE n.nom_nacionalitat = 'BRASILEÑO')));

--3. Inserir 3 objectes a la taula EDITORIAL_TAB   

INSERT INTO EDITORIAL_TAB
VALUES (EDITORIAL_TYPE('El Vapor',DOMICILI_TYPE('Ramon Llull',86,'Santa Perpetua','08130'),16025));

INSERT INTO EDITORIAL_TAB
VALUES (EDITORIAL_TYPE('Ariel',DOMICILI_TYPE('Pablo Picasso',120,'Madrid','28001'),17894));

INSERT INTO EDITORIAL_TAB
VALUES (EDITORIAL_TYPE('Alianza',DOMICILI_TYPE('La Paz',2,'Madrid','28005'),56985));

--4. Obtenir el nom i edat dels autors que tinguin una nacionalitat concreta.

SELECT A.nom, A.edat() FROM AUTOR_TAB A WHERE A.nacionalitat.nom_nacionalitat = 'BRASILEÑO';
                      
--5. Obtenir el nom, adreça completa i els milers de llibres publicats de les editorials 
--que siguin d’una ciutat concreta.

SELECT E.nom, E.domicili.adreça_completa(),E.milers_llibres_publicats() FROM EDITORIAL_TAB E WHERE E.domicili.ciutat = 'Madrid'; 

--6. Obtenir els OBJECTES de la taula editorial_tab 
--que siguin d’una ciutat concreta.

SELECT VALUE(E) FROM EDITORIAL_TAB E WHERE E.domicili.ciutat = 'Madrid';

--7. Canviar el nom d’un autor.

UPDATE AUTOR_TAB A SET A.nom = 'Carlos' WHERE A.nif = '40000000F';

SELECT A.nom FROM AUTOR_TAB A WHERE A.nif='40000000F';

--8. Canviar el domicili d’una editorial per una altre domicili diferent.


UPDATE EDITORIAL_TAB E 
SET E.domicili = DOMICILI_TYPE('La Rambla',30,'Barceloa','08100') 
WHERE E.nom='El Vapor';

SELECT E.nom, E.domicili.adreça_completa() FROM EDITORIAL_TAB E WHERE E.nom ='El Vapor';

--9. Canviar la nacionalitat a un autor;
--AUTOR_TYPE('40000000F','Marc',TO_DATE('12/06/1989'),(SELECT REF(N) FROM NACIONALITAT_TAB N WHERE n.nom_nacionalitat = 'BRASILEÑO')));

UPDATE AUTOR_TAB A 
SET A.nacionalitat = (SELECT REF(N) FROM NACIONALITAT_TAB N WHERE N.nom_nacionalitat ='ESPAÑOLA') 
WHERE A.nif = '40000000F';

SELECT A.nacionalitat FROM AUTOR_TAB A WHERE A.nif='40000000F';

--10. Esborrar una editorial.

DELETE FROM EDITORIAL_TAB E WHERE E.nom = 'Ariel';

SELECT * FROM EDITORIAL_TAB;

--11. Esborrar tots els autors d’una nacionalitat concreta.
SELECT * FROM AUTOR_TAB; -- 2 autorees con nacionalidad ESPAÑOLA

DELETE FROM AUTOR_TAB A 
WHERE A.nacionalitat.nom_nacionalitat='ESPAÑOLA';


SELECT * FROM AUTOR_TAB; -- ahora solo queda 1 registro con nacionalidad marroqui
