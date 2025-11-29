import java.util.Scanner;
// import java.util.Random;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();

        // Esercizio 2: Dopo aver letto un array di numeri interi, stampa solo gli elementi che
        // compaiono una sola volta nell’array (senza usare librerie avanzate o
        // strutture dati extra, solo cicli e condizioni).
        // Funziona

        int[] arr;
        int n;
        boolean isUnique;

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

        System.out.print("\nStampa di valori unici in un array: ");
        for (int i = 0; i < arr.length; i++) {
            isUnique = true;
            for (int j = 0; j < arr.length; j++) if (arr[j] == arr[i] && i != j) isUnique = false;
            if (isUnique) System.out.printf("%d ", arr[i]);
        }

        input.close();
    }
}