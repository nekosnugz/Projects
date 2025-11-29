// Esercizio 2: Crea un programma che riempia un array di 15 numeri casuali (da 1 a 100) e implementa
// un metodo per ordinare l'array in ordine crescente usando l'algoritmo bubble sort.
import java.util.Scanner;
import java.util.Random;

public class es2 {
    public static void fillArray(int[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100) + 1;
        }
    }

    public static void printArr(int[] a) {
        for (int i : a) System.out.printf("%d ", i);
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[15];

        fillArray(arr);

        printArr(arr);

        bubbleSort(arr);

        printArr(arr);

        input.close();
    }
}