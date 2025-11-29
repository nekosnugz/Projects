import java.util.Scanner;
// import java.util.Random;

public class es3 {
    public static boolean isPrime20(int n) {
        for (int i = 2; i < 20; i++) {
            if (n != i && n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Random rand = new Random();
        // Esercizio 3: Crea un metodo che verifica se un numero è primo. Testalo con un ciclo che controlla i numeri da 1 a 20.
        int num;

        System.out.print("\nInserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        if (isPrime20(num)) {
            System.out.printf("\nIl numero %d e' un numero primo", num);
        } else {
            System.out.printf("\nIl numero %d non e' un numero primo", num);
        }

        input.close();
    }
}