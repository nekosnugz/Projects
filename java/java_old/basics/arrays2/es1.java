import java.util.Scanner;
import java.util.Random;

public class es1 {
    public static void main(String[] args) {
        // Esercizio 1: Riempio un array di 20 numeri con numeri interi random da 1 a 10. Stampo in un ciclo separato.
        Random rand = new Random();
        // Scanner input = new Scanner(System.in);

        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++) myArray[i] = rand.nextInt(10);

        System.out.print("Elementi dell'array: ");
        for (int i : myArray) System.out.printf("%d, ", i);
    }
}