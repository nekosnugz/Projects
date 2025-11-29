import java.util.Scanner;

public class readInt {
    public static void main(String[] args) {

        // Creazione scanner
        Scanner input = new Scanner(System.in);

        // Esercizio 1: Scrivi un programma che legge un numero intero da tastiera e lo stampa
        
        int num = 0;
        System.out.print("Inserisci un numero: ");
        num = input.nextInt();
        System.out.println(String.format("Hai inserito il numero '%d'.", num));

        // Esercizio 2: Leggi il nome e cognome dell'utente e stampali su righe separate
        String name, surname;

        System.out.println("Inserisci il tuo nome: ");
        name = input.next();
        
        System.out.println("Inserisci il tuo cognome: ");
        surname = input.next();

        System.out.println(String.format("Nome: %s", name));
        System.out.println(String.format("Cognome: %s", surname));

        // Esercizio 3: Leggi due numeri decimali e stampali uno accanto all'altro sulla stessa riga.
        double decimal1, decimal2;

        System.out.println("Inserisci un numero decimale (utilizzando la virgola): ");
        decimal1 = input.nextDouble();

        System.out.println("Inserisci un'altro numero decimale (utilizzando la virgola): ");
        decimal2 = input.nextDouble();

        System.out.println(String.format("Hai inserito i seguenti numeri: %f %f", decimal1, decimal2));

        // Esercizio 4: Scrivi un programma che stampa il tuo nome 3 volte, ogni volta su una riga diversa

        // String name; -> omesso perche' variabile gia' presente
        System.out.println("Inserisci il tuo nome: ");
        name = input.next();
        
        System.out.println("Il tuo nome stampato 3 volte: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }

        // Esercizio 5: Leggi un carattere e stampalo
        char character;
        System.out.println("Inserisci un carattere: ");
        character = input.next().charAt(0); // Legge la prossima stringa e conserva soltanto il carattere all'indice 0, ovvero il primo carattere
        
        System.out.println(String.format("Hai inserito il carattere '%c'", character));

        // Esercizio 6: Stampa "Ciao" e "Mondo" sulla stessa riga separati da uno spazio.
        System.out.println("Ciao" + ' ' + "Mondo");

        // Esercizio 7: Leggi tre numeri interi e stampali uno per riga preceduti da "Numero 1:", "Numero 2:",
        int[] numbers = new int[3]; // Creo un'array di numeri di dimensione 3
        for (int i = 0; i < 3; i++) {
            input.nextLine();
            System.out.println(String.format("Inserisci il %d° numero: ", i + 1));
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Esercizio 8: Leggi una stringa contenente spazi e stampala
        input.nextLine();
        String myString;
        System.out.println("\nInserisci una stringa (anche con spazi): ");
        myString = input.nextLine();

        System.out.println(String.format("Hai inserito la stringa '%s'", myString));

        // Esercizio 9: Crea un programma che stampa il menu di un ristorante con almeno 3 piatti, formattato in modo ordinato.
        String[] menu = {"lasagne", "pizza", "patatine"};
        double[] prezzi = {12.00f, 8.50f, 4.50f};

        System.out.println("Menu' trattoria \"Da Carlo\"\nPiatti:");
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("Piatto: %20s\tPrezzo: %5.2f euro", menu[i], prezzi[i]));
        }

        // Chiusura scanner
        input.close();
    }
}