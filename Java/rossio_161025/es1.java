// Esercizio 1: Ricerca Binaria in un Array
// Crea un programma che genera casualmente un array di 20 numeri interi compresi tra 1 e 99 (senza duplicati).
// Implementa un metodo statico che riceve l'array ordinato e un numero da cercare, utilizzando l'algoritmo di ricerca binaria.
// Il metodo deve restituire la posizione dell'elemento se trovato, altrimenti -1.

import java.util.Scanner;
import java.util.Random;

public class es1 {
    public static void createArray(int[] a) {
        Random rand = new Random();
        int temp = 0;
        boolean canAdd = true;
        for (int i = 0; i < a.length; i++) {
            temp = rand.nextInt(100);
            for (int j : a) if (temp == j) canAdd = false;
            if (canAdd) a[i] = temp; else i--;
            canAdd = true;
        }
    }

    public static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] a, int n) {    // Funziona ma da sistemare
        int left = 0;
        int right = a.length - 1;
        int center;

        while (left < right) {
            center = (right - left) / 2 + left;
            if (left == center) return -1;
            if (n == a[center]) {
                return center;
            } else if (n <= a[center]) {
                right = center;
                System.out.printf("\nright = %d", center);
            }
            else if (n >= a[center]) {
                left = center;
                System.out.printf("\nleft = %d", center);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[20];
        int src, found;
        createArray(arr);
        bubbleSort(arr);

        System.out.print("\nInserisci un numero da 0 a 99: ");
        src = input.nextInt();
        input.nextLine();

        found = binarySearch(arr, src);
        System.out.print("\nArray: ");
        for (int i : arr) System.out.printf("%d ", i);

        if (found == -1) {
            System.out.printf("\nIl numero '%d' non e' presente nell'array.", src);
        } else {
            System.out.printf("\nIl numero '%d' si trova in posizione %d.", src, found);
        }

        input.close();
    }
}