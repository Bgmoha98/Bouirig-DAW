/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_pt2;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author mohab
 */
public class M5_Pt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroAlumnes = 40;

    // vector de notes generades
    Integer[] notesControl = new Integer[numeroAlumnes];
    int indexMaxNota, indexMinNota;

    // Genera notes random entre 1 i 10
    MetodosVersion5.generadorNotas(notesControl);

    // Es busca la mes petita
    int min = MetodosVersion5.buscandoNumMin(notesControl);

    // Es busca la mes gran
    int max = MetodosVersion5.buscandoNumMax(notesControl);

    // Alumnes de la classe
    int[] personasEnClase = new int[numeroAlumnes];
    MetodosVersion5.alumnosClase(personasEnClase, numeroAlumnes);

    // Lista per a facilitar us de index
    List<Integer> notes = Arrays.asList(notesControl);
    indexMinNota = notes.indexOf(min) + 1;
    indexMaxNota = notes.indexOf(max) + 1;

    // Comprobem
    System.out.println("El numero mínim és: " + min);
    System.out.println("El numero màxim és: " + max + "\n");
    System.out.println("Index del numero mínim és: " + indexMinNota);
    System.out.println("Index del numero màxim és: " + indexMaxNota + "\n");
    System.out.println("Lista de classe:" + Arrays.toString(personasEnClase));
    System.out.println("Array de Notes:\t" + notes + "\n");

    // notes "practiques"
    int[] notesPractiques = new int[numeroAlumnes];
    MetodosVersion5.notasPracticas(notesPractiques);

    // qualificacions
    float[] notaFinal = new float[numeroAlumnes];
    MetodosVersion5.notasFinal(notaFinal, notesControl, notesPractiques);

    System.out.println("Práctiques:\t" + Arrays.toString(notesPractiques));
    System.out.println("Qualificacions:\t" + Arrays.toString(notaFinal) + "\n");

    // estadística de qualif
    float[] estadistica = new float[10];
    MetodosVersion5.generadorEstadisticas(estadistica, notesControl, notaFinal, numeroAlumnes);

    // Aprovats i suspesos
    int[] aprovats = new int[numeroAlumnes];
    int[] suspesos = new int[numeroAlumnes];
    int cantitatAprovats = MetodosVersion5.relacionAprobados(notaFinal, numeroAlumnes, aprovats);
    int cantitatSuspesos = MetodosVersion5.relacionSuspensos(notaFinal, numeroAlumnes, suspesos);

    System.out.println("Relació d'aprovats per nº de llista: "
        + Arrays.toString(aprovats));
    System.out.println("Relació de suspesos per nº de lista: "
        + Arrays.toString(suspesos) + "\n");

    // Resumen de aprovats i supesos
    int[] aprovatsFinal = new int[cantitatAprovats];
    int[] suspesosFinal = new int[cantitatSuspesos];
    MetodosVersion5.resumenAprobadosSuspensos(aprovatsFinal, suspesosFinal, aprovats, suspesos);
    System.out.println("Aprovats per nº de llista: "
        + Arrays.toString(aprovatsFinal));
    System.out.println("Suspesos per nº de llista: "
        + Arrays.toString(suspesosFinal) + "\n");

    }
    
}
