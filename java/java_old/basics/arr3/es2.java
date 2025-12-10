import java.util.Scanner;
import java.util.Random;

public class es2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 2: Crea un array come sopra, trova il minimo e il massimo e le loro posizioni.

        int num;
		int[] numbers;
        int min = 0, max = 0, minIndex = 0, maxIndex = 0;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(99);

        for (int i = 0; i < num; i++) {
            min = min > numbers[i] ? numbers[i] : min;
            minIndex = min > numbers[i] ? i : minIndex;
            max = max > numbers[i] ? numbers[i] : max;
            maxIndex = max > numbers[i] ? i : maxIndex;
        }

        System.out.printf("\nArray: ");
		for (int i : numbers) System.out.printf("%d ", i);
		
		System.out.printf("\nValore massimo: %3d | Indice del valore: %3d", max, maxIndex);
		System.out.printf("\nValore minimo : %3d | Indice del valore: %3d", max, maxIndex);

        input.close();
    }
}
