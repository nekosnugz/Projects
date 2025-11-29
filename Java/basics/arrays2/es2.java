import java.util.Scanner;
import java.util.Random;

public class es2 {
    public static void main(String[] args) {
        // Esercizio 2: Riempio un array con N numeri (con N inserito dall'utente) con numeri interi random da 1 a 10. Stampo in un ciclo separato.
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int qty = 0;
        int[] numbers;

        System.out.print("Inserisci un numero: ");
        qty = input.nextInt();
        input.nextLine();

        numbers = new int[qty];

        for (int i = 0; i < qty; i++) numbers[i] = rand.nextInt(10);

        System.out.print("Elementi dell'array: ");
        for (int i : numbers) System.out.printf("%d, ", i);
        
        input.close();
    }
}
