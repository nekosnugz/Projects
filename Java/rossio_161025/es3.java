// Esercizio 3: Filtraggio Array con Condizioni
// Crea un metodo statico che riceve come parametri un array di numeri interi e un intero positivo k.
// Il metodo deve restituire un nuovo array contenente solo gli elementi dell'array originale che sono maggiori di k e multipli di 3.
// Il programma deve gestire l'allocazione dinamica del nuovo array in base al numero di elementi che soddisfano la condizione.

import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void createArray(int[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) a[i] = rand.nextInt(100);
    }

    public static int[] arrFilter(int[] a, int n) {
        int j = 0;
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] > n) {
                res[j] = a[i];
                j++;
            }
        }
        return res;

    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr, result;
        int num;

        System.out.print("\nInserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        arr = new int[num];

        System.out.print("\nInserisci un numero filtro: ");
        num = input.nextInt();
        input.nextLine();

        result = arrFilter(arr, num);

        System.out.print("\nArray: ");
        for (int i : arr) System.out.printf("%d ", i);
        System.out.print("\nArray di numeri filtrati: ");
        for (int i : result) System.out.printf("%d ", i);


        input.close();
    }
}