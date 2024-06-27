/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_pt2;

/**
 *
 * @author mohab
 */
public class MetodosVersion5 {
    
    // Genera notes random entre 1 i 10
  public static void generadorNotas(Integer[] notesControl) {
    for (int i = 0; i < notesControl.length; i++) {
      notesControl[i] = (int) (Math.random() * 11);
    }
  }

  // Es busca el num mes gran
  public static int buscandoNumMax(Integer[] notesControl) {
    int max = 0;
    int posibleMax = -1;
    for (Integer notesControl1 : notesControl) {
      int numeroEvaluacio = notesControl1;
      if (numeroEvaluacio > posibleMax) {
        max = numeroEvaluacio;
        posibleMax = notesControl1;
      }
    }
    return max;
  }

  // Es busca el num mes petit
  public static int buscandoNumMin(Integer[] notesControl) {
    int min = 0;
    int posibleMin = 11;
    for (Integer notesControl1 : notesControl) {
      int numeroEvaluacio = notesControl1;
      if (numeroEvaluacio < posibleMin) {
        min = numeroEvaluacio;
        posibleMin = notesControl1;
      }
    }
    return min;
  }

  // Alumnos de clase
  public static void alumnosClase(int[] personasEnClase, int numeroAlumnes) {
    for (int i = 0; i < numeroAlumnes; i++) {
      personasEnClase[i] = i + 1;
    }
  }

  // notes "practiques"
  public static void notasPracticas(int[] notesPractiques) {
    for (int i = 0; i < notesPractiques.length; i++) {
      notesPractiques[i] = (int) (Math.random() * 11);
    }
  }

  // qualificacions
  public static void notasFinal(float[] notaFinal, Integer[] notesControl, int[] notesPractiques) {
    for (int i = 0; i < notesControl.length; i++) {
      notaFinal[i] = (((float) notesControl[i] + (float) notesPractiques[i]) / 2);
    }
  }

  // estadística de qualif
  public static void generadorEstadisticas(float[] estadistica, Integer[] notesControl, float[] notaFinal,
      int numeroAlumnes) {
    for (int i = 0; i < 10; i++) {
      float comptador = 0;
      float sumaNotesFinal = 0;
      for (int j = 0; j < notesControl.length; j++) {
        if ((i < notaFinal[j]) && ((i + 1) >= notaFinal[j])) {
          sumaNotesFinal += notaFinal[j];
          comptador += 1;
        }
      }
      if (comptador != 0) {
        estadistica[i] = ((float) comptador / numeroAlumnes);
      } else {
        estadistica[i] = 0;
      }
      double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
      System.out.printf("Persentatge nota tram entre %d y %d = %.1f%%\n",i,(i + 1),sol);
    }
      System.out.println("\n");
  }

  // Aprovats i suspesos
  public static int relacionAprobados(float[] notaFinal, int numeroAlumnes, int[] aprovats) {
    int cantitatAprovats = 0;
    for (int i = 0; i < numeroAlumnes; i++) {
      if (notaFinal[i] >= 5) {
        aprovats[i] = i + 1;
        cantitatAprovats += 1;
      }
    }

    return cantitatAprovats;
  }

  // Aprovats i suspesos
  public static int relacionSuspensos(float[] notaFinal, int numeroAlumnes, int[] suspesos) {
    int cantitatSuspesos = 0;
    for (int i = 0; i < numeroAlumnes; i++) {
      if (notaFinal[i] < 5) {
        suspesos[i] = i + 1;
        cantitatSuspesos += 1;
      }
    }

    return cantitatSuspesos;
  }

  // Resumen de aprovats i supesos
  public static void resumenAprobadosSuspensos(int[] aprovatsFinal, int[] suspesosFinal, int[] aprovats,
      int[] suspesos) {
    int indexAprovats = 0;
    int indexSuspesos = 0;
    for (int i = 0; i < aprovats.length; i++) {
      if (aprovats[i] != 0) {
        aprovatsFinal[indexAprovats] = aprovats[i];
        indexAprovats++;
      } else {
        suspesosFinal[indexSuspesos] = suspesos[i];
        indexSuspesos++;
      }
    }
  }

    
}
