import java.util.Scanner;
import java.util.Random;

public class es5 {
    public static int countInt(int[] arr, int n) {
        int c = 0;
        for (int i : arr) c = c == i ? c+1 : c;
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Esercizio 5: Crea un metodo che riceve un array e un numero, e conta quante volte il numero appare nell'array.
        int[] numbers;
        int num, len, count;

        System.out.print("\nInserisci la lunghezza dell'array: ");
        len = input.nextInt();
        input.nextLine();

        numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) numbers[i] = rand.nextInt(10);

        System.out.print("\nInserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        System.out.print("\nArray: ");
        for (int i : numbers) System.out.printf("%d ", i);

        count = countInt(numbers, num);
        System.out.printf("\nNell'array il numero %d e' presente %d volte", num, count);

        input.close();
    }
}