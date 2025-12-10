import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Esercizio 0: Stampa i numeri pari da 2 a 20.
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i + " ");
        }

        // Esercizio 1: Calcola e stampa la somma dei primi 10 numeri naturali.

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println(String.format("Somma dei primi 10 numeri naturali: %d", sum));
        
        // Esercizio 2: Stampa la tabellina del 7.

        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format("7 x %2d = %3d", i, i * 7));
        }

        // Esercizio 3: Leggi un numero n e stampa tutti i numeri da n a 1 in ordine decrescente

        int num;
        
        System.out.println("Inserisci un numero intero: ");
        num = input.nextInt();
        input.nextLine();
        
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }

        // Esercizio 4: Calcola il fattoriale di un numero inserito dall'utente

        // int num; -> omesso perche' gia' dichiarato
        int factorial;

        System.out.println("Inserisci un numero intero positivo: ");
        num = input.nextInt();
        input.nextLine();

        factorial = num;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println(String.format("%d! = %d", num, factorial));

        // Esercizio 5: Stampa un quadrato di asterischi 5x5.

        int dim = 5;
        
        for (int row = 0; row < dim; row++) {
            for (int col = 0; col < dim; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Esercizio 6: Leggi n numeri dall'utente e calcola la loro media

        // int num; -> omesso perche' gia' dichiarato
        double average = 0;
        
        System.out.println("Inserisci un numero: ");
        num = input.nextInt();
        input.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println(String.format("Inserisci il %d° numero: ", i + 1));
            average += input.nextInt();
            input.nextLine();
        }

        average /= num;

        System.out.println(String.format("La media dei numeri inseriti e' %.2f", average));

        // Esercizio 7: Stampa i primi 10 numeri della sequenza di Fibonacci (0, 1, 1, 2, 3, 5, 8, ...)

        int fibQuantity = 10;
        int[] fib = new int[fibQuantity];

        for (int i = 0; i < fibQuantity; i++) {
            if (i == 0) {
                fib[i] = 0;
            
            } else if (i == 1) {
                fib[i] = 1;
            
            } else {
                fib[i] = fib[i-1] + fib[i-2];
            }
        }

        System.out.println(String.format("Il %dimo numero di Fibonacci e' '%d'", fibQuantity, fib[fibQuantity-1]));



        // Esercizio 8: Crea un menu che si ripete 3 volte chiedendo all'utente di inserire un numero e ne stampa il quadrato.

        // int num; -> omesso perche' gia' dichiarato

        for (int i = 0; i < 3; i++) {
            System.out.println("Inserisci un numero: ");
            num = input.nextInt();
            input.nextLine();
            System.out.println(String.format("Il quadrato del numero '%d' e' '%d'", num, num * num));

        }

        input.close();
    }
}