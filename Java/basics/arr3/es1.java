import java.util.Scanner;
import java.util.Random;

public class es1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		// Esercizio 1: Crea un array di N interi (N a piacere), riempilo con numeri casuali tra 0 e 99.
		// Calcola la somma e la media degli elementi.
		
		int num;
		int[] numbers;
		double sum = 0, avrg = 0;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(99);
		
		for (int i : numbers) sum += i;
		avrg = sum / num;
		
		System.out.printf("\nArray: ");
		for (int i : numbers) System.out.printf("%d ", i);
		
		System.out.printf("\nSomma di tutti gli elementi: %.0f", sum);
		System.out.printf("\nMedia di tutti gli elementi: %.2f", avrg);
		
		input.close();
	}
}