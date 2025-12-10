import java.util.Scanner;
import java.util.Random;

public class es8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Esercizio 8: Verifica se l’array letto al contrario coincide con quello originale.
        int num;
		int[] numbers;
        boolean isPalindrome = true;

		System.out.print("\nInserisci un numero: ");
		num = input.nextInt();
		input.nextLine();
		
		numbers = new int[num];
        for (int i = 0; i < num; i++) numbers[i] = rand.nextInt(100);
		
        System.out.print("\nArray originale\t\t: ");
        for (int i : numbers) System.out.printf("%d ", i);

        System.out.print("\nArray girato\t\t: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.printf("%d ", numbers[i]);
            isPalindrome = numbers[i] == numbers[numbers.length - 1 - i] ? false : isPalindrome;
        }
        if (isPalindrome) System.out.println("L'array e' un palindromo"); else System.out.print("\n\nL'array NON e' un palindromo");

        input.close();
    }
}