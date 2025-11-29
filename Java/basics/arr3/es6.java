import java.util.Scanner;
import java.util.Random;

public class es6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 6: Togli un elemento a una posizione casuale dall’array, spostando a sinistra i successivi (senza ricreare l’array).
        int num;
		int[] numbers;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(100);

        System.out.printf("\nArray originale: ");
		for (int i : numbers) System.out.printf("%d ", i);

        num = rand.nextInt(numbers.length);
        System.out.printf("\nRimozione dell'elemento in posizione %d", num);

        for (int i = num - 1; i < numbers.length - 1; i++) {
            if (i >= 0) numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = 0;
    
        System.out.printf("\nArray originale: ");
		for (int i = 0; i < numbers.length; i++) if (i != numbers.length - 1) System.out.printf("%d ", numbers[i]);

        input.close();
    }
}