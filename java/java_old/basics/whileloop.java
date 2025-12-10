import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Esercizio 1: Continua a leggere numeri dall'utente finché non inserisce 0. Stampa ogni numero letto.

        int num = 0;

        do {
            System.out.println("Inserisci un numero intero: ");
            num = input.nextInt();
            input.nextLine();

        } while (num != 0);

        // Esercizio 2: Calcola la somma di tutti i numeri da 1 a 100 usando while.

        int sum = 0, i = 0;
        
        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println(String.format("Somma dei primi 100 numeri: %d", sum));

        // Esercizio 3: Chiedi all'utente di indovinare un numero segreto (es. 7). Continua finché non indovina.
        // int num = 0; -> omesso perche' gia' dichiarato
        int secretNum = 15;

        do {
            System.out.print("Indovina il numero: ");
            num = input.nextInt();
            input.nextLine();

            if (num != secretNum) System.out.println("Numero errato, riprovare");

        } while (num != secretNum);

        System.out.println(String.format("Congratulazioni! Il numero era %d!", secretNum));

        // Esercizio 4: Stampa tutti i numeri dispari da 1 a 20 usando while.
        //int i; -> omesso perche' gia' dichiarato
        i = 1;
        
        while (i < 20) {
            System.out.println(i);
            i += 2;
        }
        
        // Esercizio 5: Crea un menu che continua finché l'utente non sceglie "uscita" (opzione 0). Mostra sempre le opzioni 1, 2, 0.
        //int num; -> omesso perche' gia' dichiarato
        num = 0;
        
        do {
            System.out.println("Menu");
            System.out.println("1. null");
            System.out.println("2. null");
            System.out.println("0. exit");
            
            System.out.print("Scegli un opzione: ");
            num = input.nextInt();
            input.nextLine();
        } while (num != 0);

        // Esercizio 6: Conta quante cifre ha un numero inserito dall'utente usando while.
        int digits = 0;
        double num1 = 0, temp = 0;

        System.out.println("Inserisci un numero intero: ");
        num1 = input.nextInt();

        while (num1 > 0) {
            digits++;
            temp = num1 / 10;
        }

        // Esercizio 7: Simula il lancio di una moneta finché non esce "testa" (usa 1 per testa, 0 per croce). Conta i lanci.
        // int num;
        do {
            System.out.println("Inserisci l'esito del lancio di una moneta (0 = croce, 1 = testa): ");
            num = input.nextInt();
        } while (num != 1);

        // Esercizio 8: Calcola la potenza di un numero usando solo addizioni ripetute in un while (es. 3^4 = 3+3+3+3+3+3+3+3+3+3+3+3).
        // int num, i;
        int power, elevated = 0;
        i = 0;
        System.out.println("Inserisci un numero: ");       
        num = input.nextInt();
        input.nextLine();

        System.out.println("Inserisci una potenza: ");       
        power = input.nextInt();
        input.nextLine();

        while (i < power) {
            for (int j = 0; j < num; j++) {
                elevated += num;
            }
        }
        elevated = elevated == 0 ? 1 : elevated;
        System.out.println(String.format("Il numero %d elevato alla %d potenza vale %d", num, power, elevated));

        // Esercizio 9: Crea un programma che chiede la password all'utente. Ha massimo 3 tentativi. Usa do-while per garantire almeno un tentativo.
        String password = "Pipis", guess;
        int numGuesses = 0;

        do {
            System.out.println("Inserisci la tua password: ");
            guess = input.next();
            if (guess.equals(password)) {
                System.out.println("Benvenuto");
                break;
            } else {
                if (numGuesses < 4) {
                    System.out.println(String.format("Password sbagliata, riprovare (%d° tentativo)", numGuesses));
                } else {
                    System.out.println("Accesso negato");
                }
            }

        } while (numGuesses < 4);

        input.close();
    }
}
