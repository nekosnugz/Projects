// Esercizio 3: Crea un programma che legge un indice per un array e gestisce l'accesso fuori dai limiti.
import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void fillArr(int[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) a[i] = r.nextInt(100);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[8];
        fillArr(arr);

        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.printf("%d ", arr[i]);
            }
        } catch (Exception e) {
            System.out.println("\n" + e);
            // System.out.println("\nIndice dell'array non valido");
        }

        input.close();
    }
}