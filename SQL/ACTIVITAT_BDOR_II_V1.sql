SET SERVEROUTPUT ON;
SET VERIFY OFF

/* 1. Codificar un programa que demani per teclat una edat i mostri per pantalla
el nom, l'edat i el nom de la seva nacionalitat, dels autors amb una edad 
superior a la introduîda.
Si no hi ha cap, s'ha de mostrar un missatge indicant-lo
*/
DECLARE
    v_edad INTEGER := &introdueix_edat;
    v_salir_bucle BOOLEAN := FALSE;

BEGIN
    
    FOR R_AUTOR IN (SELECT A.nom NOM, A.edat() EDAT, A.nacionalitat.nom_nacionalitat NACIONALITAT 
                    FROM AUTOR_TAB A
                    WHERE A.edat() > v_edad)
	LOOP
		DBMS_OUTPUT.PUT_LINE ('NOM: ' || R_AUTOR.NOM || ' EDAT: ' || R_AUTOR.EDAT || ' NACIONALITAT: ' || R_AUTOR.NACIONALITAT);
        
        v_salir_bucle :=  TRUE;
	END LOOP;
    
    IF (v_salir_bucle = FALSE)
	THEN
        DBMS_OUTPUT.PUT_LINE ('No hay ningun autor con esta edad');
	END IF;
    

END;

/* 2. Demanar el NIF d'un autor i el nom d'una nacionalitat. 
Assignar aquesta nacionalitat al autor. 
Una vegada fet el canvi s'ha de mostrar el missatge: 
L'autor XXXX ara té la nacionalitat YYYYY
on XXXX és el seu nom i YYYYY el nom de la nacionalitat.

En els següents casos s'ha de mostrar un missatge d'error indicant
què ha passat:
- Si el NIF no existeix
- Si la nacionalitat no existeix
- Si la nacionalitat és la mateixa que ja té (llavors no s'ha de fer el canvi).
- Si es produeix qualsevol altre error a la base de dades
*/

DECLARE
    v_nif_solicitado VARCHAR2(9) := '&introdueix_nif';
    v_nacionalitat_solicitado VARCHAR2(45) := '&introdueix_nacionalitat';
    v_salir_bucle BOOLEAN := FALSE;

BEGIN
    
    FOR R_AUTOR IN (SELECT A.nif NIF, A.nacionalitat.nom_nacionalitat NACIONALITAT 
                    FROM AUTOR_TAB A)
    
	LOOP
    IF (v_nif_solicitado = R_AUTOR.NIF)
	THEN
        DBMS_OUTPUT.PUT_LINE ('El nif introducio es el mismo');
	ELSIF (v_nacionalitat_solicitado = R_AUTOR.NACIONALITAT)
	THEN
		DBMS_OUTPUT.PUT_LINE ('La nacionalidad introducio es la mismo');
	ELSIF v_salari > 2000
	THEN
		v_percentatge := 1;
	END IF;
        --UPDATE AUTOR_TAB A SET A.nom = R_AUTOR.NOM WHERE A.nif = R_AUTOR.NIF;
		--DBMS_OUTPUT.PUT_LINE ('NOM: ' || R_AUTOR.NOM  || ' NACIONALITAT: ' || R_AUTOR.NACIONALITAT);
        
        v_salir_bucle :=  TRUE;
	END LOOP;
    
    
    

END;


/*3. Crear una funció anomenada comparar_importancia_editorials que a partir de dos objectes
de tipus editorial_type, torni un dels següents valors numérics:
    1: Si el valor de num_llibres_publicats del primer objecte és més gran que el
       del segon. Això significa que la primera és més important.
    0 : Si el valor de num_llibres_publicats del primer objecte és igual que el
        del segon
    -1: Si el valor de num_llibres_publicats del primer objecte és més petit que el
       del segon
       
Afegeix un bloc PL/SQL que permeti provar la función anterior.
*/



/* 4. Imagina que no saps que fa dins la funció comparar_importancia_editorials,
però que la pots utilitzar. Codificar un bloc PL/SQL que mostri les dades de 
l'editorial més important guardada a la taula EDITORIAL_TAB (només 1).
*/


