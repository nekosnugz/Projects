// Esercizio 1: Scrivi un programma che legga da tastiera 10 numeri interi e li inserisca in un array.
// Implementa un metodo che cerchi un numero specifico nell'array e restituisca la posizione della prima occorrenza (o -1 se non trovato).
import java.util.Scanner;
// import java.util.Random;

public class es1 {
    public static int searchNum(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) return i;
        }
        return -1;
    };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();

        int[] numbers = new int[10];
        int src, index;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("\nInserisci il %d° numero: ", i+1);
            numbers[i] = input.nextInt();
            input.nextLine();
        }

        System.out.print("\nInserisci un numero da cercare: ");
        src = input.nextInt();
        input.nextLine();

        index = searchNum(numbers, src);

        if (index == -1) System.out.printf("\nIl numero %d non e' presente nell'array");
        else System.out.printf("\nLa prima occorrenza del numero %d è in posizione %d", src, index);

        input.close();
    }
}