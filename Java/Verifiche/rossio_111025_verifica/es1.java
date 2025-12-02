import java.util.Scanner;
// import java.util.Random;

public class es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();

        // Esercizio 1: Scrivi un programma che legge un array di n numeri interi
        // e calcola la somma alternata: il primo elemento va sommato, il secondo
        // sottratto, il terzo sommato, il quarto sottratto e così via.
        // Funziona

        int[] arr;
        int n, altSum = 0;

        System.out.print("\nInserisci un numero: ");
        n = input.nextInt();
        input.nextLine();

        arr = new int[n];

        // for (int i = 0; i < n; i++) arr[i] = rand.nextInt(100);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\nInserisci il %d° numero: ", i+1);
            arr[i] = input.nextInt();
            input.nextLine();
        }

        System.out.print("\nArray: ");
        for (int i : arr) System.out.printf("%d ", i);

        System.out.printf("\n%d ", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.printf("- %d ", arr[i]);
                altSum -= arr[i];
            } else {
                System.out.printf("+ %d ", arr[i]);
                altSum += arr[i];
            }
        }
        System.out.printf("= %d", altSum);


        input.close();
    }
}