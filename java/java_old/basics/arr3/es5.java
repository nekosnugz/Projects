import java.util.Scanner;
import java.util.Random;

public class es5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 5: Riempendo un array con valori tra 0 e 9, conta quante volte compare ciascun numero.
        int num;
		int[] numbers, frequency;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
		frequency = new int[num];
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(9);

        for (int i : numbers) frequency[i%10]++;

        System.out.printf("\nArray originale: ");
		for (int i : numbers) System.out.printf("%d ", i);

		for (int i = 0; i < frequency.length; i++) System.out.printf("\nPresenze del numero %d: %d", i, frequency[i]);

        input.close();
    }
}