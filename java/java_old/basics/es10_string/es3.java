// Esercizio 3: Scrivi un programma che legge nome e cognome e li stampa nel formato "COGNOME, Nome".
import java.util.Scanner;

public class es3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, surname;

        System.out.print("\nInserisci il tuo nome: ");
        name = input.next();

        System.out.print("\nInserisci il tuo cognome: ");
        surname = input.next();

        System.out.printf("%s, %s", surname.toUpperCase(), name);

        input.close();
    }
}