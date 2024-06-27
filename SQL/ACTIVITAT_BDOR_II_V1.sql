SET SERVEROUTPUT ON;
SET VERIFY OFF

/* 1. Codificar un programa que demani per teclat una edat i mostri per pantalla
el nom, l'edat i el nom de la seva nacionalitat, dels autors amb una edad 
superior a la introdu�da.
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
L'autor XXXX ara t� la nacionalitat YYYYY
on XXXX �s el seu nom i YYYYY el nom de la nacionalitat.

En els seg�ents casos s'ha de mostrar un missatge d'error indicant
qu� ha passat:
- Si el NIF no existeix
- Si la nacionalitat no existeix
- Si la nacionalitat �s la mateixa que ja t� (llavors no s'ha de fer el canvi).
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


/*3. Crear una funci� anomenada comparar_importancia_editorials que a partir de dos objectes
de tipus editorial_type, torni un dels seg�ents valors num�rics:
    1: Si el valor de num_llibres_publicats del primer objecte �s m�s gran que el
       del segon. Aix� significa que la primera �s m�s important.
    0 : Si el valor de num_llibres_publicats del primer objecte �s igual que el
        del segon
    -1: Si el valor de num_llibres_publicats del primer objecte �s m�s petit que el
       del segon
       
Afegeix un bloc PL/SQL que permeti provar la funci�n anterior.
*/



/* 4. Imagina que no saps que fa dins la funci� comparar_importancia_editorials,
per� que la pots utilitzar. Codificar un bloc PL/SQL que mostri les dades de 
l'editorial m�s important guardada a la taula EDITORIAL_TAB (nom�s 1).
*/


