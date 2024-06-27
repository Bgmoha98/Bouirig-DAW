/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5_uf2_activitat1;
import java.util.Arrays;

/**
 *
 * @author mohab
 */
public class M5_Uf2_Activitat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {50, 26, 7, 9, 15, 27};
        System.out.println("Array inicial: " + Arrays.toString(a));
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSort(a)));
    }

    public static int[] selectionSort(int[] a) {
        int count = 0;
        for (int i = a.length - 1; i >= 1; i--) {
            int largestIndex = i;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[largestIndex]) {
                    largestIndex = j;
                }
            }
            swap(a, i, largestIndex);
            
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        int count = 0;

        for (int i = 1; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    System.out.println("canvi! " + Integer.toString(++count) + "  " + Arrays.toString(a));
                    isSorted = false;
                }
            }
            if (isSorted) {
                return a;
            }
        }
        return a;
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
