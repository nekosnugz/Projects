import java.util.Scanner;
import java.util.Random;

public class es3 {
    public static void main(String[] args) {
        // Esercizio 3: Riempio un array con N numeri (con N inserito dall'utente) con numeri double random da (X a Y)
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
    
        double[] numbers;
        int qty = 0;
        int boundX = 10, boundY = 50;

        System.out.print("Inserisci un numero: ");
        qty = input.nextInt();
        input.nextLine();

        numbers = new double[qty];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextDouble(boundX, boundY);
        }

        System.out.print("Elementi dell'array: ");
        for (double d : numbers) {
            System.out.printf("%.2f; ", d);
        }
    
        input.close();
    }
}
