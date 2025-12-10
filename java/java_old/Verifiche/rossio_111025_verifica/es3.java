import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 3: Dato un array di n numeri interi, trova il secondo valore più piccolo
        // Funziona

        int[] arr;
        int n, min, secondMin;

        System.out.print("\nInserisci un numero: ");
        n = input.nextInt();
        input.nextLine();

        arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(100);
        // for (int i = 0; i < n; i++) {
        //     System.out.printf("\nInserisci il %d° numero: ", i+1);
        //     arr[i] = input.nextInt();
        //     input.nextLine();
        // }

        min = arr[0];
        secondMin = min;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            }
        }

        System.out.print("\nArray: ");
        for (int i : arr) System.out.printf("%d ", i);

        System.out.printf("\nValore piu' piccolo: %d", min);
        System.out.printf("\nSecondo valore piu' piccolo: %d", secondMin);

        input.close();
    }
}