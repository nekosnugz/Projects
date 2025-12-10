import java.util.Scanner;
import java.util.Random;

public class es4 {
    public static void main(String[] args) {
        // Esercizio 4: Dato un array di N numeri riempiti in modo casuale, trovare il minimo, il massimo e la media
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int qty = 0;
        int[] numbers;
        int min, max;
        double avrg = 0.0f;

        System.out.print("Inserisci un numero: ");
        qty = input.nextInt();
        input.nextLine();

        numbers = new int[qty];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(); 
        }

        min = numbers[0];
        max = numbers[0];
        
        System.out.print("Elementi dell'array: ");

        for (int i : numbers) {
            min = min > i ? i : min;
            max = max < i ? i : max;
            avrg += i;
            System.out.println(i);
        }

        avrg /= numbers.length;

        System.out.printf("\nValore minimo: %d", min);
        System.out.printf("\nValore massimo: %d", max);
        System.out.printf("\nValore medio: %.2f", avrg);

        input.close();
    }
}