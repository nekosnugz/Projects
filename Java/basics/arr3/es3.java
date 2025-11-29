import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 3: Conta quanti valori sono pari e quanti dispari nell’array.
        int num, odd = 0, even = 0;
		int[] numbers;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
        
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(99);
		
		for (int i : numbers) if (i % 2 == 0) even++; else odd++;

		System.out.printf("\nArray: ");
		for (int i : numbers) System.out.printf("%d ", i);

        System.out.printf("\nNumeri pari: %d\nNumeri dispari: %d", even, odd);

        input.close();
    }
}
