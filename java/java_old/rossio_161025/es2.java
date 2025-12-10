// Esercizio 2: Elemento Più Vicino
// Dato un array di 10 numeri interi tutti diversi fra loro e un numero inserito da tastiera,
// scrivi un metodo statico che restituisca un array di 3 elementi contenente:
// l'elemento del vettore più vicino al numero inserito, la sua posizione nell'array e la sua distanza dal numero dato.

import java.util.Scanner;
import java.util.Random;

public class es2 {
    public static void createArray(int[] a) {
        Random rand = new Random(36);
        int temp = 0;
        boolean canAdd = true;
        for (int i = 0; i < a.length; i++) {
            temp = rand.nextInt(100);
            for (int j : a) if (temp == j) canAdd = false;
            if (canAdd) a[i] = temp; else i--;
            canAdd = true;
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
                // System.out.printf("\nright = %d", center);
            }
            else if (n >= a[center]) {
                left = center;
                // System.out.printf("\nleft = %d", center);
            }
        }
        return -1;
    }

    public static int[] closestNum(int[] a, int n) {
        int pos, index = 0;
        int[] r = new int[3];
        pos = binarySearch(a,n);
        if (pos == -1) {
            for (int i = 1; i < a.length; i++) {
                if (Math.abs(a[index] - n) > Math.abs(a[i] - n)) {
                    index = i;
                }
            }

            r[0] = a[index];
            r[1] = index;
            r[2] = Math.abs(a[index] - n);

        } else {
            r[0] = a[pos];
            r[1] = pos;
            r[2] = 0;
        }
        
        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];
        int[] res;
        int num;
        createArray(arr);

        for (int i : arr) System.out.printf("%d ", i);

        System.out.print("\nInserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        res = closestNum(arr, num);
        for (int i : res) System.out.printf("%d ", i);

        input.close();
    }
}