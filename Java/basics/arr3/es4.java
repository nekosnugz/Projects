import java.util.Scanner;
import java.util.Random;

public class es4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 4: Crea la copia di un array e inverti la copia scambiando gli elementi.
        int num, temp;
		int[] numbers, inverted;
		
		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
		inverted = new int[num];
		
		for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(99);

        for (int i = 0; i < inverted.length; i++) {
            temp = numbers[i];
            inverted[i] = numbers[inverted.length - 1 - i];
            inverted[inverted.length - 1 - i] = temp;
        }

        System.out.printf("\nArray originale: ");
		for (int i : numbers) System.out.printf("%d ", i);

        System.out.printf("\nArray invertito: ");
		for (int i : inverted) System.out.printf("%d ", i);

        input.close();
    }
}
