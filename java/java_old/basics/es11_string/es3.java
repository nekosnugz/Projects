// Esercizio 3: Scrivi un programma che calcoli la media mobile di un array di temperature.
// Il metodo deve ricevere l'array e la dimensione della finestra mobile, restituendo un nuovo array con le medie calcolate.
import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void fillArray(int[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(120) - 20 + 1;
        }
    }

    public static void printArr(int[] a) {
        for (int i : a) System.out.printf("%d ", i);
        System.out.println();
    }

    public static double[] movingAvrg(int[] a) {
        double avrg = 0;
        double[] mAvrg = new double[a.length];

        return mAvrg;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[15];


        input.close();
    }
}