import java.util.Scanner;
import java.util.Random;

public class es2 {
    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        // Esercizio 2: Scrivi un metodo che riceve un array di interi e ritorna la somma di tutti gli elementi.
        int[] numbers;
        int num, sum;

        System.out.print("\nInserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) numbers[i] = rand.nextInt(100);

        sum = arrSum(numbers);
        System.out.print("\nArray: ");
        for (int i : numbers) System.out.printf("%d ", i);

        System.out.printf("\nSomma di tutti gli elementi dell'array: %d", sum);

        input.close();
    }
}